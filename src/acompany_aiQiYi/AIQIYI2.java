package acompany_aiQiYi;

import java.util.*;

public class AIQIYI2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while(sc.hasNext()){
            list.add(sc.nextInt());
        }
        int res = list.get(0);
        int flag = 0;
        for(int i = 0;i < list.size();i++){
            if(flag == 0){
                res = list.get(i);
            }
            flag += list.get(i) == res ? 1 : -1;
        }
        System.out.println(res);
    }
}
