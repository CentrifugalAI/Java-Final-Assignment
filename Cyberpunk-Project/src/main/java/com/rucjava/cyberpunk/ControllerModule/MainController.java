package com.rucjava.cyberpunk.ControllerModule;

import com.almasb.fxgl.input.Input;
import com.rucjava.cyberpunk.ControllerModule.InputUtils.KeyInputAction;
import com.rucjava.cyberpunk.ControllerModule.InputUtils.TriggerInputAction;
import com.rucjava.cyberpunk.DevelopUtils.LevelType;
import com.rucjava.cyberpunk.DevelopUtils.Logger;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainController {
    private EventQueue eventQueue;
    private EventHandler eventHandler;
    private KeyInputAction keyInputAction;
    private TriggerInputAction triggerInputAction;

    public MainController() {
        this.eventQueue = new EventQueue();
        this.eventHandler = new EventHandler();
    }

    /** 每次调用 handleAllEvent 函数将会遍历并清空事件队列
     */
    public void handleAllEvent() {
        int initEventNumber = eventQueue.getEventNumber();
        while (!this.eventQueue.isEmpty()) {
            int eventID = initEventNumber - eventQueue.getEventNumber();
            Logger.log(this.getClass().getName(), "handle event " + eventID, LevelType.COMMON);
            BasicEvent event = eventQueue.popEvent();
            String methodName = event.toString() + "_handler";
            try {
                Method method = this.eventHandler.getClass().getMethod(methodName, this.eventHandler.getClass());
                method.invoke(this.eventHandler, event);    // 让 eventHandler 处理各项工作
            } catch (NoSuchMethodException e1) {
                Logger.log(this.getClass().getName(), "Throw NoSuchMethodException for nonexistent method name " + methodName, LevelType.ERROR);
            } catch (IllegalAccessException e2) {
                Logger.log(this.getClass().getName(), "Throw IllegalAccessException for nonexistent method name " + methodName, LevelType.ERROR);
            } catch (InvocationTargetException e3) {
                Logger.log(this.getClass().getName(), "Throw InvocationTargetException for nonexistent method name " + methodName, LevelType.ERROR);
            }
        }
    }

    public void initInput(Input input) {
        keyInputAction = new KeyInputAction(eventQueue);
        keyInputAction.registerAllKeys(input);
        triggerInputAction = new TriggerInputAction(eventQueue);
        triggerInputAction.registerTrigger(input);
    }
}
