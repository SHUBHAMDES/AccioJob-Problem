package StringProblem;

import java.util.Scanner;

public class ReverseStringWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
       int n=sc.nextInt();

       for(int j=1;j<=n;j++) {
           String str=sc.nextLine();
            String arr[]=str.split(" ");
            for(int i=arr.length-1;i>=0;i--)
            {
                System.out.print(arr[i]+" ");
            }
           // System.out.println();
         }
    }
}
