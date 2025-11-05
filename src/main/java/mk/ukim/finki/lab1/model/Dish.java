package mk.ukim.finki.lab1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Dish {
    String dishId;
    String name;
    String cuisine;
    int preparationTime;

}
