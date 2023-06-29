package com.rucjava.cyberpunk.ControllerModule.CollisionHandlers;

import com.almasb.fxgl.physics.CollisionHandler;
import com.rucjava.cyberpunk.ModelModule.EntityType;

public class ChairCollisionHandler extends CollisionHandler {
    public ChairCollisionHandler() {
        super(EntityType.MainCharacterEntity, EntityType.ChairEntity);
    }
}
