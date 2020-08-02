package apeAssistant;

import java.util.Scanner;
//小猿老师击鼓传花
public class Ape1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;
        int K;
        while (input.hasNext()){
            N = input.nextInt();
            K = input.nextInt();
            System.out.println(Solution(N,K));
        }
    }
    public static long Solution(int n,int k){
        int i = 2;
        int M = 1000000007;
        long res = 0;
        long choose = 0;
        long chooseNot = k-1;
        if(n == 1){
            return 0;
        }
        if(n == 2){
            return k-1;
        }
        while(i < n){
            res = ((k-2)*chooseNot + (k-1)*choose) % M;
            choose = chooseNot;
            chooseNot = res;
            i++;
        }
        return res;
    }
}
