package exam02;

public class Ex03 {
    public static void main(String[] args){
        Thread th1 = new Thread2();
        th1.run();
        System.out.println("-----------------------------------");
        th1.start();
    }
}
