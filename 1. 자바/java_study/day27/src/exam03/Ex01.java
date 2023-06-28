package exam03;

import java.io.File;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args)throws IOException,InterruptedException {
        File file = new File("D:\\tmp\\test1.txt");

        file.createNewFile();

        Thread.sleep(3000);

        file.delete();
    }
}
