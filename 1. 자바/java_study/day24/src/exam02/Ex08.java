package exam02;

public class Ex08 {
    public static void main(String[] args){
        int num = 100;

        //Integer num2 = Integer.valueOf(num);
        //num2.byteValue();
        //위, 아래 동일한 값
        Integer num2 = num; // Integer.valueOf(num); // 오토박싱

        Integer num3 = 200; // Integer.valueOf(200);

        int num4 = num2 + num3 ; // 언박싱 -> 성능저하
        // 위, 아래 동일한 값
        //int num4 = num2.intValue() + num3.intValue();
        System.out.println(num4);
    }
}
