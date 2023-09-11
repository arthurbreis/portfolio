import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionPredicated {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go");

        Predicate<String> maisCincoCaracteres = palavra -> palavra.length() > 5;

        palavras.stream()
                .filter(maisCincoCaracteres)
                .forEach(System.out::println);
    }
}
