package com.rucjava.cyberpunk.ControllerModule.InputUtils;

import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.input.Input;
import com.almasb.fxgl.input.Trigger;
import com.almasb.fxgl.input.TriggerListener;
import com.rucjava.cyberpunk.ControllerModule.EventQueue;
import com.rucjava.cyberpunk.ControllerModule.LocalEvent;
import com.rucjava.cyberpunk.ControllerModule.LocalEventType;
import javafx.geometry.Point2D;

public class TriggerInputAction {
    private TriggerListener myListener;
    private EventQueue eventQueue;

    public TriggerInputAction(EventQueue eventQueue) {
        this.eventQueue = eventQueue;
        this.myListener = new TriggerListener() {
            @Override
            protected void onAction(Trigger trigger) {
                Input input = FXGL.getInput();
                Point2D mousePositionWorld = input.getMousePositionWorld();
                Point2D mousePositionUI = input.getMousePositionUI();
                eventQueue.addEvent(new LocalEvent(LocalEventType.TRIGGER_ON, mousePositionWorld, mousePositionUI));
            }

            @Override
            protected void onActionBegin(Trigger trigger) {
                Input input = FXGL.getInput();
                Point2D mousePositionWorld = input.getMousePositionWorld();
                Point2D mousePositionUI = input.getMousePositionUI();
                eventQueue.addEvent(new LocalEvent(LocalEventType.TRIGGER_BEGIN, mousePositionWorld, mousePositionUI));
            }

            @Override
            protected void onActionEnd(Trigger trigger) {
                Input input = FXGL.getInput();
                Point2D mousePositionWorld = input.getMousePositionWorld();
                Point2D mousePositionUI = input.getMousePositionUI();
                eventQueue.addEvent(new LocalEvent(LocalEventType.TRIGGER_END, mousePositionWorld, mousePositionUI));
            }
        };
    }

    public void registerTrigger(Input input) {
        input.addTriggerListener(myListener);
    }
}
