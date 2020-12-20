package acompany_halo;

import java.util.Scanner;

public class Halo1 {
    public static void main(String[] args) {
        int[][] matrix = {{0,3,2,0,1,0,0,0,0,5,0,0,0}};
        System.out.println(maxArea(matrix));
    }
    public static int maxArea (int[][] matrix) {
        // write code here
        int res = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                if(matrix[i][j] != 0){
                    res = Math.max(dfs(matrix,i,j),res);
                }
            }
        }
        return res;
    }
    public static int dfs(int[][] grid, int i, int j){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0){
            return 0;
        }
        int count = grid[i][j];
        grid[i][j] = 0;
        count += dfs(grid, i+1, j);
        count += dfs(grid, i-1, j);
        count += dfs(grid, i, j+1);
        count += dfs(grid, i, j-1);
        return count;
    }
}