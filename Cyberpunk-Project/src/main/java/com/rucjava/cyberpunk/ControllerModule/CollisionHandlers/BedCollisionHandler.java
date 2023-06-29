package com.rucjava.cyberpunk.ControllerModule.CollisionHandlers;

import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.physics.CollisionHandler;
import com.rucjava.cyberpunk.ModelModule.CharacterDataComponent;
import com.rucjava.cyberpunk.ModelModule.EntityType;

public class BedCollisionHandler extends CollisionHandler {
    public BedCollisionHandler() {
        super(EntityType.MainCharacterEntity, EntityType.BedEntity);
    }

    @Override
    protected void onCollisionBegin(Entity mainCharacter, Entity bed) {
        CharacterDataComponent dataComponent = mainCharacter.getComponent(CharacterDataComponent.class);
    }

    @Override
    protected void onCollision(Entity mainCharacter, Entity bed) {

    }

    @Override
    protected void onCollisionEnd(Entity mainCharacter, Entity bed) {

    }
}
