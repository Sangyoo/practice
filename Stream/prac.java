import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class prac {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        Stream<Integer> is = list.stream();
        is.mapToInt(n->n).sum();
        Stream.of()
    }
}
