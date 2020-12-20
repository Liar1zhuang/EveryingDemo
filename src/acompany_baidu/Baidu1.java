package acompany_baidu;

import java.util.Arrays;
import java.util.Scanner;

public class Baidu1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String location = sc.nextLine();
        int[] locations = Arrays.stream(location.split(" ")).mapToInt(Integer::parseInt).toArray();
        char[] movement = sc.nextLine().toCharArray();
        for (int i = 0;i < movement.length;i++){
            if(movement[i] == 'U'){
                locations[1]++;
            }else if(movement[i] == 'D'){
                locations[1]--;
            }else if(movement[i] == 'R'){
                locations[0]++;
            }else if(movement[i] == 'L'){
                locations[0]--;
            }
        }
        System.out.println(locations[0] + " " + locations[1]);
    }
}
