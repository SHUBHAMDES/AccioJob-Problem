package GFG_Interview_Question;

import java.util.Scanner;

public class First_Unic_String {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        First_Unic_String obj=new First_Unic_String();
        System.out.println(obj.firstUnicCharactore(str));

    }
    public char firstUnicCharactore(String str){
        int arr[]=new int[26];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            arr[ch-'a']++;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(arr[ch-'a']==1)return ch;
        }
        return '0';
    }
}