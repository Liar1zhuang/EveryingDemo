package backTrack;

import java.util.LinkedList;
import java.util.List;

//全排列问题
public class FullPermute {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        FullPermute fullPermute = new FullPermute();
        List<List<Integer>> result = fullPermute.permute(numbers);
        System.out.println(result);
    }

    List<List<Integer>> res = new LinkedList<>();

    private List<List<Integer>> permute(int[] nums){
        LinkedList<Integer> track = new LinkedList<>();

        backtrack(nums,track);
        return res;
    }

    private void backtrack(int[] nums,LinkedList<Integer> track){
        //触发结束条件
        if(track.size() == nums.length){
            res.add(new LinkedList<>(track));
            return;
        }

        for (int i = 0;i < nums.length;i++){
            //排除不合法的选择
            if(track.contains(nums[i]))
                continue;
            //做选择
            track.add(nums[i]);
            //进入下一层决策树
            backtrack(nums,track);
            //撤销选择
            track.removeLast();
        }
    }
}
