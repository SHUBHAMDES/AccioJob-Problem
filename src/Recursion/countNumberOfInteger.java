package Recursion;

import java.util.Scanner;

public class countNumberOfInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        int count=0;
        System.out.println( countNumber(n,count));


    }
    public static long countNumber(long n,int count)
    {
        if(n==0)return count;
       // count= count + 1;
        return countNumber(n=n/10,count+1);


    }
}
