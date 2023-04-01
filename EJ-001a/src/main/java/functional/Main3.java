package functional;

import java.util.function.Consumer;

public class Main3 {
    public static void main(String[] args) {
        Alumno alumno = new Alumno ("Juan Consumer", 9);
        Consumer<Alumno> studentConsumer = oneStudent -> System.out.println(oneStudent.toString());
        studentConsumer.accept(alumno); //no retorna sólo procesa el comportamiento
    }
}
