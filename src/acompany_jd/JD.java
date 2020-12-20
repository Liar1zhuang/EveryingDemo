package acompany_jd;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JD {
    public static void main(String[] args) {
        int[] nums = {1,5,6,2,4,4,7,7,7,7,5};
        Object[] res = fastsort(nums);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
    public static Object[] fastsort(int[] nums){
        int size = nums.length;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < size; i++) {
            set.add(nums[i]);
        }
        Object[] newNums = set.toArray();

        for(int i = 0;i < newNums.length;i++){
            for(int j = i+1;j < newNums.length-i;j++){
                if((int)newNums[i] > (int)newNums[j]){
                    Object temp = newNums[i];
                    newNums[i] = newNums[j];
                    newNums[j] = temp;
                }
            }
        }
        return newNums;



    }
}
