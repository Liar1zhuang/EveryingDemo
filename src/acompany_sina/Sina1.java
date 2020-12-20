package acompany_sina;

import java.util.Scanner;

public class Sina1 {
    static int len;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] chars = s.toCharArray();
        len = chars.length;
        boolean flag = true;
        chars = heapSort(chars);
        for(int i = 0;i < chars.length-1;i++){
            if(chars[i] == chars[i+1]){
                flag = false;
            }
        }
        System.out.println(flag);
    }


    public static char[] heapSort(char[] array){
        len = array.length;
        if(len < 1)
            return array;
        buildMaxHeap(array);
        while(len > 0){
            swap(array,0,len-1);
            len--;
            adjustHeap(array,0);
        }
        return array;
    }

    public static void buildMaxHeap(char[] array){
        for(int i = (len/2 - 1);i >= 0;i--){
            adjustHeap(array,i);
        }
    }

    public static void adjustHeap(char[] array,int i){
        int maxIndex = i;
        if(i * 2 < len && array[i * 2] > array[maxIndex])
            maxIndex = i * 2;
        if(i * 2 + 1 < len && array[i * 2 + 1] > array[maxIndex])
            maxIndex = i *2 + 1;
        if(maxIndex != i){
            swap(array,maxIndex,i);
            adjustHeap(array,maxIndex);
        }
    }

    public static void swap(char[] array,int left,int right){
        char temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
