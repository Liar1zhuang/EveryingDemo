package acompany_glodon;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Glodon5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> o1 - o2);
        for(int i = 0;i < n;i++){
            queue.add(sc.nextInt());
        }
        while(m > 0){
            int cur = queue.poll();
            while(cur <= queue.peek()){
                cur += x;
                m--;
            }
            queue.add(cur);
        }
        System.out.println(queue.peek());
    }
}
