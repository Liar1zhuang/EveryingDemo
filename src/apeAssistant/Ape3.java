package apeAssistant;

import java.util.*;

public class Ape3 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int N = input.nextInt();
//        int[] start = new int[N];
//        int[] end = new int[N];
//        for(int i =0;i < N;i++){
//            start[i] = input.nextInt();
//            end[i] = input.nextInt();
//        }


        Map<Integer,Integer> map = new TreeMap<>();
//        for(int i = 0; i < N;i++){
//            if(map.containsKey(start[i])){
//                int count = map.get(start[i]);
//                count++;
//                map.put(start[i],count);
//            }
//            map.put(start[i],1);
//        }
//        for(int i = 0;i < N;i++){
//            if(map.containsKey(end[i])){
//                int count = map.get(end[i]);
//                count--;
//                map.put(end[i],count);
//            }
//            map.put(end[i],-1);
//        }
//
//        int res = 0;
//        int max = 0;
        map.put(2,10);
        map.put(10,2);
        Iterator<Integer> it = map.keySet().iterator();
        while (it.hasNext()) {
            Integer key = it.next();
            System.out.println(map.get(key));
//            res = Math.max(res,max += map.get(key));
        }
//        System.out.println(res);

//        Arrays.sort(start);
//        Arrays.sort(end);
//        PriorityQueue<Integer> queue = new PriorityQueue<>();
//        queue.add(end[0]);
//        for(int i = 1;i < N;i++){
//            if(start[i] >= queue.peek()){
//                queue.poll();
//            }
//            queue.add(end[i]);
//        }
//        System.out.println(queue.size());
    }
}
