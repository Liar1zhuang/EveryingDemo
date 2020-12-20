package acompany_baidu;

import java.util.Arrays;
import java.util.Scanner;

public class Baidu2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        int[] firsts = Arrays.stream(first.split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = firsts[0];
        int m = firsts[1];
        int k = firsts[2];
        int res = 0;
        int[][] arr = new int[n][3];
        for(int i = 0;i < n;i++){
            String data = sc.nextLine();
            int[] datas = Arrays.stream(data.split(" ")).mapToInt(Integer::parseInt).toArray();
            arr[i][0] = datas[0];
            arr[i][1] = datas[1];
            arr[i][2] = datas[2];
        }

        Arrays.sort(arr,(o1,o2) -> o2[2] - o1[2]);
        int i = 0;
        while(i < n && m >= arr[i][1] && k >= arr[i][0]){
            int count = 1;
            while(i < n-1 && arr[i][2] == arr[i+1][2]){
                count++;
                i++;
            }
            if(count == 1){
                i++;
            }
            int[][] arr2 = Arrays.copyOfRange(arr,i-1,i-1+count);
            Arrays.sort(arr2,(o1,o2) -> o1[0]-o2[0]);
            for(int j = 0;j < arr2.length;j++){
                if(m >= arr2[j][1] && k >= arr2[j][0]){
                    res++;
                    m -= arr2[j][1];
                    k -= arr2[j][0];
                }
            }
            i = i-1+count;
        }
        System.out.println(res);
    }
}
