package com.incquerylabs.smarthome.model.rulegenerator.ui;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IContributionManager;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import com.incquerylabs.smarthome.model.rulegenerator.QueryRunner;
import com.incquerylabs.smarthome.model.simple.smarthome.presentation.SmarthomeActionBarContributor;
import com.incquerylabs.smarthome.model.simple.smarthome.presentation.SmarthomeEditorPlugin;

public class SmarthomeActionBarContributorExtended extends SmarthomeActionBarContributor {

    private static final String GENERATE_MENU_ITEM = "Generate...";

    protected IAction generateRulesAction = new Action("Generate rules") {
        @Override
        public void run() {
            SmarthomeEditorPlugin.INSTANCE.log("Starting to generate rules...");
            QueryRunner viatraQueryRunner = new QueryRunner();
            try {
                viatraQueryRunner.start(null);
                viatraQueryRunner.stop();
                SmarthomeEditorPlugin.INSTANCE.log("Successfully generated rules!");
            } catch (Exception exception) {
                SmarthomeEditorPlugin.INSTANCE.log(exception);
            }
        }
    };

    protected Collection<IAction> generateActions;
    protected IMenuManager generateMenuManager;

    public SmarthomeActionBarContributorExtended() {
        super();
        generateActions = new ArrayList<IAction>();
        generateActions.add(generateRulesAction);
    }

    @Override
    public void contributeToMenu(IMenuManager menuManager) {
        super.contributeToMenu(menuManager);

        IMenuManager submenuManager = new MenuManager(
                SmarthomeEditorPlugin.INSTANCE.getString("_UI_SmarthomeEditor_menu"),
                "com.incquerylabs.smarthome.model.simple.smarthomeMenuID");
        menuManager.insertAfter("additions", submenuManager);
        submenuManager.add(new Separator("additions"));

        // Prepare for CreateSibling item addition or removal.
        //
        generateMenuManager = new MenuManager(GENERATE_MENU_ITEM);
        submenuManager.insertBefore("additions", generateMenuManager);

        // Force an update because Eclipse hides empty menus now.
        //
        submenuManager.addMenuListener(new IMenuListener() {
            @Override
            public void menuAboutToShow(IMenuManager menuManager) {
                menuManager.updateAll(true);
            }
        });
    }

    @Override
    protected void depopulateManager(IContributionManager manager, Collection<? extends IAction> actions) {
        super.depopulateManager(manager, actions);

        if (actions != null) {
            // TODO ?
        }
    }

    @Override
    public void menuAboutToShow(IMenuManager menuManager) {
        super.menuAboutToShow(menuManager);
        MenuManager submenuManager = null;

        submenuManager = new MenuManager(GENERATE_MENU_ITEM);
        populateManager(submenuManager, generateActions, null);
        menuManager.insertBefore("edit", submenuManager);
    }

}
