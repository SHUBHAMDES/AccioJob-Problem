package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class ValidAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();


        System.out.println(isAnagram(s,t));

    }
    public static boolean isAnagram(String s,String t)
    {
        HashMap<Character,Integer>hm1=new HashMap<>();
        HashMap<Character,Integer>hm2=new HashMap<>();
        if(s.length()!=t.length())return false;

        //Initialisation of The HashMap
        for(int i=0;i<s.length();i++)
        {
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            //first hash map initialisation

//            if(hm1.containsKey(ch1)) hm1.put(ch1,hm1.get(ch1)+1);
//            else hm1.put(ch1,1);

            hm1.put(ch1,hm1.getOrDefault(ch1,0)+1);



            //secound hashmap initialisation
//            if(hm2.containsKey(ch2)) hm2.put(ch2,hm2.get(ch2)+1);
//            else hm2.put(ch2,1);
            hm2.put(ch2,hm2.getOrDefault(ch2,0)+1);

        }
        //Logic to check given String Valid Anagram or Not
//        for(int i=0;i<s.length();i++)
//        {
//            if(hm1.get(i)equalshm2.get(i)){
//                return false;
//            }
//        }
        System.out.println(hm1);
        System.out.println(hm2);
        if(hm1.equals(hm2))return true;

        return false;
    }
}
