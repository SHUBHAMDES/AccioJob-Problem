package StringProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Reverse_String_word_wise {
//    public static void main(String[] args) {
//
//
//        Scanner sc = new Scanner(System.in);
//        //int tc = sc.nextInt();//1
//       // for (int i = 0; i < tc; i++) {
//           // System.out.println("tc "+tc);
//            //System.out.println(i);
//            String str=sc.nextLine();
//            //System.out.println("str"+ str);
//            printReverse(str);
//      // }
//
//    }public static void printReverse(String str){
//        ArrayList<String>ans=new ArrayList<>();
//        String []strArray=null;
//        strArray=str.split(" ");
//
//
//        for(int i=0;i<strArray.length;i++){
//                ans.add(strArray[i]);
//        }
//        Collections.reverse(ans);
//
//        for(int i=0;i<ans.size();i++){
//            System.out.print(ans.get(i)+" ");
//        }
//    }
//}
public static String reverseWords(String str)
{
    // your code here
    String words[]=str.split(" ");
    String ans="";
    for(String w:words)
    {
        StringBuilder sb=new StringBuilder(w);
        sb.reverse();
        ans+=sb.toString()+" ";
    }
    return ans.trim();
}
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String p = sc.nextLine();
        while (t > 0) {
            String s = sc.nextLine();
            System.out.println(reverseWords(s));
            t--;
        }
    }
}