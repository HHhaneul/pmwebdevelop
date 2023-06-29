package exam;

import java.util.Calendar;
import static java.util.Calendar.*;

public class Ex01 {
    public static void main(String[] args){
        Calendar cal = Calendar.getInstance();
        cal.add(HOUR_OF_DAY, 6);
        cal.add(HOUR_OF_DAY, -6);
        //cal.set(YEAR, 2022);
        //cal.set(HOUR_OF_DAY, 12);

        showDate(cal);

    }

    private static void showDate(Calendar cal){
        int year = cal.get(YEAR);
        int month = cal.get(MONTH) + 1;
        int day = cal.get(DAY_OF_MONTH);

        int hour = cal.get(HOUR_OF_DAY); // HOUR - 12, HOUR_OF_DAY - 24
        int minute = cal.get(MINUTE);
        int second = cal.get(SECOND);

        System.out.printf("%d-%d-%d %d:%d:%d%n", year, month, day, hour, minute, second);
    }
}
