package basicfunction;

public class Main1 {
    public static void main(String[] args) {
        //Se define la función o comportamiento
       FunctionJava functionJava = s -> System.out.println(s + " Bienvenido!");
       //Se pasa la función
       functionJava.sayMessage("Pepe");
       FunctionLength<String, Integer> functionLength = l -> l.length();
       System.out.println(functionLength.lengthString("Hello"));
    }
}
