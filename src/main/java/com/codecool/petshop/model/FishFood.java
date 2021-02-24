package com.codecool.petshop.model;

import java.util.Date;

public class FishFood extends Food {

    public FishFood(long id, String name, Brand brand, Type type, Date goodUntil, int quantityOnStock) {
        super(id, name, brand, type, goodUntil, quantityOnStock);
    }
}
