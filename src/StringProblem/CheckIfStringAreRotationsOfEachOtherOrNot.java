package StringProblem;

import java.util.Scanner;

public class CheckIfStringAreRotationsOfEachOtherOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String p=sc.next();
        String q=sc.next();
        System.out.println(reverseString(p,q));
    }
    public static int   reverseString(String p, String q){

       int arr1[]=new int[26];

       for(int i=0;i<p.length();i++){
           char ch1=p.charAt(i);
           char ch2=q.charAt(i);
           arr1[ch1-'a']++;
           arr1[ch2-'a']--;
       }
       for(int i=0;i<p.length();i++){
           if(arr1[i]!=0)return 0;
       }
       return 1;
    }
}
