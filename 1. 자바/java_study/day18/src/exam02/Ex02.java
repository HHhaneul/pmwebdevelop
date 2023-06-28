package exam02;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Ex02 {
    public static void main(String[] args){
        LocalDateTime dateTime1 = LocalDateTime.now();
        ZonedDateTime zonedDateTime = dateTime1.atZone(ZoneId.of("Asia/Seoul"));
        System.out.println(zonedDateTime);
    }
}
