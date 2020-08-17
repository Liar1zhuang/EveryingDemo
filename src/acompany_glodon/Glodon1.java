package acompany_glodon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//广联达第一题：数组中找到四条边组成最大平行四边形的面积，题比较简单，思路没问题，AC 45%，原因是需要用long型存储数组中元素
//防止大小越界，很操蛋，以后需要更加细心，注意输入的范围
public class Glodon1 {
    public static void main(String[] args) {
        Scanner inNum = new Scanner(System.in);
        while(inNum.hasNext()){
            int num = inNum.nextInt();
            int[] number=new int[num];
            for(int i=0;i<num;i++){
                number[i]=inNum.nextInt();
            }
            Arrays.sort(number);
            int res = getMax(number);
            System.out.println(res);
        }
    }

    public static int getMax(int[] number){
        List<Integer> list = new ArrayList<>();
        int i = number.length-1;
        while(i > 0){
            if(number[i] == number[i-1]){
                list.add(number[i]);
                if(list.size() == 2){
                    break;
                }
                i --;
            }
            i--;
        }
        if(list.size() == 2){
            return list.get(0) * list.get(1);
        }else{
            return -1;
        }
//        int a = 0;
//        int b = 0;
//        int k = 0;
//        for(int i = number.length-1;i >= 1;i--){
//            if(number[i] == number[i-1]){
//                a = number[i];
//                k = i-2;
//                break;
//            }
//        }
//        if(k >0){
//            for(int j = k;j >= 1;j--){
//                if(number[j] == number[j-1]){
//                    b = number[j];
//                    break;
//                }
//            }
//        }
//        if(a != 0 && b != 0){
//            return a*b;
//        }else{
//            return -1;
//        }
    }
}
