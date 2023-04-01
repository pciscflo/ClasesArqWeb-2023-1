package functional;

import java.util.function.Function;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Start example");
        Function funtionExample =Function1.functionExample();

        System.out.println(funtionExample.apply("Hello"));
        /*************************************/
        Function functionLambda=Function2.functionLambdaLength();
        System.out.println(functionLambda.apply("Hello Word"));

    }
}
