package mk.ukim.finki.lab1.service.impl;

import mk.ukim.finki.lab1.model.Dish;
import mk.ukim.finki.lab1.repository.DishRepository;
import mk.ukim.finki.lab1.service.DishService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DishServiceImpl implements DishService {

    private  final DishRepository dishRepository;
    public DishServiceImpl(DishRepository dishRepository){
        this.dishRepository=dishRepository;
    }
    @Override
    public List<Dish> listDishes() {
        return this.dishRepository.findAll();
    }

    @Override
    public Dish findByDishId(String dishId) {
       return this.dishRepository.findByDishId(dishId);
    }
}
