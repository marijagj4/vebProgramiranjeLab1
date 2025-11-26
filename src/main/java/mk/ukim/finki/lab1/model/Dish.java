package mk.ukim.finki.lab1.model;

import lombok.Data;

@Data
public class Dish {
    protected String dishId;
    private Long id;
    protected String name;
    protected String cuisine;
    protected int preparationTime;

    private static Long COUNTER = 0L;

    public Dish(String dishId, String name, String cuisine, int preparationTime) {
        this.dishId = dishId;
        this.name = name;
        this.cuisine = cuisine;
        this.preparationTime = preparationTime;
        this.id = ++COUNTER;
    }
}
