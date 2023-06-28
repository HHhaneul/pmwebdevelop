package exam01;

import java.time.Duration;
import java.time.LocalDateTime;

public class Ex02 {
    public static void main(String[] args){
        LocalDateTime date1 = LocalDateTime.now();
        LocalDateTime date2 = date1.plusDays(100);
        Duration du = Duration.between(date1, date2);

        long seconds = du.getSeconds();

        /* LocalDateTime date3 = LocalDateTime.of(0,0,0,0,0,0,0).plusSeconds(seconds);

        System.out.println(date3);
        */
    }
}
