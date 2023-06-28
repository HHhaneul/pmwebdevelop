package exam01;

import java.lang.annotation.Annotation;
import java.util.Arrays;

//@MyAnno(value = {"값1", "값2", "값3", "값4"}, min=10, max=100)
@MyAnno({"값1","값2", "값3"})
public class Ex01 {
    public static void main(String[] args){
        Class cls = Ex01.class;
        //cls.getClasses(); // 애노테이션도 받을 수 있지만 애너테이션으로 이미 받았음
        MyAnno myanno = (MyAnno)cls.getAnnotation(MyAnno.class);

        String[] values = myanno.value();
        System.out.println(Arrays.toString(values));

        int min = myanno.min();
        int max = myanno.max();
        System.out.printf("min=%d, max=%d%n" , min, max);
    }
}
