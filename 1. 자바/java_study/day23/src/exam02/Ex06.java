package exam02;

public interface Ex06 {
    public static void main(String[] args){
        Calculator cal = (a,b) -> a - b;
        System.out.println(cal.add(10,30));
    }
}
