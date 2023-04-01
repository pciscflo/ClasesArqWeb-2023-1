package com.upc.ejercicio2;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        FigInterface<Double,Integer, Integer, Integer> figInterface =
                (a , b ,c) -> (a + b + c)/3.0;
        System.out.println("2) Promedio de lados:" + figInterface.getCondition(3, 4, 5));
        System.out.println("********************");
        Integer[] numeros = {1,3,2,4,5,6,7,10,9,8};
        System.out.println("3.1) Ver Cuadrados en forma descendente");
        getSqrtLis(numeros).forEach(System.out::println);
        Optional<Integer> suma = getSqrtLis(numeros).reduce(Integer::sum);
        System.out.println("3.2) Suma: " + suma.get());
    }
    static Stream<Integer> getSqrtLis(Integer[] numbers){
        Stream<Integer> example = Stream.of(numbers); //convirtiendo el arreglo de enteros a Stream
        return example.sorted(Comparator.reverseOrder())
                .map(value -> value*value);
    }
}
