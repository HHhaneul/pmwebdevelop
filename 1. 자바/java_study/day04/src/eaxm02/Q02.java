package eaxm02;

public class Q02 {
    public static void main (String[] args) {

        for (int i = 1; i <= 40; i++) {
            int j = i % 10; // 0 ~ 9 -> 4번
            System.out.printf("학생%d, 방번호%d%n", i, j);
            /*System.out.printf("학생%d 방번호 %d%n", i, j);
            j++;
             if(i % 4 == 1)
            System.out.printf("학생%d 방번호 %d%n", i, j);
        }*/

        }

    }
}