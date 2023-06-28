package exam02;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05 {
    public static void main(String[] arg){
        int[] scores = {90, 80, 88, 65, 78, 100};
        try(FileOutputStream fis = new FileOutputStream("scores.dat");
            DataOutputStream dos = new DataOutputStream(fis)){

            for (int score: scores){
                dos.write(score);
            }

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
