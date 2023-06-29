package com.rucjava.cyberpunk.ControllerModule.CollisionHandlers;

import com.almasb.fxgl.physics.CollisionHandler;
import com.rucjava.cyberpunk.ModelModule.EntityType;

public class DeskCollisionHandler extends CollisionHandler {
    public DeskCollisionHandler() {
        super(EntityType.MainCharacterEntity, EntityType.CharacterEntity);
    }
}
