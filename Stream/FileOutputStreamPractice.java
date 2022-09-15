import java.io.FileOutputStream;

public class FileOutputStreamPractice {
    public static void main(String[] args) {
        try{
            FileOutputStream fileOutput = new FileOutputStream("FileOut.txt");
            String word = "code";

            byte[] b = word.getBytes();
            fileOutput.write(b);
            fileOutput.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
