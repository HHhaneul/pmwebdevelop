package exam02;

import java.util.Arrays;
import java.util.List;

public class Ex03 {
    public static void main(String[] args){
        List<String> fruits1 = Arrays.asList("Banana","Orange", "Apple", "Melon");
        //fruits1.stream().sorted().forEach(s -> System.out.println(s));
        fruits1.stream().sorted().forEach(System.out::println);
        //리스트로 출력하기
        String[] fruits2= {"Banana","Orange", "Apple", "Melon"};
        Arrays.stream(fruits2).sorted().forEach(System.out::println);
        //배열로 출력하기
        for (String fruit : fruits1){
            System.out.println(fruit);
        }
    }
}
