package exam02;

public class Ex03 {
    public static void main(String[] args){
        try {
            String str = null;
            str = str.toUpperCase(); // throw new NullPointerException(....);

        } catch (NullPointerException e) {
            //System.out.println("적절한 예외 처리...");
            //String message = e.getMessage();
            //System.out.println(message);
            e.printStackTrace();
        }

        System.out.println("매우 중요한 코드!!");
    }
}
