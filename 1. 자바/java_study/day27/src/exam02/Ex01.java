package exam02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args){
        long stime = System.nanoTime();
        try (FileInputStream fis = new FileInputStream("api.zip");
            FileOutputStream fos = new FileOutputStream("api_copy.zip")) {
            while (fis.available() > 0) {
                fos.write(fis.read());
            }

        }catch (IOException e){
            e.printStackTrace();
        }
        long etime = System.nanoTime();
        System.out.printf("걸린시간: %d%n", stime - etime);
    }
}
