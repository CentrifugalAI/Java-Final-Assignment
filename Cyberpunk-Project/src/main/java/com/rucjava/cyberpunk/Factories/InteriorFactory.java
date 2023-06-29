package com.rucjava.cyberpunk.Factories;

import com.almasb.fxgl.dsl.EntityBuilder;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.EntityFactory;
import com.almasb.fxgl.entity.SpawnData;
import com.almasb.fxgl.entity.Spawns;
import com.almasb.fxgl.entity.components.CollidableComponent;
import com.almasb.fxgl.physics.BoundingShape;
import com.almasb.fxgl.physics.HitBox;
import com.almasb.fxgl.physics.PhysicsComponent;
import com.rucjava.cyberpunk.ModelModule.EntityType;

import static com.almasb.fxgl.dsl.FXGL.*;

public class InteriorFactory implements EntityFactory {
    @Spawns("Bed")
    public Entity newBedEntity(SpawnData data) {
        return entityBuilder(data)
                .type(EntityType.BedEntity)
                .bbox(new HitBox(BoundingShape.box(data.<Integer>get("width"), data.<Integer>get("height"))))
                .with(new PhysicsComponent())
                .with(new CollidableComponent(true))
                .build();
    }

    @Spawns("Chair")
    public Entity newChairEntity(SpawnData data) {
        return entityBuilder(data)
                .type(EntityType.ChairEntity)
                .bbox(new HitBox(BoundingShape.box(data.<Integer>get("width"), data.<Integer>get("height"))))
                .with(new PhysicsComponent())
                .with(new CollidableComponent(true))
                .build();
    }

    @Spawns("Desk")
    public Entity newDeskEntity(SpawnData data) {
        return entityBuilder(data)
                .type(EntityType.DeskEntity)
                .bbox(new HitBox(BoundingShape.box(data.<Integer>get("width"), data.<Integer>get("height"))))
                .with(new PhysicsComponent())
                .with(new CollidableComponent(true))
                .build();
    }
}
