package netEase;

import java.util.Arrays;
import java.util.Scanner;

public class NetEase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int[] nums = new int[n];
            for(int i = 0;i < n;i++){
                nums[i] = sc.nextInt();
            }
            int oddNum = 0;
            for(int num : nums){
                if(num % 2 == 1){
                    oddNum++;
                }
            }
            if(oddNum == 0 || oddNum == n){
                for (int num :nums){
                    System.out.println(num + " ");
                }
            }else{
                Arrays.sort(nums);
                for(int num : nums){
                    System.out.println(num + " ");
                }
            }
        }
    }
}
