package HashMap;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class CountMaxFrequnceyOfGivenChractore {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();

        CountMaxFrequnceyOfGivenChractore obj=new CountMaxFrequnceyOfGivenChractore();
         obj.countFrequncy(str);

    }
    public  void countFrequncy(String str){

        int n=str.length();
        TreeMap<Character,Integer> hm=new TreeMap<>();

        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(hm.containsKey(ch))hm.put(ch,hm.get(ch)+1);//if value is already present
            else hm.put(ch,1);//if value is first time occurs
        }
        int max_frequncy=0;
        char maxFreWord=' ';
        for(char ch:hm.keySet()){
            if(max_frequncy<hm.get(ch)){
                max_frequncy=hm.get(ch);
                maxFreWord=ch;
            }
        }

        System.out.println("maxFreWord ( "+maxFreWord+" ) "+"max_frequncy "+max_frequncy);



    }
}