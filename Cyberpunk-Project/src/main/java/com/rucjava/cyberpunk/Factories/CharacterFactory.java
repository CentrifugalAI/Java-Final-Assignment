package com.rucjava.cyberpunk.Factories;

import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.EntityFactory;
import com.almasb.fxgl.entity.SpawnData;
import com.almasb.fxgl.entity.Spawns;
import com.almasb.fxgl.entity.components.CollidableComponent;
import com.almasb.fxgl.physics.PhysicsComponent;
import com.almasb.fxgl.physics.box2d.dynamics.BodyType;
import com.rucjava.cyberpunk.ModelModule.CharacterDataComponent;
import com.rucjava.cyberpunk.ModelModule.EntityType;
import com.rucjava.cyberpunk.ViewModule.CharacterViewComponent;

import static com.almasb.fxgl.dsl.FXGL.*;

public class CharacterFactory implements EntityFactory {
    @Spawns("Character")
    public Entity newCharacter(SpawnData data) {
        PhysicsComponent physicsComponent = new PhysicsComponent();
        physicsComponent.setBodyType(BodyType.DYNAMIC);
        return entityBuilder(data)
                .type(EntityType.CharacterEntity)
                .with(physicsComponent)
                .with(new CollidableComponent(true))
                .with(new CharacterViewComponent())
                .with(new CharacterDataComponent())
                .build();
    }

    public Entity newMainCharacter(SpawnData data) {
        PhysicsComponent physicsComponent = new PhysicsComponent();
        physicsComponent.setBodyType(BodyType.DYNAMIC);
        return entityBuilder(data)
                .type(EntityType.MainCharacterEntity)
                .with(physicsComponent)
                .with(new CollidableComponent(true))
                .with(new CharacterViewComponent())
                .with(new CharacterDataComponent())
                .build();
    }
}
