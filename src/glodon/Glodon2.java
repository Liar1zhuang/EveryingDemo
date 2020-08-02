package glodon;

import java.util.Arrays;
import java.util.Scanner;

//广联达第二题，挪动一个数字至最前，使数组有序。AC 100%
//原数组与有序数组作比较，从最大的数开始，相对位置有序的不需要移动，总数减掉不需移动的则为最终需要移动的次数
public class Glodon2 {
    public static void main(String[] args) {
        Scanner inNum = new Scanner(System.in);
        while(inNum.hasNext()){
            int num = inNum.nextInt();
            int[] number=new int[num];
            for(int i=0;i<num;i++){
                number[i]=inNum.nextInt();
            }
            int res = findCount(number);
            System.out.println(res);
        }
    }
    public static int findCount(int[] arr){
        int count = 0;
        int n = arr.length;
        int[] sortedArr = Arrays.copyOf(arr,n);
        Arrays.sort(sortedArr);
        for(int i = n-1,j = n-1;i >= 0;i--){
            if(arr[i] == sortedArr[j]){
                count++;
                j--;
            }
        }
        return n - count;
    }
}
