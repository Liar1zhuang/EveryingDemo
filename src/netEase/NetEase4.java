package netEase;

import java.util.Arrays;
import java.util.Scanner;

//小易在维护数据的时候遇到一个需求，具体来说小易有一系列数据，这些数据了构成一个长度为n的数字序列，接下来小易会在这个序列上进行q次操作。
//每次操作有一个查询的数字x，小易需要将序列数据中所有大于等于x的数字都减一，并输出在本次操作中有多少个数字被减一了。
public class NetEase4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i < n;i++){
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        for(int i = 0;i < m;i++){
            int count = 0;
            int cur = sc.nextInt();
            for(int j = nums.length-1;j >= 0;j--){
                if(nums[j] >= cur){
                    count++;
                    nums[j]--;
                }else{
                    break;//剪枝
                }
            }
            System.out.println(count);
        }
    }
}
