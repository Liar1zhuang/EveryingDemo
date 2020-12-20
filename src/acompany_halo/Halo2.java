package acompany_halo;

import java.util.Scanner;

public class Halo2 {
    public static void main(String[] args) {
        String[] chars = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        String currentValue = "玖玖玖玖玖玖";
        System.out.println(nextValue(chars,currentValue));
    }
    public static String nextValue (String[] chars, String currentValue) {
        // write code here
        String res = currentValue;
        int n = chars.length;
        int len = currentValue.length();
        String first = chars[0];
        String second = chars[1];
        String last = chars[n-1];
        String currentLast = String.valueOf(currentValue.charAt(len-1));
        int lastNum = 0;
        if(currentLast.equals(last)){
            for(int i = len-1;i >=0;i--){
                if(String.valueOf(currentValue.charAt(i)).equals(last)){
                    lastNum++;
                }else{
                    break;
                }
            }
            String plus = "";
            for(int j = 0;j < lastNum;j++){
                plus += first;
            }
            if(len == lastNum){
                res = second + plus;
            }else{
                for(int k = 0;k < n-1;k++){
                    if(chars[k].equals(String.valueOf(currentValue.charAt(len-1-lastNum)))){
                        String plusTwo = chars[k+1];
                        res = res.substring(0,len-1-lastNum) + plusTwo + plus;
                    }
                }
            }
            return res;
        }else{
            for(int i = 0;i < n;i++){
                if(chars[i].equals(currentLast)){
                    String plus = chars[i+1];
                    res = res.substring(0,len-1) + plus;
                }
            }
        }
        return res;
    }
}
