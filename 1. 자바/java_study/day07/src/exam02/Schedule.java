package exam02;

public class Schedule {
    private int year; // 년도
    private int month; // 월
    private int day; // 일

    // set

    public void setYear(int year2){
        year = year2;
    }

    public int getYear(){
        return year;
    }

    public void setMonth(int month2){
        month = month2;
    }

    public int getMonth(){
        return month;
    }

    public void setDay(int day2){
        if (month == 2 && day2 > 28){
            day2 = 28;
        }

        day = day2;
    }

    public int getDay(){
        return day;
    }

    /**
    public void setDate(int year2, int month2, int day2){
        year = year2;
        month = month2;
        day = day2;
    }
     */


    public void showDate(){
        System.out.printf("year=%d, month=%d, day=%d%n", year, month, day);
    }
}
