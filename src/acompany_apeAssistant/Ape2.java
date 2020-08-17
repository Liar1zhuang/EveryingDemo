package acompany_apeAssistant;

import java.util.Scanner;

public class Ape2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();
        int K = input.nextInt();
        int[][] arr = new int[N][M];
        for(int i = 0;i < N;i++){
            for(int j = 0;j < M;j++){
                arr[i][j] = input.nextInt();
            }
        }
//        return dfs();

    }
    private static int dfs(){
        return -1;
    }
}
