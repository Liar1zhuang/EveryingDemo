package acompany_alibaba;

//有n个物品编号为1-n，现将其重排列，但要求相邻两物品的编号差值的绝对值不等于1，按字典序输出所有满足要求的方案
//阿里笔试题，回溯算法，找到所有可能的组合，最后筛选出符合要求的
import java.util.LinkedList;
import java.util.List;

public class Alibaba1 {
    public static List<List<Integer>> res = new LinkedList<>();

    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> list = reArrange(n);
        for (List<Integer> first : list){
            StringBuilder sb = new StringBuilder();
            for(int second : first){
                sb.append(second);
            }
            System.out.println(sb.toString());
        }
    }

    public static List<List<Integer>> reArrange(int n){
        LinkedList<Integer> sub = new LinkedList<>();
        LinkedList<Integer> track = new LinkedList<>();
        for(int i = 1;i <= n;i++){
            sub.add(i);
        }
        backtrack(sub,track);
        return res;
    }

    public static void backtrack(LinkedList<Integer> sub,LinkedList<Integer> track){
        int count = 0;
        if(sub.size() == track.size()){
            for(int i = 0;i < track.size()-1;i++){
                if(Math.abs(track.get(i) - track.get(i+1)) > 1){
                    count++;
                }
            }
            if(count == track.size()-1){
                res.add(new LinkedList<>(track));
            }
        }

        for(int i = 0;i < sub.size();i++){
            if(track.contains(sub.get(i))){
                continue;
            }
            track.add(sub.get(i));
            backtrack(sub,track);
            track.removeLast();
        }

    }
}
