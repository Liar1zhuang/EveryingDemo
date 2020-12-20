package acompany_xiaomi;

import java.util.*;

public class XiaoMi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = "";
        Set<Character> set = new HashSet<>();
        for(int i = 0;i < s.length();i++){
            if(set.add(s.charAt(i))){
                res += s.charAt(i);
            }
        }
        System.out.println(res);
    }
}
