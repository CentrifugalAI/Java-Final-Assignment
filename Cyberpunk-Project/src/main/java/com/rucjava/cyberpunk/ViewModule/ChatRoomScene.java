package com.rucjava.cyberpunk.ViewModule;

import com.almasb.fxgl.dsl.FXGL;
import javafx.scene.SubScene;

public class ChatRoomScene implements BasicScene {

    public ChatRoomScene() {
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
        return SceneType.Classroom;
    }

    @Override
    public void addMainCharacterToScene() {

    }

    @Override
    public void addOtherCharactersToGameWorld() {

    }

    public void initDoor() {

    }
}
