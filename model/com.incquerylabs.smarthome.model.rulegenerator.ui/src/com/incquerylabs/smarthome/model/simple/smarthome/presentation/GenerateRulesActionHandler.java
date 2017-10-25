package com.incquerylabs.smarthome.model.simple.smarthome.presentation;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import com.incquerylabs.smarthome.viatra.QueryRunner;

public class GenerateRulesActionHandler extends AbstractHandler {

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        QueryRunner viatraQueryRunner = new QueryRunner();
        try {
            viatraQueryRunner.start(null);
            viatraQueryRunner.stop();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
