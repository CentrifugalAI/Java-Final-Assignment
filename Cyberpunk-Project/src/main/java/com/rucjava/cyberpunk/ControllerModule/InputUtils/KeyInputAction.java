package com.rucjava.cyberpunk.ControllerModule.InputUtils;

import com.almasb.fxgl.input.Input;
import com.almasb.fxgl.input.UserAction;
import javafx.scene.input.KeyCode;

public class KeyInputAction {
    private UserAction keyA;
    private UserAction keyS;
    private UserAction keyW;
    private UserAction keyD;
    private UserAction keyE;

    public KeyInputAction() {
        initKeyA();
        initKeyD();
        initKeyS();
        initKeyW();
    }

    private void initKeyA() {
        this.keyA = new UserAction("KEY-A") {
            @Override
            protected void onActionBegin() {

            }
            @Override
            protected void onAction() {

            }

            @Override
            protected void onActionEnd() {

            }
        };
    }

    private void initKeyS() {
        this.keyS = new UserAction("KEY-S") {
            @Override
            protected void onActionBegin() {

            }
            @Override
            protected void onAction() {

            }

            @Override
            protected void onActionEnd() {

            }
        };
    }

    private void initKeyW() {
        this.keyW = new UserAction("KEY-W") {
            @Override
            protected void onActionBegin() {

            }
            @Override
            protected void onAction() {

            }

            @Override
            protected void onActionEnd() {

            }
        };
    }

    private void initKeyD() {
        this.keyD = new UserAction("KEY-D") {
            @Override
            protected void onActionBegin() {

            }
            @Override
            protected void onAction() {

            }

            @Override
            protected void onActionEnd() {

            }
        };
    }

    private void initKeyE() {
        this.keyE = new UserAction("KEY-E") {
            @Override
            protected void onActionBegin() {

            }
            @Override
            protected void onAction() {

            }

            @Override
            protected void onActionEnd() {

            }
        };
    }

    public void registerAllKeys() {
        Input input = new Input();
        input.addAction(this.keyA, KeyCode.A);
        input.addAction(this.keyD, KeyCode.D);
        input.addAction(this.keyW, KeyCode.W);
        input.addAction(this.keyS, KeyCode.S);
    }
}
