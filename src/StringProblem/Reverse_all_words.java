package StringProblem;

import java.util.Scanner;
import java.util.*;
public class Reverse_all_words {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        reverseWords (s);
    }
    public static void reverseWords(String str){
        //Write your code here and print output in this function only
       String []strArray=null;
       strArray=str.split(" ");
       for(int i=0;i<strArray.length;i++){
           String ss=strArray[i];
           for(int j=ss.length()-1;j>=0;j--){
               char ch=ss.charAt(j);
               System.out.print(ch);
           }
           System.out.print(" ");

       }

    }
}

