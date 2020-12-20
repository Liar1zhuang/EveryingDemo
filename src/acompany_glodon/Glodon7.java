package acompany_glodon;

import java.util.*;

public class Glodon7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i < n;i++){
            list.add(sc.nextInt());
        }
        int min = Integer.MAX_VALUE;
        while(true){
            Set<Integer> set = new HashSet<>();
            for(int i = 0;i < list.size();i++){
                if(!set.add(list.get(i))){
                    if(list.get(i) < min){
                        min = list.get(i);
                    }
                }
            }
            if(set.size() == list.size()){
                break;
            }else{
                int flag = 0;
                for(int i = 0;i < list.size();i++){
                    if(flag == 0 && min == list.get(i)){
                        list.remove(i);
                        flag++;
                        i--;
                        continue;
                    }else if(flag == 1 && min == list.get(i)){
                        list.set(i,list.get(i) * 2);
                        min = Integer.MAX_VALUE;
                        break;
                    }
                }
            }
        }
        for(int num : list){
            System.out.print(num +" ");
        }
    }
}
