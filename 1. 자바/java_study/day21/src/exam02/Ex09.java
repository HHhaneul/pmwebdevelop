package exam02;

import java.util.*;

public class Ex09 {
    public static void main(String[] args){
        List<String> strs = new ArrayList<>();
        Collections.addAll(strs, "abc", "bcf", "efg");
        System.out.println(strs);

        List<String> alphas = Arrays.asList("A","A","A","B","C");
        int frequency = Collections.frequency(alphas, "A");
        System.out.println(frequency);
    }
}