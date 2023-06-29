package com.rucjava.cyberpunk.ControllerModule;

import javafx.geometry.Point2D;

public class LocalEvent implements BasicEvent {
    private LocalEventType localEventType;

    // pos information only used when Trigger event happen
    private Point2D worldPos;
    private Point2D uiPos;

    public LocalEvent(LocalEventType localEventType) {
        assert (localEventType != LocalEventType.TRIGGER_BEGIN ||
                localEventType != LocalEventType.TRIGGER_ON ||
                localEventType != LocalEventType.TRIGGER_END);
        this.localEventType = localEventType;
        this.uiPos = this.worldPos = null;
    }

    public LocalEvent(LocalEventType localEventType, Point2D worldPos, Point2D uiPos) {
        assert (localEventType == LocalEventType.TRIGGER_BEGIN ||
                localEventType == LocalEventType.TRIGGER_ON ||
                localEventType == LocalEventType.TRIGGER_END);
        this.localEventType = localEventType;
        this.worldPos = worldPos;
        this.uiPos = uiPos;
    }

    public LocalEventType getEventType() {
        return localEventType;
    }

    public Point2D getUiPos() {
        return uiPos;
    }

    public Point2D getWorldPos() {
        return worldPos;
    }
}
