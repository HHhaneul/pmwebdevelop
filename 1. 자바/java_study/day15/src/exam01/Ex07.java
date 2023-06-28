package exam01;

public class Ex07 {
    public static void main(String[] args){
        String str1 = "ABC"; // 문자열 상수
        String str2 = "ABC"; // 문자열 상수

        System.out.println(str1 == str2);
        System.out.println("str: " + System.identityHashCode(str1));
        System.out.println("str: " + System.identityHashCode(str2));
    }
}
