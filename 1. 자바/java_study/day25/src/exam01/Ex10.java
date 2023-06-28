package exam01;

import java.util.Arrays;
import java.util.Random;

public class Ex10 {
    public static void main(String[] args){
        // allMatch를 활용하여 배열안에 홀수만 있는지 확인
        int[] nums = {1,3,5,7,9,10,13,15};
        boolean matched1 = Arrays.stream(nums).allMatch(n -> n % 2==1);
        System.out.println(matched1);
        // anyMatch를 활용하여 배열안에 짝수가 하나라도 있는지 확인
        int[] nums2 = {2,4,8,10,12,14,16,18};
        boolean matched2 = Arrays.stream(nums2).anyMatch(n -> n % 2==1);
        System.out.println(matched2);

        boolean _matched2 = false;
        for (int num : nums2){
            if (num % 2 == 1){
                matched2 = true;
                break;
            }
        }

        // noneMatch를 활용하여 배열안에 홀수가 한개도 없는지 확인
        int[] nums3 = {2,4,8,10};
        boolean matched3 = Arrays.stream(nums3).noneMatch(n -> n % 2==1);
        System.out.println(matched3);

        // 랜덤 숫자를 활용하여
        Random rand = new Random();
        int r = rand.ints().filter(n -> n % 2 == 1).filter(s -> s < 100).findFirst().getAsInt();
        System.out.println(r);
    }
}
