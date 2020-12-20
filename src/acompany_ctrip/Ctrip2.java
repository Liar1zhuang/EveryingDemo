package acompany_ctrip;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ctrip2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.next().split(" ");
        int length = strs.length;
        boolean flag = false;
        int times = 1;
        for(String str : strs){
            int len = str.length();
            times *= len;
        }
        for(int i = 0;i < times;i++){
            List<String> list = new ArrayList<>();
            for (String str : strs){

                if(str.length() == 1){
                    list.add(str);
                }else{

                }
            }
        }
    }
}
