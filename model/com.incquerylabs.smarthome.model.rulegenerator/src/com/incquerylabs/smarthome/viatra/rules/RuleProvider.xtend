package com.incquerylabs.smarthome.viatra.rules

import org.eclipse.core.resources.ResourcesPlugin
import com.incquerylabs.smarthome.viatra.SmartHomeRulesMatcher
import org.apache.log4j.Logger
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.SimpleModelManipulations
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRule
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRuleFactory
import org.eclipse.core.resources.IResource
import java.io.ByteArrayInputStream
import com.incquerylabs.smarthome.viatra.GeneralRulesMatcher

class RuleProvider {

    extension IModelManipulations manipulation
    extension BatchTransformationRuleFactory = new BatchTransformationRuleFactory
    extension Logger logger = Logger.getLogger("smarthome.viatra")

    BatchTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> smarthomeRule
    BatchTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> generalRulesRule
	BatchTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> changeStateRulesRule
	
    private var ruleId = 0;
    private static final String destinationProject = "com.incquerylabs.smarthome.model.rules";
    private static final String rulePackageName = "genrules";

    ViatraQueryEngine engine

    new(ViatraQueryEngine engine) {
        this.engine = engine
        manipulation = new SimpleModelManipulations(engine)
    }

    def writeToFile(String fileName, String fileContent) {
        val workspace = ResourcesPlugin.getWorkspace()
        
        val root = workspace.getRoot()
        val project = root.getProject(destinationProject)
        val folder = project.getFolder("src/main/resources/gen-rules")
        val file = folder.getFile(fileName)

        if (!project.exists()) {
            project.create(null)
        }
        if (!project.isOpen()) {
            project.open(null)
        }
        if (!folder.exists()) {
            folder.create(IResource.NONE, true, null)
        }
        if (file.exists() ) {
            file.delete(true, null)
        }
        val source = new ByteArrayInputStream(fileContent.getBytes())
        file.create(source, IResource.NONE, null)
        
        workspace.save(true,null)
    }

    public def getSmarthomeRule() {
        if (smarthomeRule === null) {
            smarthomeRule = createRule.name("SmarthomeRule").precondition(SmartHomeRulesMatcher.querySpecification).
                action [
                    val smarthomeName = it.smarthome.name
                    val numRules = it.smarthome.rules.size

                    debug('''Smarthome name: «smarthomeName»''')
                    debug('''Smarthome number of rules: «numRules»''')
                ].build
        }
        return smarthomeRule
    }

    public def getGeneralRulesRule() {
        if (generalRulesRule === null) {
            generalRulesRule = createRule.name("FilterRule").precondition(GeneralRulesMatcher.querySpecification).action [
                val node = it.evaluatingNode;
                ruleId++;
                
                val ruleName = '''Rule_«ruleId»'''
                val rule = 
                '''
                    package «rulePackageName»
                    
                    rule "«ruleName»"
                        when 
                             «FOR command : node.commands»
                                 Item( name == "«command.item.name»" )
                             «ENDFOR»
                             
                             «FOR filter : node.filters»
                                 Item( name == "«filter.item.name»", state == «filter.requiredState.state» )
                             «ENDFOR»
                             
                             ItemStateChangedEvent( 
                             «FOR event : node.events SEPARATOR ' || '»
                                 ( name == "«event.item.name»" && newState == «event.newState.state» )
                             «ENDFOR» 
                             )
                             
                         then
                            «FOR command : node.commands»
                                openhab.postCommand("«command.item.name»", «command.command.command»);
                            «ENDFOR»
                    end
                '''
                
                debug(rule)
                writeToFile(ruleName+".drl",rule)

            ].build
        }
        return generalRulesRule
    }
    
        public def getChangeStateRulesRule() {
        if (changeStateRulesRule === null) {
            changeStateRulesRule = createRule.name("FilterRule").precondition(GeneralRulesMatcher.querySpecification).action [
                val node = it.evaluatingNode;
                ruleId++;
                
                var i = 1
                var j = 1
                
                val ruleName = '''Rule_«ruleId»'''
                val rule = 
                '''
                    package «rulePackageName»
                    
                    rule "«ruleName»"
                        when 
                             «FOR command : node.commands»
                                 Item( name == "«command.item.name»", $itemState«i++» : state )
                             «ENDFOR»
                             
                             «FOR filter : node.filters»
                                 Item( name == "«filter.item.name»", state == «filter.requiredState.state» )
                             «ENDFOR»
                             
                             ItemStateChangedEvent( 
                             «FOR event : node.events SEPARATOR ' || '»
                                 ( name == "«event.item.name»" && newState == «event.newState.state» )
                             «ENDFOR» 
                             )
                             
                         then
                            «FOR command : node.commands»
                            if($itemState«j++» == ON) {
                                openhab.postCommand("«command.item.name»", OFF);
                            } else {
                            	openhab.postCommand("«command.item.name»", ON);
                            }
                            «ENDFOR»
                    end
                '''
                
                debug(rule)
                writeToFile(ruleName+".drl",rule)

            ].build
        }
        return changeStateRulesRule
    }
}
