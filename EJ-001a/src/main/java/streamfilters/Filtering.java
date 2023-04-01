package streamfilters;


import entities.Dish;

import java.util.stream.*;
import java.util.*;
import static java.util.stream.Collectors.toList;

import static entities.Dish.menu;

public class Filtering{
    //FILTER
    public static void main(String...args){

        // Filtering with predicate
        List<Dish> vegetarianMenu =
            menu.stream()
                .filter(s-> s.isVegetarian())//.filter(Dish::isVegetarian)
                .collect(toList());
        System.out.println("Vegetarian Menu *******************");
        vegetarianMenu.forEach(System.out::println);

        // Filtering unique elements
        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        System.out.println("Numeros enteros filtrados *************");
        numbers.stream()
               .filter(i -> i % 2 == 0)
               .distinct()
               .forEach(System.out::println);

        // Truncating a stream
        List<Dish> dishesLimit3 =
            menu.stream()
                .filter(d -> d.getCalories() > 300)
                .limit(3) //los primeros 3 elementos del predicado
                .collect(toList());

        System.out.println("Truncando Stream *******************");
        dishesLimit3.forEach(System.out::println);

        // Skipping elements
        List<Dish> dishesSkip2 =
            menu.stream()
                .filter(d -> d.getCalories() > 300)
                .skip(2) //descarta los 2 primeros elementos
                .collect(toList());
        System.out.println("Skippin Objects ********************");
        dishesSkip2.forEach(System.out::println);
        //the first two meat dishes?
        List<Dish> dishes =
                menu.stream()
                        .filter(d -> d.getType() == Dish.Type.MEAT)
                        .limit(2)
                        .collect(toList());
        System.out.println("First two meat dishes *******************");
        dishes.forEach(System.out::println);
    }
}
