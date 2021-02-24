package com.codecool.petshop;

import com.codecool.petshop.dao.CatFoodDao;
import com.codecool.petshop.dao.CatFoodDaoJdbc;

public class Main {

    public static void main(String[] args) {
        CatFoodDaoJdbc catFoodDaoJdbc = new CatFoodDaoJdbc();
        System.out.println(catFoodDaoJdbc.findFoodById(1));
    }
}
