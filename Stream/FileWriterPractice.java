import java.io.FileWriter;

public class FileWriterPractice {
    public static void main(String[] args) {
        try{
            String fileName = "FileOut.txt";
            FileWriter writer = new FileWriter(fileName);

            String str = "Written!";
            writer.write(str);
            writer.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}
