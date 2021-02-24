package com.codecool.petshop.dao;

import com.codecool.petshop.model.Brand;
import com.codecool.petshop.model.CatFood;
import com.codecool.petshop.model.Food;
import com.codecool.petshop.model.Type;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CatFoodDaoJdbc implements CatFoodDao {

    ConnectionProvider connectionProvider = new ConnectionProvider();

    @Override
    public Food findFoodById(long id) {
        try {
            Connection connection = connectionProvider.getConnection();
            String sql = "SELECT * FROM cat_food WHERE id = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setLong(1, id);
            ResultSet rs = ps.executeQuery();
            if (!rs.next()) {
                return null;
            }
            Food food = new CatFood(rs.getLong(1), rs.getString(2), Brand.lookupByName(rs.getString(3)), Type.lookupByName(rs.getString(4)), rs.getDate(5), rs.getInt(6));
            return food;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Food> findAllFoodOnStock() {
        return null;
    }

    @Override
    public List<Food> findAllFood() {
        return null;
    }

    @Override
    public List<Food> findAllFoodByBrand(Brand brand) {
        return null;
    }
}
