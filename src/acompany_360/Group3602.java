package acompany_360;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Group3602 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int t = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int sub = Integer.MAX_VALUE;
        int[][] arr = new int[m][3];
        for (int i = 0; i < m; i++) {
            for(int j = 0;j < 3;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0;i < m;i++){
            if(arr[i][0] != s){
                continue;
            }
            int middle = arr[i][1];
            while(middle != t){
                for(int j = 0;j < m;j++){

                }
            }
            if(middle == t){
                min = Math.min(min,arr[i][2]);
            }
        }
        System.out.println(min);
    }
}
