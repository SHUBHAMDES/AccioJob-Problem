package StringProblem;

import java.util.Scanner;

public class ReverseWordInGivenString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        int index=s.length()-1;
        System.out.println( reverseString(s,index,""));

    }
    public static String reverseString(String s,int index,String str){

        str+=s.charAt(index);
     if(index==0)return str;

     return reverseString(s,index-1,str);

    }
}
