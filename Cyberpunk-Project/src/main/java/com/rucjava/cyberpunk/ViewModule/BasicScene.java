package com.rucjava.cyberpunk.ViewModule;

public interface BasicScene {
    void setAsMainScene();

    SceneType getSwitchTargetScene();

    void addMainCharacterToScene();

    void addOtherCharactersToGameWorld();
}
