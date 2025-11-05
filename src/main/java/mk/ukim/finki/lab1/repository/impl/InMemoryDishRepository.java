package mk.ukim.finki.lab1.repository.impl;

import mk.ukim.finki.lab1.bootstrap.DataHolder;
import mk.ukim.finki.lab1.model.Dish;
import mk.ukim.finki.lab1.repository.DishRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class InMemoryDishRepository implements DishRepository {
    @Override
    public List<Dish> findAll() {
        return DataHolder.dishes;
    }

    @Override
    public Dish findByDishId(String dishId) {
        return DataHolder.dishes.stream().filter(d->d.getDishId().equals(dishId)).findFirst().orElse(null);
    }
}
