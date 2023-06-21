package com.rucjava.cyberpunk.ControllerModule;

import javafx.geometry.Point2D;

public class MyEvent {
    private EventType eventType;

    private Point2D worldPos;
    private Point2D uiPos;

    public MyEvent(EventType eventType) {
        assert (eventType != EventType.TRIGGER_BEGIN ||
                eventType != EventType.TRIGGER_ON ||
                eventType != EventType.TRIGGER_END);
        this.eventType = eventType;
        this.uiPos = this.worldPos = null;
    }

    public MyEvent(EventType eventType, Point2D worldPos, Point2D uiPos) {
        assert (eventType == EventType.TRIGGER_BEGIN ||
                eventType == EventType.TRIGGER_ON ||
                eventType == EventType.TRIGGER_END);
        this.eventType = eventType;
        this.worldPos = worldPos;
        this.uiPos = uiPos;
    }

    public EventType getEventType() {
        return eventType;
    }

    public Point2D getUiPos() {
        return uiPos;
    }

    public Point2D getWorldPos() {
        return worldPos;
    }
}
