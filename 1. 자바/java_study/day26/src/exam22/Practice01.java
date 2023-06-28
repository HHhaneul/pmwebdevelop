package exam22;

import java.io.FileOutputStream;
import java.io.IOException;

public class Practice01 {
    public static void main(String[] args){
        try(FileOutputStream fos = new FileOutputStream("text.txt")){
            for (int i = 0; i < 77; i++){
                fos.write(i+65);
            }
        }catch (IOException e){
            e.getStackTrace();
        }
    }
}
