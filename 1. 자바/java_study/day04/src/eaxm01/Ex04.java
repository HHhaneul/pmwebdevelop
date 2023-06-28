package eaxm01;

public class Ex04 {
    public static void main (String[] args){
        int total = 0;
        for (int i = 1; i <= 100; i++){

            //홀수를 건너띄면(continue) 짝스
            if (i%2==1){
                continue;
            }

            total += i; // 짝수만 더하기
            /*
            if (i % 2 == 0){

            total +=i;

            /*
            if (i==50) {
                break; // 반복멈춤
            }
            */
            }System.out.printf("총합=%d%n", total);
        }
    }
