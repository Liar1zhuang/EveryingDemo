package acompany_alibaba;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Alibaba2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[] hasMoney = new int[n];
        int[][] house = new int[m][2];
        for(int i = 0;i < n;i++){
            hasMoney[i] = input.nextInt();
        }
        for(int i = 0;i < m;i++){
            house[i][0] = input.nextInt();
            house[i][1] = input.nextInt();
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> o2-o1);
        Arrays.sort(hasMoney);
        Arrays.sort(house,(o1,o2) -> o1[1] - o2[1]);

        long res = 0;
        int j = 0;
        for(int i = 0;i < n;i++){
            int money = hasMoney[i];
            while(j < m && money >= house[j][1]){
                queue.add(house[j][0]);
                j++;
            }
            int temp = 0;
            while(!queue.isEmpty()){
                temp = queue.poll();
            }
            res += temp;
        }
        System.out.println(res);
    }

}
