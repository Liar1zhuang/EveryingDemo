package acompany_tigerGroup;

import java.util.Arrays;
import java.util.Scanner;

public class tigerGroup1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int capacity = sc.nextInt();
        int group = sc.nextInt();
        int[][] arr = new int[group][3];
        for(int i = 0;i < group;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = sc.nextInt();
        }
        System.out.println(minCarCount(capacity,arr));

    }
    public static int minCarCount(int capacity,int[][] trips){
        Arrays.sort(trips,((o1,o2)-> o1[1] - o2[1]));
        int k = 0;
        int start = trips[0][1];
        int end = trips[trips.length-1][2];
        for(int i = start;i < end;i++){
            float cur = i + 0.5f;
            int count = 0;
            for(int j =0;j < trips.length;j++){
                if(cur > trips[j][1] && cur < trips[j][2]){
                    count += trips[j][0];
                }
            }
            k = Math.max(k,count);
        }
        return k/capacity;
    }
}
