package acompany_aiQiYi;

import java.util.*;

public class AIQIYI3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while(sc.hasNext()){
            list.add(sc.nextInt());
        }
        int n = list.size();
        list.sort((o1, o2) -> o1 - o2);
        List<List<Integer>> res = new ArrayList<>();
        for (int one = 0; one < n; one++) {
            if (one > 0 && list.get(one) == list.get(one - 1)) {
                continue;
            }
            int three = n - 1;
            int target = -list.get(one);
            for (int two = one + 1; two < n; two++) {
                if (two > one + 1 && list.get(two) == list.get(two - 1)) {
                    continue;
                }
                while (two < three && list.get(two) + list.get(three) > target) {
                    three--;
                }
                if (two == three) {
                    break;
                }
                if (list.get(two) + list.get(three) == target) {
                    List<Integer> sub = new ArrayList<>();
                    sub.add(list.get(one));
                    sub.add(list.get(two));
                    sub.add(list.get(three));
                    res.add(sub);
                }
            }
        }
        for (int i = 0; i < res.size(); i++) {
            for (int j = 0; j < res.get(i).size(); j++) {
                System.out.print(res.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
