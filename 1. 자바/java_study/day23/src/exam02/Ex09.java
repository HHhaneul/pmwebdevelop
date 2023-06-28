package exam02;

import java.util.Arrays;
import java.util.List;

public class Ex09 {
    public static void main(String[] args){
        List<String> fruits = Arrays.asList("Apple", "Mango", "Melon");

        //fruits.replaceAll(s -> s.toLowerCase());
        fruits.replaceAll(s -> s.toUpperCase());
        System.out.println(fruits);
    }
}
