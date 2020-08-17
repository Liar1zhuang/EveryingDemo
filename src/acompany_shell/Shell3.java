package acompany_shell;

import java.util.Scanner;

public class Shell3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long count = 1;
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = 0;
        int index = 0;
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
            if(max < arr[i]){
                max = arr[i];
                index = i;
            }
        }
        int left = 0;
        int right = 0;
        for(int i = index;i>0;i--){
            int min = arr[i-1];
            if((max | min) > max){
                max |= min;
                count = count+left+1;
                left = 0;
            }else if((max |= min) == max){
                left += 1;
                continue;
            }else{
                break;
            }
        }
        for(int i = index;i < n-1;i++){
            int min = arr[i+1];
            if((max | min) > max){
                max |= min;
                count = count+right+1;
                right = 0;
            }else if((max |= min) == max){
                right += 1;
                continue;
            }else{
                break;
            }
        }
        System.out.println(count);
    }
}
