package com.codecool.petshop.model;

import lombok.*;
import java.util.Date;

@Data
public abstract class Food {

    private long id;
    private String name;
    private Brand brand;
    private Type type;
    private Date goodUntil;
    private int quantityOnStock;

    public Food(long id, String name, Brand brand, Type type, Date goodUntil, int quantityOnStock) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.type = type;
        this.goodUntil = goodUntil;
        this.quantityOnStock = quantityOnStock;
    }

}
