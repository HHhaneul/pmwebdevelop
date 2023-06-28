package exam02;

public class Ex04 {
    public static void main(String[] args){
        String medal = "Gold";
        switch (medal){
            case "금메달":
                System.out.println("Gold");
                break;
            case "은메달":
                System.out.println("Siver");
                break;
            case "동메달":
                System.out.println("Bronze");
                break;
            default:
                System.out.println("No medal");

        }
    }
}
