import java.util.*;

public class HashSetPractice {
    public static void main(String[] args) {

        HashSet<String> languages = new HashSet<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("Javascript");
        languages.add("C++");
        languages.add("Kotlin");
        languages.add("Ruby");
        languages.add("Java");

        Iterator it = languages.iterator();
        System.out.println("languages.contains(Java) = " + languages.contains("Java"));
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}