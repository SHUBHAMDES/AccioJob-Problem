package StringProblem;

import java.util.Scanner;

public class CountXString {
    public static void main(String[] args) {


    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    int count=0;
        System.out.println( x_String(str,0,count));



}
public static int x_String(String str,int index,int count)
{
    if(str.length()==index)return count;
    char ch=str.charAt(index);
    if(ch=='x')count++;
    return x_String(str,index+1,count);
}
}
