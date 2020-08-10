package netEase;

import java.util.Arrays;
import java.util.Scanner;

public class NetEase1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int group = sc.nextInt();
            for(int i = 0;i < group;i++){
                int n = sc.nextInt();
                if(n < 3){
                    System.out.println("NO");
                }
                int[] nums = new int[n];
                for(int j = 0;j < n;j++){
                    nums[j] = sc.nextInt();
                }
                Arrays.sort(nums);
                if(nums[n-3]+nums[n-2] >nums[n-1]){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
    }
}
