package exam02;

import javax.swing.table.TableRowSorter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class Ex07 {
    public static void main(String[] args){
        try (FileInputStream fis1 = new FileInputStream("test1.txt");
        FileInputStream fis2 = new FileInputStream("test2.txt");
             SequenceInputStream sis = new SequenceInputStream(fis1,fis2)){

            while (sis.available() > 0){
                char ch = (char) sis.read();
                System.out.print(ch);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
