package Recursion;

import java.util.Scanner;

public class RecursiveDigitSum {
   public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String n=sc.nextLine();
int k=sc.nextInt();
int result=superDigit(n,k);
      System.out.println(result);
      sc.close();
   }
   private static int superDigit(String n,int k){
       int sum=0;
       for(int i=0;i<n.length();i++){
           sum=sum+Integer.parseInt(n.charAt(i)+"");
       }
       sum=supersingleDigit(sum *k);
       return  sum;
   }
   private static int supersingleDigit(int n){
       if(n<10) return n;
       else{
           int num=0;
           while(n>0){
              num+=n%10;
              n=n/10;
           }
           return supersingleDigit(num);
           }
       }

   }
