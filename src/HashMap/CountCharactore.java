package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class CountCharactore {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Character,Integer>hm=new HashMap<>();
        //take String Value and length of the String
        System.out.println("Write the String Input:");
        //value
        String str=sc.next();
        //length
        int n=str.length();
        //take one for loop to iterate all string and initialise HM
        for(int i=0;i<n;i++)
        {
            char ch=str.charAt(i);

            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);  //same like as a array EX: arr[ch-'a']++
            }else hm.put(ch,1);
        }
    }
}
