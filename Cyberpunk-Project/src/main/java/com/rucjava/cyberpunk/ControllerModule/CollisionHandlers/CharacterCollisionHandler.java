package com.rucjava.cyberpunk.ControllerModule.CollisionHandlers;

import com.almasb.fxgl.physics.CollisionHandler;
import com.rucjava.cyberpunk.ModelModule.EntityType;

public class CharacterCollisionHandler extends CollisionHandler {
    public CharacterCollisionHandler() {
        super(EntityType.MainCharacterEntity, EntityType.CharacterEntity);
    }
}
