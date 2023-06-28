package exam02;

public class Ex03 {
    public static void main(String[] args) {
        int result = add(8, 80);
        System.out.println(result);
        int result2 = qq(20, 30);
        System.out.println(result2);
    }

    static int add(int num1, int num2) { // 지역
        int num3 = num1 + num2;

        return num3;
    }

    static int qq(int num4, int num5) {
        int num6 = num4 - num5;

        return num6;
    }
    static int gg(int num7, int num8) {
        int num9 = num7 - num8;

        return num9;
}
}
