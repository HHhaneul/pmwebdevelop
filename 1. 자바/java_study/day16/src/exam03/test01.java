package exam03;

public class test01 {
        public static void main(String[] args) {
        double distance = 20.0;
        double angle = 60.0;
        double height = distance * Math.tan(Math.toRadians(angle)) + 1.5;
        System.out.printf("건물의 높이 %.2fm", height);
    }
}

