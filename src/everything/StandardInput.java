package everything;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StandardInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while(!sc.hasNext("#")){
            int a = sc.nextInt();
            list.add(a);
        }
        System.out.println(list);
    }
}
