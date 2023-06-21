package com.rucjava.cyberpunk.DevelopUtils;

public enum LevelType {
    WARNING("WARNING"),
    ERROR("ERROR"),
    COMMON("COMMON");

    private final String strLevelType;

    private LevelType(String strLevelType) {
        this.strLevelType = strLevelType;
    }

    public String toString() {
        return this.strLevelType;
    }
}
