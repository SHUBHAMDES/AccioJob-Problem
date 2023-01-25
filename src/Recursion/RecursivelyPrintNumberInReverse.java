package Recursion;

import java.util.Scanner;

public class RecursivelyPrintNumberInReverse {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printReverse(n);
    }
    public  static void printReverse(int n)
    {
        if(n==0)return;
        System.out.print(n+" ");//5 4 3 2 1
        printReverse(n-1);
//        System.out.println();
//        System.out.print(n+" ");//1 2 3 4 5
    }
}