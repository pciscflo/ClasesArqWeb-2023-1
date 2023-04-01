package com.upc.ejercicio1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
          new Book("Dracula",1897,Genre.HORROR),
          new Book("Dune 1", 1965, Genre.SCIENCE_FICTION),
          new Book("1984",1949,Genre.DYSTOPIAN),
          new Book("The Shining",1977, Genre.HORROR),
                new Book("Dune 3", 1965, Genre.SCIENCE_FICTION),
                new Book("Dune 2", 1966, Genre.SCIENCE_FICTION),
                new Book("Dune 4", 1967, Genre.SCIENCE_FICTION)
        );

          List<String> result = books.stream()
                  .filter(book -> book.year()< 1970)
                  .filter(book -> book.genre() == Genre.SCIENCE_FICTION)
                  .map(book -> book.title())//sólo titulos
                  .sorted() // ascendente
                  .limit(3) // tres primeros
                  .collect(Collectors.toList());
        System.out.println(result);
    }
}
