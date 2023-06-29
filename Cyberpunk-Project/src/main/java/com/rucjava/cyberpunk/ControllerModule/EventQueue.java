package com.rucjava.cyberpunk.ControllerModule;

import java.util.ArrayList;

/** 简单封装一下 ArrayList 得到的任务队列
 */
public class EventQueue {
    private ArrayList<BasicEvent> queue;

    public EventQueue() {
        this.queue = new ArrayList<>();
    }

    public void addEvent(BasicEvent event) {
        this.queue.add(event);
    }

    public BasicEvent popEvent() {
        BasicEvent frontEvent = this.queue.get(0);
        this.queue.remove(0);
        return frontEvent;
    }

    public int getEventNumber() {
        return this.queue.size();
    }

    public boolean isEmpty() {
        return this.queue.isEmpty();
    }
}
