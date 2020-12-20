package acompany_jd;

import java.util.Scanner;

//雪球滚动，一个二维数组，其中有数字的元素组成一个三角形，每个元素有一个值，从三角形
//顶端开始滚动，每次只能向右下、正下、左下滚动，求滚动路径的最大值


//思路：我们考虑这个过程，第二行第二列这个元素，只能到达第三行1，2，3列这三个元素中的某一个。
//所以我们可以倒推，若得到的最大值经过了第二行第二列这个元素，那么第三行取到的一定是max(arr[3][1], arr[3][2],arr[3][3]);
//Ok,同理若取了arr[2][3]这个元素，且得到了最大值，那么，则第三行取的必是max(arr[3][2], arr[3][3], arr[3][4]);
//从第n-1行开始转移，直到转移到arr[1][n]这个元素，那么arr[1][n]这个元素，就是整个链的最大值。
public class JD2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[][] arr = new long[n + 1][2 * n];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 2 * i - 1; j++){
                arr[i][n - i + j] = sc.nextLong();
            }
        }
        for(int i = n - 1; i >= 1; i--){
            for(int j = 1; j <= 2 * i - 1; j++){
                arr[i][n - i + j] += Math.max(Math.max(arr[i + 1][n - i + j - 1], arr[i + 1][n - i + j]), arr[i + 1][n - i + j + 1]);
            }
        }
        System.out.println(arr[1][n]);
    }
}
