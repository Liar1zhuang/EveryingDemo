package acompany_netEase;

import java.util.Scanner;


//小易是班级的英语课代表, 他开发了一款软件开处理他的工作。
//小易的软件有一个神奇的功能，能够通过一个百分数来反应你的成绩在班上的位置。“成绩超过班级 ...% 的同学”。
//设这个百分数为 p，考了 s 分，则可以通过以下式子计算得出 p：
//p = ( 分数不超过 s 的人数 - 1) / 班级总人数 x 100%
//突然一天的英语考试之后，软件突然罢工了，这可忙坏了小易。成绩输入这些对于字写得又快又好的小易当然没有问题，但是计算这些百分数……这庞大的数据量吓坏了他。
//于是他来找到你，希望他编一个程序模拟这个软件：给出班级人数 n，以及每个人的成绩，请求出某几位同学的百分数。
public class NetEase2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] stu = new int[n];
        int[] grade = new int[151];
        int[] profix = new int[152];//
        for(int i = 0;i < n;i++){
            stu[i] = sc.nextInt();
            grade[stu[i]]++;
        }
        profix[0] = grade[0];
        for(int i = 1;i <=150;i++){
            profix[i] = profix[i-1] + grade[i];
        }
        int m = sc.nextInt();
        for(int i = 0;i < m;i++){
            int cur = sc.nextInt();
            double res = (profix[stu[cur-1]] - 1) / (double)n;
            System.out.println(String.format("%.6f",res*100));
        }
    }
}
