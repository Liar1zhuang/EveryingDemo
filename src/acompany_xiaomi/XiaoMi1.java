package acompany_xiaomi;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class XiaoMi1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        while(true){
            String s = sc.next();
            if(s.equals("")){
                System.out.println(true);
                continue;
            }
            Deque<Character> stack = new ArrayDeque<>();
            for(char c : s.toCharArray()){
                if(!stack.isEmpty() && (stack.peek() + 1 == c || stack.peek() + 2 == c)){
                    stack.pop();
                }else {
                    stack.push(c);
                }
            }
            System.out.println(stack.isEmpty());
        }

    }
}
