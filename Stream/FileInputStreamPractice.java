import java.io.FileInputStream;

public class FileInputStreamPractice {
    public static void main(String[] args) {
        try{
            FileInputStream fileInput = new FileInputStream("Codestates.txt");
            int i = 0;
            while((i = fileInput.read()) != -1) {
                System.out.print((char)i);
            }
            fileInput.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
