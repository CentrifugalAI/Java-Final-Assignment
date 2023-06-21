package com.rucjava.cyberpunk.ControllerModule;

import com.rucjava.cyberpunk.DevelopUtils.LevelType;
import com.rucjava.cyberpunk.DevelopUtils.Logger;

public class MainController {
    EventQueue eventQueue;

    public MainController() {
        this.eventQueue = new EventQueue();
    }

    /** 每次调用 handleAllEvent 函数将会遍历并清空事件队列
     */
    public void handleAllEvent() {
        int initEventNumber = eventQueue.getEventNumber();
        while (!this.eventQueue.isEmpty()) {
            int eventID = initEventNumber - eventQueue.getEventNumber();
            Logger.log(this.getClass().getName(), "handle event " + eventID, LevelType.COMMON);

        }
    }
}
