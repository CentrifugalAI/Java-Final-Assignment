package com.rucjava.cyberpunk.ControllerModule;

public class NetworkEvent implements BasicEvent {
    private NetworkEventType networkEventType;

    @Override
    public NetworkEventType getEventType() {
        return this.networkEventType;
    }
}
