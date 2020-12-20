package acompany_jd;

public class JD3 {
    public static void main(String[] args) {
        int[] nums = {1,4,6,7,8,2,5,32};
        int[] sortedNums = quickSort(nums,0,7);
        for (int i = 0;i < sortedNums.length;i++){
            System.out.println(sortedNums[i]);
        }

    }
    public static int[] quickSort(int[] nums,int left,int right){
        if(left >= right){
            return null;
        }
        int middle = partition(nums,left,right);
        quickSort(nums,left,middle-1);
        quickSort(nums,middle+1,right);
        return nums;
    }
    public static int partition(int[] nums,int left,int right){
        int pivot = nums[right];
        int i = left;
        for(int j = left;j < right;j++){
            if(nums[j] <= pivot){
                swap(nums,i,j);
                i++;
            }
        }
        swap(nums,i,right);
        return i;
    }

    private static void swap(int[] nums,int left,int right){
        if(left == right){
            return;
        }
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
