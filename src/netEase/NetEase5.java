package netEase;

import java.util.Scanner;

public class NetEase5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i < n;i++){
            nums[i] = sc.nextInt();
        }

        int count = 0;
        for(int i = 0;i < n;i++){
            while(nums[i] > 1){
                nums[i] -= 2;
                count++;
            }
        }
        System.out.println(count);
    }
}
