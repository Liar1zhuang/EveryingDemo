package acompany_vipkid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class VipKid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<int[]> res = new ArrayList<>();
        List<int[]> list = new ArrayList<>();
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            String[] ss = s.split(" ");
            int first = Integer.parseInt(ss[0]);
            int second = Integer.parseInt(ss[1]);
            int[] sub = new int[2];
            sub[0] = first;
            sub[1] = second;
            list.add(sub);
            int size = list.size();
            int[][] source = new int[size][2];
            for(int i = 0;i < size;i++){
                source[i] = list.get(i);
            }
            Arrays.sort(source, (o1, o2) -> (o1[0] - o2[0]));
            int i = 0;
            int num = source.length;

            while (i < num) {
                int start = source[i][0];
                int end = source[i][1];
                while (i < num - 1 && end >= source[i + 1][0]) {
                    end = Math.max(end, source[i + 1][1]);
                    i++;
                }
                res.add(new int[]{start, end});
                i++;
            }
            
            for (int p = 0; p < res.size(); p++) {
                for (int q = 0; q < 2; q++) {
                    if (q == 0) {
                        System.out.println(res.get(p)[q] + " ");
                    } else {
                        System.out.println(res.get(p)[1] + "\n");

                    }
                }
            }
        }
    }
}
