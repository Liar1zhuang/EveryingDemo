package acompany_convenientBee;

import java.util.Scanner;

public class ConvenientBee3 {
    static char[][] s = {
            {'0', '1', 'C', 'H', 'A'},
            {'9', 'E', '7', 'B', 'I'},
            {'K', 'D', '4', '8', 'J'},
            {'6', '5', 'F', 'G', 'O'},
            {'L', 'N', 'M', '2', '3'}};
    static boolean flag = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.next();
            char[] arr = str.toCharArray();
            int m = 0;
            int n = 0;
            for(int i = 0;i < 5;i++){
                for(int j = 0;j < 5;j++){
                    if(s[i][j] == arr[0]){
                        m = i;
                        n = j;
                        dfs(arr,m,n,1);
                        break;
                    }
                }
            }
            System.out.println(flag);
            flag = false;
        }
    }

    private static void dfs(char[] arr,int m,int n,int index){
        if(index == arr.length){
            flag = true;
            return;
        }
        if(m > 0 && s[m-1][n] == arr[index]){
            dfs(arr,m-1,n,index+1);
        }else if(m < 4 && s[m+1][n] == arr[index]){
            dfs(arr,m+1,n,index+1);
        }else if(n >0 && s[m][n-1] == arr[index]){
            dfs(arr,m,n-1,index+1);
        }else if(n < 4 && s[m][n+1] == arr[index]){
            dfs(arr,m,n+1,index+1);
        }
    }
}
