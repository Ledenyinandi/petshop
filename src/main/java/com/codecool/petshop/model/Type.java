package com.codecool.petshop.model;

import com.google.common.collect.Maps;
import java.util.Map;

public enum Type {
    DRY("dry"),
    WET("wet"),
    FROZEN("frozen"),
    RAW("raw"),
    BLOOD_WORM("blood_worm");

    private final String typeName;

    Type(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }

    private static final Map<String, Type> nameIndex =
            Maps.newHashMapWithExpectedSize(Type.values().length);
    static {
        for (Type type : Type.values()) {
            nameIndex.put(type.getTypeName(), type);
        }
    }
    public static Type lookupByName(String name) {
        return nameIndex.get(name);
    }
}
