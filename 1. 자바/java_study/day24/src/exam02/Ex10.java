package exam02;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class Ex10 {
    public static void main(String[] args){
        int[] score = {90, 88, 91, 95, 45, 65};
        IntSummaryStatistics stat = Arrays.stream(score).summaryStatistics();
        double avg = stat.getAverage();
        long cnt = stat.getCount();
        int max = stat.getMax();
        int min = stat.getMin();
        long total = stat.getSum();

        System.out.printf("avg= %.2f, cnt= %d, max= %d, min= %d, total=%d%n", avg,cnt,max,min,total);

        System.out.println(stat);
    }// 옛날에는 for문을 사용
}
