package acompany_58;

import java.util.*;


public class Group581 {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> values = new ArrayList<>();
        ArrayList<String> sub1 = new ArrayList<>();
        sub1.add("a");
        sub1.add("aa");
        sub1.add("bb");
        sub1.add("c");
        ArrayList<String> sub2 = new ArrayList<>();
        sub2.add("aaa");
        sub2.add("bbb");
        values.add(sub1);
        values.add(sub2);
        ArrayList res = findCommonString(values);
        for(int i = 0;i < res.size();i++){
            System.out.println(res.get(i));
        }
    }
    /**
     *
     * @param values string字符串ArrayList<ArrayList<>>
     * @return string字符串ArrayList
     */
    public static ArrayList<String> findCommonString (ArrayList<ArrayList<String>> values) {
        // write code here
        ArrayList<String> res = new ArrayList<>();
        Map<String,Integer> map = new HashMap();
        int cur = 0;
        for(List<String> sub : values){
            int size = sub.size();
            for(int i = 0;i < size;i++){
                String key = sub.get(i);
                if(!map.containsKey(key)){
                    map.put(key,1);
                }
                if(map.containsKey(key) && cur == map.get(key)){
                    int num = map.get(key);
                    num++;
                    map.put(key,num);
                }
            }
            cur++;
        }
        int m = values.size();
        for(int i = 0;i < m;i++){
            List<String> list = values.get(i);
            int n = list.size();
            for(int j = 0;j < n;j++){
                String k = list.get(j);
                if(map.get(k) == m && !res.contains(k)){
                    res.add(k);
                }
            }
        }
        return res;
    }
}
