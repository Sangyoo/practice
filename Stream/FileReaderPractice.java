import java.io.FileReader;

public class FileReaderPractice {
    public static void main(String[] args) {
        try{
            String fileName = "Codestates.txt";
            FileReader file = new FileReader(fileName);

            int data = 0;

            while((data=file.read()) != -1) {
                System.out.print((char) data);
            }
            file.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
