package StringProblem;

import java.util.Scanner;

public class FindCountUcAndLcAndNumberPresentInString {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
  Count(str);
    }
    public static void Count(String str)
    {
        int Uc=0;
        int Lc=0;
        int Number=0;
        for(int i=0;i<str.length();i++)
        {
            char s=str.charAt(i);
            if(s>='a'&&s<='z')
                Uc++;
            else if (s>='A'&&s<='Z')
                Lc++;
            else{
                Number++;
            }
        }
        System.out.println(Uc);
        System.out.println(Lc);
        System.out.println(Number);
    }
}
