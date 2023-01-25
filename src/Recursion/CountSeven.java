package Recursion;

import java.util.Scanner;

public class CountSeven {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = String.valueOf(n);
        System.out.println(countSeven(s,0,0));

    }
   public static int countSeven(String s,int index,int count){

        if(s.length()==index)return count;
        char ch=' ';
        if(s.charAt(index)=='7')count++;
          return countSeven(s,index+1,count);
   }
}