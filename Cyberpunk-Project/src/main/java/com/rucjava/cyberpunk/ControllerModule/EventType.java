package com.rucjava.cyberpunk.ControllerModule;

public enum EventType {
    KEY_A_END("KEY_A_END"),
    KEY_A_ON("KEY_A_ON"),
    KEY_A_BEGIN("KEY_A_BEGIN"),
    KEY_W_END("KEY_W_END"),
    KEY_W_ON("KEY_W_ON"),
    KEY_W_BEGIN("KEY_W_BEGIN"),
    KEY_S_END("KEY_S_END"),
    KEY_S_ON("KEY_S_ON"),
    KEY_S_BEGIN("KEY_S_BEGIN"),
    KEY_D_END("KEY_D_END"),
    KEY_D_ON("KEY_D_ON"),
    KEY_D_BEGIN("KEY_D_BEGIN"),
    KEY_E_END("KEY_E_END"),
    KEY_E_ON("KEY_E_ON"),
    KEY_E_BEGIN("KEY_E_BEGIN"),
    
    TRIGGER_BEGIN("TRIGGER_BEGIN"),
    TRIGGER_ON("TRIGGER_ON"),
    TRIGGER_END("TRIGGER_END");
    
    
    private final String EventName;

    private EventType(String EventName) {
        this.EventName = EventName;
    }

    public String toString() {
        return this.EventName;
    }
}
