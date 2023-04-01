package streammaps;

import entities.Dish;

import java.util.Arrays;
import java.util.List;

import static entities.Dish.menu;
import static java.util.stream.Collectors.toList;

public class Mapping {
    //MAP
    public static void main(String[] args) {
        // map
        List<String> dishNames = menu.stream()
                .map(Dish::getName)
                .collect(toList());
        System.out.println("Por nombre ************");
        System.out.println(dishNames);

        // map
        List<String> words = Arrays.asList("Hello", "World");
        List<Integer> wordLengths = words.stream()
                .map(String::length)
                .collect(toList());
        System.out.println("Por Longitud");
        System.out.println(wordLengths);

        // flatMap
        System.out.println("FlatMap Report **********");
        words.stream()
                .map(s -> s.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .forEach(System.out::println);

    }
}
