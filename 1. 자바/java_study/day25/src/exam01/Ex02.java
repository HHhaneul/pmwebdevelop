package exam01;

import javax.swing.text.Style;
import java.util.stream.IntStream;

public class Ex02 {
    public static void main(String[] args){
        /**
        IntStream.rangeClosed(1,100)
                .skip(30) // 30번까지 건너뛰기
                .limit(20) // 20개의 개수제한
                .forEach(System.out::println);
         */
        int total = IntStream.rangeClosed(1,100)
                .filter(x -> x % 2 == 0) // 걸러주기
                .sum(); // 합계
        System.out.println(total);
    }
}
