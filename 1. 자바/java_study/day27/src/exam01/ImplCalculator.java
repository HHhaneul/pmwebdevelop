package exam01;

public class ImplCalculator implements Calculator{
    @Override
    public long factorial(long num) {
        long total = 1l;
        for (long i = 1; i <= num; i++){
            total *= i;
        }

        return total;
    }
}

