public class Threadprac1 {
    public static void main(String[] args) {
        ThreadTask2 threadTask2 = new ThreadTask2();
        threadTask2.start();

        // 반복문 추가
        for (int i = 0; i < 100; i++) {
            System.out.print("@");
        }
    }


}

class ThreadTask2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print("#");
        }
    }
}
