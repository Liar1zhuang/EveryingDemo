package acompany_shunFeng;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ShunFeng1 {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int[] findNumber(int num) {
        int[] res = new int[2];
        if(num == 1){
            res[0] = 2;
            res[1] = -1;
        }else if(num == 2147483647){
            res[0] = -1;
            res[1] = -1;
        } else if(num % 2 == 0 && num < 1073741824){
            res[0] = num << 1;
            res[1] = num >> 1;
        }else if(num % 2 == 1 && num < 1073741824){
            res[0] = num << 1;
            res[1] = -1;
        }else if(num % 2 == 0 && num >= 1073741824) {
            res[0] = -1;
            res[1] = num >> 1;
        } else{
            res[0] = -1;
            res[1] = -1;
        }
        return res;
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] res;

        int _num;
        _num = Integer.parseInt(in.nextLine().trim());

        res = findNumber(_num);
        for(int res_i=0; res_i < res.length; res_i++) {
            System.out.println(String.valueOf(res[res_i]));
        }

    }
}
