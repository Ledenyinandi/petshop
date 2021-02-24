package com.codecool.petshop.model;

import com.google.common.collect.Maps;

import java.util.Map;

public enum Brand {
    FLUVAL("Fluval"),
    HIKARI("Hikari"),
    NULA("Nula"),
    WHISKAS("Whiskas"),
    WOOLF("Woolf");

    private final String brandName;

    Brand(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    private static final Map<String, Brand> nameIndex =
            Maps.newHashMapWithExpectedSize(Brand.values().length);
    static {
        for (Brand brand : Brand.values()) {
            nameIndex.put(brand.getBrandName(), brand);
        }
    }
    public static Brand lookupByName(String name) {
        return nameIndex.get(name);
    }
}
