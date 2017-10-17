package com.incquerylabs.smarthome.viatra.rules

import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRule
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.SimpleModelManipulations
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations
import com.incquerylabs.smarthome.viatra.SmartHomeRulesMatcher
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRuleFactory
import org.apache.log4j.Logger
import com.incquerylabs.smarthome.viatra.RulesMatcher

class RuleProvider {
    
    extension IModelManipulations manipulation
    extension BatchTransformationRuleFactory = new BatchTransformationRuleFactory
    extension Logger logger = Logger.getLogger("smarthome.viatra")
    
    BatchTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> smarthomeRule
    BatchTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> rulesRule
    
    private var ruleId = 0;
    
    ViatraQueryEngine engine
    
    new(ViatraQueryEngine engine) {
        this.engine = engine
        manipulation = new SimpleModelManipulations(engine)
    }
    
    
    public def getSmarthomeRule() {
        if (smarthomeRule === null) {
            smarthomeRule = createRule.name("SmarthomeRule").precondition(SmartHomeRulesMatcher.querySpecification).action[
                val smarthomeName = it.smarthome.name
                val numRules = it.smarthome.rules.size
                
               
                debug('''Smarthome name: «smarthomeName»''')
                debug('''Smarthome number of rules: «numRules»''')
            ].build
        }
        return smarthomeRule
    }
    
    
    public def getRulesRule() {
                if (rulesRule === null) {
            rulesRule = createRule.name("FilterRule").precondition(RulesMatcher.querySpecification).action[
                val node = it.evaluatingNode;
                ruleId++;
                debug('''
                package homeioexample;
                
                rule "Rule «ruleId»"
                    when 
                         «FOR command : node.commands»
                         Item( name == "«command.item.name»" )
                         «ENDFOR»
                         
                         «FOR filter : node.filters»
                         Item( name == "«filter.item.name»", state == «filter.requiredState.state» )
                         «ENDFOR»
                         
                         ItemStateChaneEvent( 
                         «FOR event : node.events SEPARATOR ' || '»
                         ( name == "«event.item.name»" && state == «event.newState.state» )
                         «ENDFOR» 
                         )
                         
                     then
                        «FOR command : node.commands»
                        openhab.postCommand("«command.item.name»", «command.command»);
                        «ENDFOR»
                end
                ''')
                
            ].build
        }
        return rulesRule
    }
}