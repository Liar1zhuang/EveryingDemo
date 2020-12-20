package acompany_userPal;

import java.util.Arrays;

public class UserPal1 {
    public static void main(String[] args) {
        System.out.println(compress("abbbca"));
    }
    public static String compress (String str) {
        // write code here
        String res = "";
        char[] arr = str.toCharArray();
        if(str.length() < 2){
            return str;
        }
        int n = 1;
        for(int i = 1;i < arr.length;i++){
            if(arr[i] == arr[i-1]){
                n++;
            }else{
                res += arr[i-1];
                res += n;
                n = 1;
            }
        }
        res += arr[arr.length-1];
        res += n;
        return res.length() < str.length() ? res : str;
    }
}
