import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalPractice {
    public static void main(String[] args) {
        Optional<String> opt1 = Optional.ofNullable(null);
        Optional<String> opt2 = Optional.ofNullable("123");
        System.out.println(opt1.isPresent()); //Optional 객체의 값이 null인지 여부를 리턴합니다.
        System.out.println(opt2.isPresent());


        Optional<String> opt3 = Optional.<String>empty();

        Optional<String> optString = Optional.of("codestates");
        System.out.println(optString);
        System.out.println(optString.get());

        String nullName = null;
        String name = Optional.ofNullable(nullName).orElse("Kimcoding");
        System.out.println(name);

        List<String> language = Arrays.asList("Ruby", "Python", "Java", "Go", "Kotlin");
        Optional<List<String>> listOptional = Optional.of(language);

        int size = listOptional
                .map(List :: size)
                .orElse(0);
        System.out.println(size);
    }
}
