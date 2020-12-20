package acompany_meituan;

import java.util.Arrays;
import java.util.Scanner;

public class Meituan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        boolean flag = false;
        int count = 0;
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
           arr[i] = sc.nextInt();
        }
        for(int i = 0;i < n-m+1;i++){
            int[] sub = Arrays.copyOfRange(arr,i,i+m);
            for(int j = 0;j < sub.length;j++){
                if(sub[j] < k){
                    flag = true;
                    break;
                }
            }
            if(flag){
                flag = false;
            }else{
                count++;
            }
        }
        System.out.println(count);
    }
}
