package glodon;

import java.util.Scanner;

//广联达第三题，思路没问题，构建目标数组时超内存
//原因：对于java的标准输入输出不够熟悉
public class Glodon3 {
    public static void main(String[] args) {
        Scanner inNum = new Scanner(System.in);
        while(inNum.hasNext()){
            int num = inNum.nextInt();
            int range = inNum.nextInt();
            int[] number=new int[num*2];
            for(int i=0;i<num*2;i++){
                number[i]=inNum.nextInt();
            }
            int max = 0;
            for(int i = 0;i < num*2;i+=2){
                max = Math.max(number[i],max);
            }
            int[] arr = new int[max];
            for(int i = 0;i < num*2;i+=2){
                arr[number[i]-1] = number[i+1];
            }
            int count = getCount(arr,range);
            System.out.println(count);
        }
    }
    public static int getCount(int[] arr,int range){
        int num = 0;
        for(int i = 0;i < arr.length;i++){
            while(arr[i] > 0){
                int j = i + 2 * range;
                if(j > arr.length-1){
                    j = arr.length-1;}
                for(int k = i;k <= j;k++){
                    arr[k]--;
                }
                num++;
            }
        }
        return num;
    }
}
