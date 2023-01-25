package Loping;

import java.util.Scanner;

public class countDigit {
    public static void main(String[] args) {
        System.out.println(0);
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        System.out.println(printCount(n));
    }
    public static int printCount(long n){
        int count=0;
        for(long  i=n;i>0;i=i/10){
            count++;
        }
        return count;
    }

}
