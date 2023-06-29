package com.rucjava.cyberpunk.ControllerModule.InputUtils;

import com.almasb.fxgl.input.Input;
import com.almasb.fxgl.input.UserAction;
import com.rucjava.cyberpunk.ControllerModule.EventQueue;
import com.rucjava.cyberpunk.ControllerModule.LocalEvent;
import com.rucjava.cyberpunk.ControllerModule.LocalEventType;
import javafx.scene.input.KeyCode;

public class KeyInputAction {
    EventQueue eventQueue;
    private UserAction keyA;
    private UserAction keyS;
    private UserAction keyW;
    private UserAction keyD;
    private UserAction keyE;

    public KeyInputAction(EventQueue eventQueue) {
        this.eventQueue = eventQueue;
        initKeyA();
        initKeyD();
        initKeyS();
        initKeyW();
    }

    private void initKeyA() {
        this.keyA = new UserAction("KEY-A") {
            @Override
            protected void onActionBegin() {
                eventQueue.addEvent(new LocalEvent(LocalEventType.KEY_A_BEGIN));
            }
            @Override
            protected void onAction() {
                eventQueue.addEvent(new LocalEvent(LocalEventType.KEY_A_ON));
            }

            @Override
            protected void onActionEnd() {
                eventQueue.addEvent(new LocalEvent(LocalEventType.KEY_A_END));
            }
        };
    }

    private void initKeyS() {
        this.keyS = new UserAction("KEY-S") {
            @Override
            protected void onActionBegin() {
                eventQueue.addEvent(new LocalEvent(LocalEventType.KEY_S_BEGIN));
            }

            @Override
            protected void onAction() {
                eventQueue.addEvent(new LocalEvent(LocalEventType.KEY_S_ON));
            }

            @Override
            protected void onActionEnd() {
                eventQueue.addEvent(new LocalEvent(LocalEventType.KEY_S_BEGIN));
            }
        };
    }

    private void initKeyW() {
        this.keyW = new UserAction("KEY-W") {
            @Override
            protected void onActionBegin() {
                eventQueue.addEvent(new LocalEvent(LocalEventType.KEY_W_BEGIN));
            }
            @Override
            protected void onAction() {
                eventQueue.addEvent(new LocalEvent(LocalEventType.KEY_W_ON));
            }

            @Override
            protected void onActionEnd() {
                eventQueue.addEvent(new LocalEvent(LocalEventType.KEY_W_END));
            }
        };
    }

    private void initKeyD() {
        this.keyD = new UserAction("KEY-D") {
            @Override
            protected void onActionBegin() {
                eventQueue.addEvent(new LocalEvent(LocalEventType.KEY_D_BEGIN));
            }
            @Override
            protected void onAction() {
                eventQueue.addEvent(new LocalEvent(LocalEventType.KEY_D_ON));
            }

            @Override
            protected void onActionEnd() {
                eventQueue.addEvent(new LocalEvent(LocalEventType.KEY_D_END));
            }
        };
    }

    private void initKeyE() {
        this.keyE = new UserAction("KEY-E") {
            @Override
            protected void onActionBegin() {
                eventQueue.addEvent(new LocalEvent(LocalEventType.KEY_E_BEGIN));
            }
            @Override
            protected void onAction() {
                eventQueue.addEvent(new LocalEvent(LocalEventType.KEY_E_ON));
            }

            @Override
            protected void onActionEnd() {
                eventQueue.addEvent(new LocalEvent(LocalEventType.KEY_E_END));
            }
        };
    }

    public void registerAllKeys(Input input) {
        input.addAction(this.keyA, KeyCode.A);
        input.addAction(this.keyD, KeyCode.D);
        input.addAction(this.keyW, KeyCode.W);
        input.addAction(this.keyS, KeyCode.S);
    }
}
