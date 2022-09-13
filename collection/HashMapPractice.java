import java.util.*;

public class HashMapPractice {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("피카츄", 85);
        map.put("꼬부기", 95);
        map.put("야도란", 75);
        map.put("파이리", 65);
        map.put("피존투", 15);

        System.out.println("총 entry 수는 : "+ map.size());

        System.out.println("파이리 : " + map.get("파이리")+ "\n");

        Set<String> KeySet = map.keySet();

        Iterator<String> keyIterator = KeySet.iterator();
        while(keyIterator.hasNext()){
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.println(key + " : " + value);
        }

        System.out.println("\n피존투 삭제 : "+map.remove("피존투"));

        System.out.println("\n총 entry 수는 : "+ map.size());

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

        while(entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " : " + value);
        }

        map.clear();
    }


}
