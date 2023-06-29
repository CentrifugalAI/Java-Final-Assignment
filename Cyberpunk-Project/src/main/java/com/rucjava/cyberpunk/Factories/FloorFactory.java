package com.rucjava.cyberpunk.Factories;

import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.EntityFactory;
import com.almasb.fxgl.entity.SpawnData;
import com.almasb.fxgl.entity.Spawns;
import com.almasb.fxgl.entity.components.CollidableComponent;
import com.almasb.fxgl.physics.BoundingShape;
import com.almasb.fxgl.physics.HitBox;
import com.almasb.fxgl.physics.PhysicsComponent;
import com.rucjava.cyberpunk.ModelModule.EntityType;

import static com.almasb.fxgl.dsl.FXGL.entityBuilder;

public class FloorFactory implements EntityFactory {
    public FloorFactory() {}

    @Spawns("Barrier")
    public Entity newBarrierEntity(SpawnData data) {
        return entityBuilder(data)
                .type(EntityType.BarrierEntity)
                .bbox(new HitBox(BoundingShape.box(data.<Integer>get("width"), data.<Integer>get("height"))))
                .with(new PhysicsComponent())
                .build();
    }

    @Spawns("Door")
    public Entity newDoorEntity(SpawnData data) {
        return entityBuilder(data)
                .type(EntityType.DoorEntity)
                .bbox(new HitBox(BoundingShape.box(data.<Integer>get("width"), data.<Integer>get("height"))))
                .with(new PhysicsComponent())
                .with(new CollidableComponent(true))
                .build();
    }
}
