package exam04;

public class RecCalculator implements Calculator{

    @Override
    public long factorial(long num) {

        long total = 1l;
        if (num < 1){
            return 1;
        }

        total *= num;

        return num * factorial(num - 1);

    }
}
