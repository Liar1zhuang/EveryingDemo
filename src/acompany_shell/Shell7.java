package acompany_shell;

import java.util.Arrays;
import java.util.Scanner;

public class Shell7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr =new int[2][2*n];
        for(int i = 0;i < 2;i++){
            for(int j = 0;j < 2*n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        int res = 0;
        int[] newArr = new int[2*n];
        for(int i = 0;i < 2*n;i++){
            newArr[i] = arr[1][i] - arr[0][i];
        }
        Arrays.sort(newArr);
        for(int i = 2*n-1;i >= 0;i--){
            count += newArr[i];
            if(count <= 0){
                res = 1-count;
            }
        }
        System.out.println(res);
    }
}
