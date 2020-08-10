package alibaba;


import java.util.Arrays;
import java.util.Scanner;

public class Alibaba3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] arr = input.nextLine().toCharArray();
        int[] ace = new int[arr.length];
        int[] bdf = new int[arr.length];
        int l1 = 0;
        int l2 = 0;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] == 'a' || arr[i] == 'c' || arr[i] == 'e'){
                ace[l1++] = arr[i];
            }else{
                bdf[l2++] = arr[i];
            }
        }
        System.out.println(LIS(ace,l1)+LIS(bdf,l2));
    }
    public static int LIS(int[] arr,int length){
        int[] dp = new int[length];
        Arrays.fill(dp,1);
        for(int i = 0;i < length;i++){
            for(int j = 0;j < i;j++){
                if(arr[i] >= arr[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
        }
        int res = 0;
        for(int i = 0;i < dp.length;i++){
            res = Math.max(res,dp[i]);
        }

        return res;
    }
}

