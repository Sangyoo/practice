import java.io.*;

public class FileClassPractice {
    public static void main(String[] args) throws IOException {
        File file = new File("../codestates.txt");

        System.out.println(file.getPath());
        System.out.println(file.getParent());
        System.out.println(file.canWrite());

        //현재 디렉토리에서 확장자가 .txt인 파일 앞에 "code" 붙이기
        File parentDir = new File("./");
        File[] list = parentDir.listFiles();

        String prefix = "code";

        for(int i = 0; i < list.length; i++) {
            String fileName = list[i].getName();
            System.out.println("filename is : "+fileName);
            if(fileName.endsWith("txt") && !fileName.startsWith("code")) {
                list[i].renameTo(new File(parentDir, prefix + fileName));
            }
        }
    }
}
