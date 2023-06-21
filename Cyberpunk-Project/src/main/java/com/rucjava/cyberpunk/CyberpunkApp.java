/*
 * FXGL - JavaFX Game Library. The MIT License (MIT).
 * Copyright (c) AlmasB (almaslvl@gmail.com).
 * See LICENSE for details.
 */

package com.rucjava.cyberpunk;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import com.almasb.fxgl.core.math.FXGLMath;
import com.almasb.fxgl.entity.Entity;
import com.rucjava.cyberpunk.ControllerModule.InputUtils.KeyInputAction;
import com.rucjava.cyberpunk.ControllerModule.InputUtils.TriggerInputAction;
import com.rucjava.cyberpunk.DevelopUtils.LevelType;
import com.rucjava.cyberpunk.DevelopUtils.Logger;
import com.rucjava.cyberpunk.DevelopUtils.OutputType;
import javafx.util.Duration;

import java.util.Map;

import static com.almasb.fxgl.dsl.FXGL.*;
// NOTE: this import above is crucial, it pulls in many useful methods

public class CyberpunkApp extends GameApplication {

    /** 游戏设置（全局的游戏设置如标题、版本、图标等）
     * @param settings
     */
    @Override
    protected void initSettings(GameSettings settings) {
        /** Logger initialize
         */
        Logger.setOutputType(OutputType.TEXT_FILE);

        /** FXGL initialize
         * initialize common game / window settings. */
        settings.setTitle("CyberPunk2050");
        settings.setVersion("2.1");
        settings.setWidth(1600);
        settings.setHeight(900);
    }

    /** 初始化绑定 输入/控制事件
     */
    @Override
    protected void initInput() {
        Logger.log(this.getClass().getName(), "call initInput", LevelType.COMMON);
        KeyInputAction keyInputAction = new KeyInputAction();
        keyInputAction.registerAllKeys();
        TriggerInputAction triggerInputAction = new TriggerInputAction();
        triggerInputAction.registerTrigger();
    }

    /** 游戏预先资源初始化
     */
    @Override
    protected void onPreInit() {
        Logger.log(this.getClass().getName(), "call onPreInit", LevelType.COMMON);

    }

    /** 初始化游戏变量
     */
    @Override
    protected void initGameVars(Map<String, Object> vars) {
        Logger.log(this.getClass().getName(), "call initGameVars", LevelType.COMMON);
    }

    /** 初始化游戏（游戏中需要创建的ENTITY玩家进行初始化）
     */
    @Override
    protected void initGame() {
        Logger.log(this.getClass().getName(), "call initGame", LevelType.COMMON);

    }

    /** 初始化绑定碰撞事件（对具有可碰撞的相关ENTITY进行事件绑定处理 ）
     */
    @Override
    protected void initPhysics() {
        Logger.log(this.getClass().getName(), "call initPhysics", LevelType.COMMON);
    }

    @Override
    protected void initUI() {
        Logger.log(this.getClass().getName(), "call initUI", LevelType.COMMON);
    }

    @Override
    protected void onUpdate(double tpf) {
        Logger.log(this.getClass().getName(), "call onUpdate", LevelType.COMMON);
    }

    public static void main(String[] args) {
        Logger.log("CyberpunkApp", "call main", LevelType.COMMON);
    }
}
