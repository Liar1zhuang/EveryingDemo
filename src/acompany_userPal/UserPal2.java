package acompany_userPal;

import java.util.Scanner;

public class UserPal2 {
    public static void main(String[] args) {
        int[][] matrix= {{1,2,3},
            {4,5,6},
            {7,8,9}};
        convert(matrix);
        for(int i = 0;i < matrix.length;i++){
            for(int j = 0;j < matrix[0].length;j++){
                System.out.println(matrix[i][j]);
            }
        }
    }

    public static int[][] convert (int[][] matrix) {
        // write code here
        int row = matrix.length;
        int col = matrix[0].length;
        int start = 0;
        int end = row - 1;
        while(start < end){
            for(int i = 0;i < col;i++){
                int temp = matrix[start][i];
                matrix[start][i] = matrix[end][i];
                matrix[end][i] = temp;
            }
            start++;
            end--;
        }
        return matrix;
    }
}
