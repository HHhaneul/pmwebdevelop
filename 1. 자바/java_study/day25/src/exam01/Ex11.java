package exam01;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex11 {
    public static void main(String[] args){
        int total1 = IntStream.rangeClosed(1, 100).sum();
        System.out.println(total1);
        double[] scores = {99.5, 80.0, 45.0, 100.0, 78.5};

        double total2 = Arrays.stream(scores).sum();
        double avg = Arrays.stream(scores).average().getAsDouble();
        double min = Arrays.stream(scores).min().getAsDouble();
        double max = Arrays.stream(scores).max().getAsDouble();
        System.out.printf("total= %.2f, avg=%.2f, min= %.2f, max= %.2f", total2, avg, min, max);
    }
}
