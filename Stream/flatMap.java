import java.util.Arrays;
import java.util.stream.Stream;

public class flatMap {
    public static void main(String[] args) {
        Stream<String[]> stringArraysStream = Stream.of(
                new String[]{"hello", "world", "java"},
                new String[]{"code", "states"});

        stringArraysStream.map(Arrays::stream).forEach(System.out::println);
    }
}