package exam01;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Ex13 {
    public static void main(String[] args){
        Random rand = new Random();

        int[] nums = rand.ints().limit(5).toArray();
        System.out.println(Arrays.toString(nums));
        /**
        int min = Arrays.stream(nums)
                // a가 만약에 크면 b출력 b가 더 크다면 a 출력
                .reduce(Integer.MAX_VALUE, (a,b) -> a > b? b: a );
         */
        int min = Arrays.stream(nums)
                // a가 만약에 크면 b출력 b가 더 크다면 a 출력
                .reduce(Integer.MAX_VALUE, (a,b) ->
                {int m = a;
                if (a>b) {
                    m = b;
                }
                    System.out.printf("a=%d, b=%d%n", a, b);
                    return m;
                });
        System.out.println("최소값: " + min);

        int max = Arrays.stream(nums)
                .reduce(Integer.MIN_VALUE, (a,b) -> a < b? b: a);
        System.out.println("최대값: " + max);

        int min2 = Arrays.stream(nums).min().getAsInt();
        System.out.println("min= "+ min2);

    }
}
