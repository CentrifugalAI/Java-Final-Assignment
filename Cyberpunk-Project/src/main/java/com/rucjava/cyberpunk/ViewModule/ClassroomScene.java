package com.rucjava.cyberpunk.ViewModule;

import com.almasb.fxgl.dsl.FXGL;
import javafx.scene.SubScene;

public class ClassroomScene implements BasicScene {

    public ClassroomScene() {

    }

    @Override
    public void setAsMainScene() {
        // clear original entities
        FXGL.getGameWorld().getEntitiesCopy().forEach(t -> t.removeFromWorld());
        // set new map
        FXGL.setLevelFromMap("");
        // add new characters
        addOtherCharactersToGameWorld();
        // add self
        addMainCharacterToScene();
    }

    @Override
    public SceneType getSwitchTargetScene() {
        return SceneType.ChatRoom;
    }

    @Override
    public void addMainCharacterToScene() {

    }

    @Override
    public void addOtherCharactersToGameWorld() {

    }
}
