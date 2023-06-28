package exam01;

public class PerformanceCalculator implements Calculator{

    private  Calculator calculator;

    public PerformanceCalculator (Calculator calculator){
        this.calculator = calculator;
    }

    @Override
    public long factorial(long num) {

        long stime = System.nanoTime(); // 추가기능
        try {
            long result = calculator.factorial(num); // 핵심기능
            return result;
        }finally{
        long etime = System.nanoTime(); // 추가기능
        System.out.printf("걸린시간: %d%n", etime - stime);
        }
    }
}
