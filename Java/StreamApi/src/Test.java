import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        Optional<String> optionalValue = Optional.empty();
        String result = optionalValue.orElse("Default");
        System.out.println(result);
    }
}
