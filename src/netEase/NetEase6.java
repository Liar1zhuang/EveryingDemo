package netEase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NetEase6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] nums = new int[m];
            int[] sortedNums = new int[m];
            for (int i = 0; i < m; i++) {
                nums[i] = sc.nextInt();
                sortedNums[i] = nums[i];
            }
            Arrays.sort(sortedNums);
            int k = n - m;
            List<Integer> need = new ArrayList<>();
            int count = 1;

            for (int i = 0; i < sortedNums.length; i++) {
                if (sortedNums[i] == count) {
                    count++;
                    continue;
                } else {
                    need.add(count);
                    count++;
                    k--;
                    i--;
                    if (k == 0) {
                        break;
                    }
                }
            }
            while (k > 0) {
                need.add(sortedNums[sortedNums.length - 1] + 1);
                k--;
            }

            int p = 0;
            int q = 0;
            k = n - m;
            while (p < m && q < k) {
                if (nums[p] < need.get(q)) {
                    System.out.println(nums[p] + " ");
                    p++;
                } else {
                    System.out.println(need.get(q) + " ");
                    q++;
                }
            }
            while (p == m && q < k) {
                if (q - k == 1) {
                    System.out.println(need.get(q));
                } else {
                    System.out.println(need.get(q) + " ");
                }
                q++;
            }
            while (p < m && q == k) {
                if (p - m == 1) {
                    System.out.println(nums[p]);
                } else {
                    System.out.println(nums[p] + " ");
                }
                p++;
            }
        }

    }
}
