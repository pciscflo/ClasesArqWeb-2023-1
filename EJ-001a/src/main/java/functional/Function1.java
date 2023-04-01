package functional;

import java.util.function.Function;

public class Function1 {
    public static Function<String,String> functionExample() {
        //.........Type,Result
        Function<String, String> function = new Function<String, String>() {

            @Override
            public String apply(String msg) {
                return msg + " @@@ ";
            }
        };
        return function; // retorna una función
    }
}
