package mk.ukim.finki.lab1.repository;

import mk.ukim.finki.lab1.model.Dish;

import java.util.List;


    public interface DishRepository {
        List<Dish> findAll();
        Dish findByDishId(String dishId);
    }

