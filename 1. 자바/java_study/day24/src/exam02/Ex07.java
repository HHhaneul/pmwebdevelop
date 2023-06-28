package exam02;

import java.util.Arrays;

public class Ex07 {
    public static void main(String[] args){
        String[] fruits = {"Apple", "Orange", "Mango", "Melon", "Banana"};

        Arrays.stream(fruits).map(s -> s.length()).forEach(System.out::println);
        // String -> Integer // 같은 내용이지만 Int를 넣어주면 성능이 더 좋아짐.
        Arrays.stream(fruits).mapToInt(s -> s.length()).forEach(System.out::println);
                                // String -> int
    }
}