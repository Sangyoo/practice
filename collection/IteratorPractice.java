import java.util.*;

public class IteratorPractice {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        System.out.println(integers);
//        for(int i = 0; i<integers.size(); i++){
//            Integer integer = integers.get(i);
//            System.out.println(integer);
//            if(integer ==2) integers.remove(i);
//            System.out.println("at the end of i (" + i +") and size is "+integers.size() + " array is "+integers);
//        }
        Iterator<Integer> iterator = integers.iterator();
        while(iterator.hasNext()){
            Integer integer = iterator.next();
            System.out.println(integer);
            if(integer ==2) iterator.remove();
            System.out.println("size is "+integers.size() + " array is "+integers);
        }

/*Iterator를 사용하면, next()메서드를 통해 다음 요소를 지우기 때문에 요소를 모두 출력할 수 있다.
* 그에 반면에 iterator를 쓰지 않았을 때는 요소를 지우고, 사이즈도 줄어들고 인덱스도 하나씩 밀리기 때문에
* 출력이 제대로 안된 모습을 볼 수 있다.*/
    }
}
