package sec02.copyExam;

import java.io.*;

public class CopyExam01 {
    public static void main(String[] args) {
        String originalFileName = "C:/Users/Home-PC/Desktop/JavaOutput/숀.jpg";
        String targetFileName = "C:/Users/Home-PC/Desktop/JavaOutput/숀2.jpg";

        try {
            InputStream is = new FileInputStream(originalFileName);
            OutputStream os = new FileOutputStream(targetFileName);

            // 15~20 LINE 은  is.transferTo(os); 이 한줄로 대체가 가능하다.
            byte[] data = new byte[1024];
            while (true) {
                int num = is.read(data);
                if(num==-1)break;
                os.write(data, 0, num);
            }

            os.flush();
            os.close();
            is.close();

            System.out.println("복사가 잘 되었습니다.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
