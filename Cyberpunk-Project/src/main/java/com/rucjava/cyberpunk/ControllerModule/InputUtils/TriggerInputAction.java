package com.rucjava.cyberpunk.ControllerModule.InputUtils;

import com.almasb.fxgl.input.Input;
import com.almasb.fxgl.input.Trigger;
import com.almasb.fxgl.input.TriggerListener;

public class TriggerInputAction {
    private TriggerListener myListener;

    public TriggerInputAction() {
        this.myListener = new TriggerListener() {
            @Override
            protected void onAction(Trigger trigger) {
                super.onAction(trigger);
            }

            @Override
            protected void onActionBegin(Trigger trigger) {
                super.onActionBegin(trigger);
            }

            @Override
            protected void onActionEnd(Trigger trigger) {
                super.onActionEnd(trigger);
            }
        };
    }

    public void registerTrigger() {
        Input input = new Input();
        input.addTriggerListener(myListener);
    }
}
