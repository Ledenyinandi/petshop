package com.codecool.petshop.model;

import java.util.Date;

public class DogFood extends Food {

    public DogFood(long id, String name, Brand brand, Type type, Date goodUntil, int quantityOnStock) {
        super(id, name, brand, type, goodUntil, quantityOnStock);
    }
}
