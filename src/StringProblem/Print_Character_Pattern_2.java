package StringProblem;

import java.util.Scanner;
class Solution {
    public void printPattern2(int n) {
        //Write code here and print pattern here
        //	char c=65;
        //System.out.println(ch);
        int i=65;
        int x=0;
        for(int j=0;j<n;j++){
            int count=0;
            for(int l=0;l<=j;l++){
                count++;
                if(count==2)x=i;
                char ch=(char)i;
                //System.out.println(i+" ");
                System.out.print(ch);
                i++;
                if(i==91)i=65;
            }
          if(count>1)i=x;
            System.out.println();
        }


    }
}

public class Print_Character_Pattern_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        Solution Obj = new Solution();
        Obj.printPattern2(n);
        sc.close();
    }
}
