package com.rucjava.cyberpunk.ModelModule;

import com.almasb.fxgl.entity.component.Component;
import javafx.geometry.Point2D;

public class CharacterDataComponent extends Component {
    private Direction direction;
    private Point2D position;
    boolean isSleep;

    public void setPosition(Point2D position) {
        this.position = position;
    }

    public Point2D getPosition() {
        return this.position;
    }

    public Direction getDirection() {
        return this.direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void setIsSleep(boolean isSleep) {
        this.isSleep = isSleep;
    }

    public boolean getIsSleep() {
        return this.isSleep;
    }
}
