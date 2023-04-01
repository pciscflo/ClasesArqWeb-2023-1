package streamreduce;

import entities.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static entities.Dish.menu;

public class Reducing {
  // REDUCE
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,4,5,1,2);

        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Suma:" + sum);

        int sum2 = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Suma:" + sum2);

        int max = numbers.stream().reduce(0, (a, b) -> Integer.max(a, b));
        System.out.println("Máximo:"+max);

        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        System.out.print("Minimo:");
        min.ifPresent(System.out::println);

        int calories = menu.stream()
                //.map(Dish::getCalories)
                .map(dish -> dish.getCalories())
                //.reduce(0, Integer::sum);
                  .reduce((a, b) -> a + b).get();
        System.out.println("Number of calories:" + calories);
    }
}
