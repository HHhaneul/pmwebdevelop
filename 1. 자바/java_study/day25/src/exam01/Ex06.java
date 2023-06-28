package exam01;

import java.util.Optional;

public class Ex06 {
    public static void main(String[] args){
        //String str = "ABC";
        //Optional<String> opt = Optional.of(str); // null값 허용X

        String str = null;
        Optional<String> opt = Optional.ofNullable(str); // null값 허용

        //String str2 = opt.get();
        String str2 = opt.orElse("DEF");
        System.out.println(str2);

    }
}
