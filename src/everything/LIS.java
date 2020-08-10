package everything;

//最长上升子序列
public class LIS {

    public static void main(String[] args) {
        int[] nums = {10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(nums));
    }
    public static int lengthOfLIS(int[] nums) {
        int[] res =new int[nums.length];
        int len = 0;
        for(int num : nums){
            if(len == 0 || num > res[len-1]){
                res[len] = num;
                len++;
            }else{
                int l = 0;
                int r = len - 1;
                while(l <= r){
                    int mid = l + (r - l) / 2;
                    if(res[mid] < num){
                        l = mid+1;
                    }else{
                        r = mid-1;
                    }
                }
                res[l] = num;
            }
        }
        return len;
    }
}
