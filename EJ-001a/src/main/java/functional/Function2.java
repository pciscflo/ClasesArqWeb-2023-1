package functional;

import java.util.function.Function;

public class Function2 {
    public static Function<String,Integer> functionLambdaLength() {
        return x -> x.length();
    }
}
