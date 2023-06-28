package exam01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex02 {
    public static void main(String[] args){
        List<String> names = new ArrayList<>();
        names.add("이이름");
        names.add("김이름");
        names.add("박이름");
        names.add("최이름");
        names.add("정이름");

        Iterator<String> iter = names.iterator();
        while (iter.hasNext()){
            String name = iter.next();
            System.out.println(name);
        }
        System.out.println("---------------------");

        iter = names.iterator();
        while (iter.hasNext()){
            String name = iter.next();
            System.out.println(name);
        }

        /**
        for (int i = 0; i < names.size(); i++){
            names.remove(i);
        }
         */
        /**
        for (int i = names.size() - 1; i >= 0; i--){
            names.remove(i);
        }

        for (String name: names){
            System.out.println(name);
        }
         */
    }
}
