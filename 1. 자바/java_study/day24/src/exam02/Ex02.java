package exam02;

public class Ex02 {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer();
        //StringBuffer sb2 = sb.append("ABC");
        //StringBuffer sb3 = sb2.append("DEF");
        //체인 연결해서 값을 도출
        sb.append("ABC")
                        .append("DEF")
                                .append("GHI");
        System.out.println(sb);
        
    }
}
