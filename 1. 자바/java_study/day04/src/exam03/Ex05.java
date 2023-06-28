package exam03;

public class Ex05 {
    public static void main(String[] args){
        int[] nums = {10, 20, 30, 40, 50, 60 };
        System.out.printf("공간의 갯수=%d%n", nums.length);

        /*
        for (int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
        */

        for(int num : nums){
            System.out.println(num);
        }
    }
}
