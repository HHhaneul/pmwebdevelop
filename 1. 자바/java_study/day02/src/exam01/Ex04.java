package exam01;

public class Ex04 {
    public static void main(String[] args) {
        byte num1 = 100;

        int num2 = num1; // 4바이트
        long num3 = num2;
        // 작은 자료형 -> 큰자료형 자동으로 자료형이 변환 - 자동 형변환 // 묵시적형변환
        System.out.println(num3);

        float num5 = num3;

        double num4 = num3;
        System.out.println(num4);
    }
}
