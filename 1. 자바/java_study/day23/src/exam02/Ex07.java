package exam02;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex07 {
    public static void main(String[] args){
        List<String> names = Arrays.asList("이름2", "이름3", "이름1", "이름4", "이름5");
        Collections.sort(names, (a,b) -> a.compareTo(b)); // 오름차순 정렬
        //Collections.sort(names, (a,b) -> b.compareTo(a)); // 내림차순 정렬
        System.out.println(names);
    }
}
