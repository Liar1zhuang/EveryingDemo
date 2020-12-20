package acompany_meituan;

import java.util.Arrays;
import java.util.Scanner;

public class Meituan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        int[][] sortedArr = new int[n][3];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < 2;j++){
                arr[i][j] = sc.nextInt();
                sortedArr[i][j] = arr[i][j];
                sortedArr[i][3] = i+1;
            }
        }
        Arrays.sort(sortedArr,(o1, o2) -> o2[1] - o1[1]);
        for(int i = 1;i < sortedArr.length;i++){
            if(sortedArr[i][1] < sortedArr[i-1][1]){
                System.out.println(sortedArr[i-1][2] + " ");
            }else{
                int j = i;
                while(true){
                    i++;
                    if(sortedArr[i][1] < sortedArr[j][1]){
                        i--;
                        break;
                    }
                }
                int[][] sortedArr2 = Arrays.copyOfRange(sortedArr,j,i+1);
                //TODO
            }
        }


    }
}
