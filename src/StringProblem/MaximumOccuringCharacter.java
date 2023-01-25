package StringProblem;

import java.util.Scanner;

public class MaximumOccuringCharacter {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n=str.length();
        char c=' ';
        int arr[]=new int[26];
        for(int i=0;i<n;i++)
        {
             char ch=str.charAt(i);
             arr[ch-'a']++;
        }
        int fer=0;
            for(int i=0;i<26;i++)
            {
                if(fer<arr[i]){
                    fer=arr[i];
                    c= (char) ('a'+i);
                }
            }
        System.out.println(c);
    }
}