package functional;

import java.util.function.Predicate;

public class Main2 {
    public static void main(String[] args) {
        //Example Predicate
        Alumno alumno = new Alumno("Juan", 18);
        Predicate<Alumno> predicate = x -> x.score >=13;
        System.out.println("Alumno approved: " + predicate.test(alumno));
    }
}
