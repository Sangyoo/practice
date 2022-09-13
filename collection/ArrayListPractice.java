import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("java");
        list.add("egg");
        list.add("tree");

        int size = list.size();

        String skill = list.get(0);

        for(int i = 0; i < list.size(); i++){
            String str = list.get(i);
            System.out.println(i+":"+str);
        }

        for(String str : list){
            System.out.println(str);
        }

        list.remove(0);
    }

}


