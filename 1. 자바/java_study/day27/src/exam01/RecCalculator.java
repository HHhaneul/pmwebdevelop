package exam01;

public class RecCalculator implements Calculator{

    @Override
    public long factorial(long num) {
        long stime = System.nanoTime();
        long total = 1l;
        if (num < 1) {
            return 1;
        }
        total *= num;
        return num * factorial(num - 1);
    }
}

