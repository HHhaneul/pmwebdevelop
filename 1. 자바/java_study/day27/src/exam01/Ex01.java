package exam01;

public class Ex01 {
    public static void main(String[] args){
        long stime = System.nanoTime(); // 추가 기능

        Calculator cal1 = new PerformanceCalculator(new ImplCalculator());
        long result1 = cal1.factorial(10l); // 핵심 기능

        //long etime = System.nanoTime(); // 추가 기능

        //System.out.printf("걸린시간 : %d%n", etime-stime);
        System.out.printf("result1 = %d%n", result1);

        //stime = System.nanoTime(); // 추가 기능

        Calculator cal2 = new PerformanceCalculator(new RecCalculator());
        long result2 = cal2.factorial(10l); // 핵심 기능

        //etime = System.nanoTime(); // 추가 기능

        //System.out.printf("걸린시간 : %d%n", etime-stime);
        System.out.printf("result2 = %d%n", result2);
    }
}
