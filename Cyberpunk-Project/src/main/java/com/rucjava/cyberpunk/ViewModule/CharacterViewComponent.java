package com.rucjava.cyberpunk.ViewModule;

import com.almasb.fxgl.entity.component.Component;
import com.almasb.fxgl.physics.PhysicsComponent;
import com.almasb.fxgl.texture.AnimatedTexture;
import com.almasb.fxgl.texture.AnimationChannel;
import com.rucjava.cyberpunk.ModelModule.Direction;
import javafx.scene.image.Image;
import javafx.util.Duration;

import static com.almasb.fxgl.dsl.FXGL.image;

/** Each character has this component to show their position and
 *  activity, the activities are called according to events
  */
public class CharacterViewComponent extends Component {
    private static final int IdleFramePerDirection = 6;
    private static final int RunFramePerDirection = 6;
    private static final int SitFramePerDirection = 6;
    private PhysicsComponent physicsComponent;

    private AnimatedTexture texture;
    private AnimationChannel idleAnimationFront;
    private AnimationChannel idleAnimationBack;
    private AnimationChannel idleAnimationLeft;
    private AnimationChannel idleAnimationRight;
    private AnimationChannel sitAnimationLeft;
    private AnimationChannel sitAnimationRight;
    private AnimationChannel walkAnimationFront;
    private AnimationChannel walkAnimationBack;
    private AnimationChannel walkAnimationLeft;
    private AnimationChannel walkAnimationRight;

    public CharacterViewComponent() {
        Image idleImage = image("Adam-Idle.png");
        Image walkImage = image("Adam-Run.png");
        Image sitImage = image("Adam-Sit.png");

        double idleFrameWidth = idleImage.getWidth() / 4 * 6;
        double idleFrameHeight = idleImage.getHeight();
        idleAnimationRight = new AnimationChannel(idleImage, IdleFramePerDirection, (int) idleFrameWidth, (int) idleFrameHeight, Duration.seconds(0.5), 0, 5);
        idleAnimationBack = new AnimationChannel(idleImage, IdleFramePerDirection, (int) idleFrameWidth, (int) idleFrameHeight, Duration.seconds(0.5), 6, 11);
        idleAnimationLeft = new AnimationChannel(idleImage, IdleFramePerDirection, (int) idleFrameWidth, (int) idleFrameHeight, Duration.seconds(0.5), 12, 17);
        idleAnimationRight = new AnimationChannel(idleImage, IdleFramePerDirection, (int) idleFrameWidth, (int) idleFrameHeight, Duration.seconds(0.5), 18, 23);

        double walkFrameWidth = walkImage.getWidth() / 4 * 6;
        double walkFrameHeight = walkImage.getHeight();
        walkAnimationRight = new AnimationChannel(walkImage, IdleFramePerDirection, (int) walkFrameWidth, (int) walkFrameHeight, Duration.seconds(0.5), 0, 5);
        walkAnimationRight = new AnimationChannel(walkImage, IdleFramePerDirection, (int) walkFrameWidth, (int) walkFrameHeight, Duration.seconds(0.5), 6, 11);
        walkAnimationRight = new AnimationChannel(walkImage, IdleFramePerDirection, (int) walkFrameWidth, (int) walkFrameHeight, Duration.seconds(0.5), 12, 17);
        walkAnimationRight = new AnimationChannel(walkImage, IdleFramePerDirection, (int) walkFrameWidth, (int) walkFrameHeight, Duration.seconds(0.5), 18, 23);

        double sitFrameWidth = sitImage.getWidth() / 4 * 6;
        double sitFrameHeight = sitImage.getHeight();
        sitAnimationRight = new AnimationChannel(sitImage, IdleFramePerDirection, (int) sitFrameWidth, (int) sitFrameHeight, Duration.seconds(0.5), 0, 5);
        sitAnimationRight = new AnimationChannel(sitImage, IdleFramePerDirection, (int) sitFrameWidth, (int) sitFrameHeight, Duration.seconds(0.5), 6, 11);

    }

    /** Called each frame when not paused.
     * @param tpf : time per frame
     */
    @Override
    public void onUpdate(double tpf) {

    }

    // Called after the component is added to entity.
    @Override
    public void onAdded() {

    }

    public void move(Direction direction) {

    }

    public void stop(Direction direction) {

    }

    public void sit(Direction direction) {

    }
}