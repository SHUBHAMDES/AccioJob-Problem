package Loping;

import java.util.Scanner;

public class CrazyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n){
        int l=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                System.out.print(" ");
            }
           for(int k=0;k<=i;k++){
               if(l==10)l=1;
               System.out.print(l++);
           }
            System.out.println();
        }
    }
}
