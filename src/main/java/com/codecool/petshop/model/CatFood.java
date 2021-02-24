package com.codecool.petshop.model;

import java.util.Date;

public class CatFood extends Food {

    public CatFood(long id, String name, Brand brand, Type type, Date goodUntil, int quantityOnStock) {
        super(id, name, brand, type, goodUntil, quantityOnStock);
    }
}
