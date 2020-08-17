package acompany_tigerGroup;

import java.util.PriorityQueue;
import java.util.Scanner;

public class tigerGroup3 {
    public static void main(String[] args) {
        System.out.println(frequencySort("tttttttaeeazaa"));
    }
    public static String frequencySort (String s) {
        // write code here
        int[] arr = new int[128];
        for(int i = 0;i < s.length();i++){
            arr[s.charAt(i)]++;
        }

        PriorityQueue<Character> queue = new PriorityQueue<>(128,(a, b) ->arr[b]-arr[a]);
        StringBuilder res = new StringBuilder();
        for(int i = 0;i < arr.length;i++){
            if(arr[i] != 0){
                queue.offer((char)i);
            }
        }
        while(!queue.isEmpty()){
            char c = queue.poll();
            while(arr[c]-- > 0){
                res.append(c);
            }
        }
        return res.toString();
    }
}
