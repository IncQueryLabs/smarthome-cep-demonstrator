package com.incquerylabs.smarthome.viatra;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

public class QueryRunner implements IApplication {

    BatchViatra viatra;

    @Override
    public Object start(IApplicationContext arg0) throws Exception {
        // TODO Auto-generated method stub
        viatra = new BatchViatra();
        viatra.initialize();
        viatra.execute();
        return 0;
    }

    @Override
    public void stop() {
        viatra.dispose();
        // TODO Auto-generated method stub

    }

}
