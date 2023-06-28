package exam06;

public class Outer {
    int num1 = 30;

    class Inner{  //인스턴스 내부클래스
        static int num = 100;

        int num1 = 20;

        void printNum(){
            System.out.println(Outer.this.num1);
            System.out.println(num1);
        }

        static void method(){
            System.out.println("메서드!");
        }
    }
}
