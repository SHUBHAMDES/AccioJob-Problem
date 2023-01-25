package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class MaximunOccuringCharactore {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(maximumOccuringCharactore(str));

    }
    public static char maximumOccuringCharactore(String str)
    {
        int n=str.length();
        HashMap<Character,Integer>li=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            char ch=str.charAt(i);
            if(li.containsKey(ch)){
                li.put(ch,li.get(ch)+1);
            }else{
                li.put(ch,1);
            }

        }
        char c=' ';
        int maxfrequncy=0;
        for(Character chr:li.keySet()){
            if(maxfrequncy<li.get(chr)){
                maxfrequncy=li.get(chr);
                 // chr= (char) Math.min(c,chr);
                 c=chr;

            }

        }
        System.out.println("max Frequncy Of Charactore: "+maxfrequncy);
        return c;
    }
}
