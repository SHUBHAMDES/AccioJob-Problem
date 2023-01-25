package StringProblem;

import java.util.Scanner;

public class PairStar {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        char[] arr = str.toCharArray();
        String s="";
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                s+=arr[i];
                s+="*";

            }else{
                s+=arr[i];
            }
        }
        s+=arr[n-1];
        System.out.println(s);
    }
}