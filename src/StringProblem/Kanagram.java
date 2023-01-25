package StringProblem;

import java.util.Scanner;

public class Kanagram {
    static int maxInt=26;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        String str1=sc.next();
        String str2=sc.next();

        if(k_anagram(k,str1,str2))System.out.println(1);
        else System.out.println(0);


    }
    public static boolean k_anagram(int k,String str1,String str2){

        int arr1[]=new int [maxInt];
        int arr2[]=new int [maxInt];

        int n=str1.length(),count=0;

        if(str1.length()!=str2.length())//check str1 and str2 length equal or not
            return false;


        //increase the first arr index if charactire is present
        for(int i=0;i<n;i++)
            arr1[str1.charAt(i)-'a']++;

        for(int i=0;i<n;i++)
            arr2[str2.charAt(i)-'a']++;

        for(int i=0;i<maxInt;i++)
        {
            if(arr1[i]>arr2[i])
            count=count+(arr1[i]-arr2[i]);
        }

        return count<=k;


    }
}

