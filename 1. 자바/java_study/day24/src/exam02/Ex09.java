package exam02;

import java.util.stream.IntStream;

public class Ex09 {
    public static void main(String[] args){
        IntStream.range(0, 10).forEach(x -> System.out.println(x + "번 반복"));
        // 0 이상 10 미만 출력.
        IntStream.rangeClosed(0, 10).forEach(x -> System.out.println(x + "번 반복"));
        // 0 이상 10 이하 출력
        int total = IntStream.rangeClosed(1,100).sum();
        // 1이상 100 이하 총합
        System.out.println(total);
    }
}
