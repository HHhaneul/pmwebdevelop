package exam03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class Ex03 {
    public static void main(String[] args){
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Orange", "Mango"));
        //fruits.forEach(s -> System.out.println(s));
        fruits.forEach(System.out::println); // 들어가는 값이 정해져 있으므로...! 예상 가능!
    }
}
