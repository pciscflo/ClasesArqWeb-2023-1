package basicfunction;
@FunctionalInterface
public interface FunctionLength<String, Integer> {
    Integer lengthString(String message);
}
