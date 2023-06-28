package exam03;

import exam02.SimpleCalculator;

public class Ex01 {
    public static void main(String[] args){
        Calculator cal = new SimpleCaculator();
        int result = cal.add(10, 20);
        System.out.println(result);

        int result2 = cal.minus(20, 10);
        System.out.println(result2);

        Calculator.staticMethod();
    }
}
