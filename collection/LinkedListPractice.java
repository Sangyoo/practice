import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListPractice {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        list.add("Java");
        list.add("egg");
        list.add("tree");

        int size = list.size();
        String skill = list.get(0);

        for(int i=0; i<size; i++){
            String str = list.get(i);
            System.out.println(i+":"+str);
        }

    }
}
