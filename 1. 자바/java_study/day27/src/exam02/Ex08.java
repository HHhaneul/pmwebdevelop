package exam02;

import javax.swing.text.Style;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex08 {
    public static void main(String[] args)throws IOException {
        System.out.printf("아무거나 입력: ");
        //InputStreamReader isr = new InputStreamReader(System.in);
        //BufferedReader br = new BufferedReader(isr);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            //char ch = (char) System.in.read();
            //char ch = (char)isr.read();
            //char ch = (char)br.read();
            String line = br.readLine();
            //System.out.print(ch);
            System.out.print(line);
        }
    }
}
