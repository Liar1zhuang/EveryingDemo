package acompany_aiQiYi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AIQIYI1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Map<Character,Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int res = 0;
        while(right < s.length()){
            Character c = s.charAt(right);
            right++;
            int num = map.getOrDefault(c,0);
            num++;
            map.put(c,num);
            while(map.get(c) > 1){
                Character d = s.charAt(left);
                left++;
                int num2 = map.get(d);
                num2--;
                map.put(d,num2);
            }
            res = Math.max(res,right-left);
        }
        System.out.println(res);
    }
}
