import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamPractice {
    public static void main(String[] args) {
        try{
            FileInputStream fileInput = new FileInputStream("Codestates.txt");
            BufferedInputStream bufferedInput = new BufferedInputStream(fileInput);
            int i = 0;
            while((i = bufferedInput.read()) != -1) {
                System.out.print((char)i);
            }
            fileInput.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
