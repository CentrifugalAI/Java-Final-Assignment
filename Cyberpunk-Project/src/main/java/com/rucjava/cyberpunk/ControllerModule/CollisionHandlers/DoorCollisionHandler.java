package com.rucjava.cyberpunk.ControllerModule.CollisionHandlers;

import com.almasb.fxgl.physics.CollisionHandler;
import com.rucjava.cyberpunk.ModelModule.EntityType;

public class DoorCollisionHandler extends CollisionHandler {
    public DoorCollisionHandler() {
        super(EntityType.MainCharacterEntity, EntityType.DoorEntity);
    }
}
