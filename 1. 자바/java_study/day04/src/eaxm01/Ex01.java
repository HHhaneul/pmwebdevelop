package eaxm01;

public class Ex01 {
    public static void main(String[] args){
        int num = 1, total = 0;


        while(num <= 100) {

            //total = total + num;
            total += num;

            //num = num + 1;
            num++;
        }

        System.out.printf("총합=%d%n", total);
    }
}
