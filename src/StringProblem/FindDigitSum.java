package StringProblem;

import java.util.Scanner;

public class FindDigitSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//        String s=String.valueOf(n);
//        System.out.println(s.length());
        int sum=0;
       for(int i=n;i>0;i=i/10){
           sum+=i%10;
       }
        System.out.println(sum);
    }
}
