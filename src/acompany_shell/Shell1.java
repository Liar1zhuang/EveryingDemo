package acompany_shell;

import java.util.Scanner;

public class Shell1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left].equals(arr[right])) {
                left++;
                right--;
            } else {
                left++;
                right--;
                count++;
            }
        }
        System.out.println(count);
    }
}
