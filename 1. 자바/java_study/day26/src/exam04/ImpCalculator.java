package exam04;

public class ImpCalculator implements Calculator{

    @Override
    public long factorial(long num) {
        long stime = System.nanoTime();
        try {
            long total = 1l;
            for (int i = 1; i <= num; i++) {
                total *= i;
            }

            return total;
        }finally {
            long etime = System.nanoTime();
            System.out.printf("걸린시간: %d%n", etime - stime);
        }
    }
}
