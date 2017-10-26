package com.incquerylabs.smarthome.viatra

import com.google.common.base.Stopwatch
import java.util.concurrent.TimeUnit
import org.apache.log4j.Logger
import com.incquerylabs.smarthome.viatra.Example
import com.incquerylabs.smarthome.viatra.rules.RuleProvider
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.transformation.runtime.emf.transformation.batch.BatchTransformation
import org.eclipse.viatra.transformation.runtime.emf.transformation.batch.BatchTransformationStatements
import org.eclipse.emf.ecore.resource.Resource
import com.incquerylabs.smarthome.model.simple.smarthome.SmartHome
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import com.incquerylabs.smarthome.model.simple.smarthome.SmarthomePackage
import org.eclipse.emf.common.util.URI
import org.eclipse.viatra.query.runtime.emf.EMFScope
import org.eclipse.core.resources.ResourcesPlugin

class BatchViatra {
    
    extension Logger logger = Logger.getLogger("cps.xform.m2m.batch.viatra")
    
    extension Example exampleM2T = Example.instance
    extension RuleProvider ruleProvider
    extension BatchTransformation transformation
    extension BatchTransformationStatements statements
    
    private static final String instanceModelProject = "com.incquerylabs.smarthome.model.rules";
    private static final String instanceModel = "HomeIO_Rules.smarthome";
    
    ViatraQueryEngine engine
    
    
    private var initialized = false;
    
    def initialize() {
        initialize(false, null)
    }
    
    
    def initialize(boolean isDebuggable, String debugName) {
        if (!initialized) {
            val scope = loadModel();
            this.engine = ViatraQueryEngine.on(scope);
            ruleProvider = new RuleProvider(engine)
            
            val transformationBuilder = BatchTransformation.forEngine(engine)

            transformation = transformationBuilder.build
            statements = transformation.transformationStatements
            
            debug("Preparing queries on engine.")
            var watch = Stopwatch.createStarted
            prepare(engine)
            debug('''Prepared queries on engine («watch.elapsed(TimeUnit.MILLISECONDS)» ms''')
            
            debug('''Preparing transformation rules.''')
            watch = Stopwatch.createStarted
            
            debug('''Prepared transformation rules («watch.elapsed(TimeUnit.MILLISECONDS)» ms)''')
            initialized = true
            println("Initialized engine")
        }
    }
    
    def loadModel() {
        // Initialize the model
        SmarthomePackage.eINSTANCE.eClass();

        // Register the XMI resource factory for the .website extension

        val reg = Resource.Factory.Registry.INSTANCE;
        val m = reg.getExtensionToFactoryMap();
        m.put("smarthome", new XMIResourceFactoryImpl());

        // Obtain a new resource set
        val resSet = new ResourceSetImpl();

     
        // Get model file path
        val workspace = ResourcesPlugin.getWorkspace()
        val root = workspace.getRoot()
        val project = root.getProject(instanceModelProject)
        val file = project.getFile(instanceModel)
        
        // Get the resource
        val resource = resSet.getResource(URI
                .createFileURI(file.getFullPath().toOSString()), true);
        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
        val mySmarthome = resource.getContents().get(0) as SmartHome;
        println("loaded model")
        return new EMFScope(mySmarthome);
    }
    
    
    
    def execute(){
        smarthomeRule.fireAllCurrent
        rulesRule.fireAllCurrent
        println("Executed queries")
    }
    
    
    def dispose() {
        transformation = null
        println("disposed engine")
        return
    }
}