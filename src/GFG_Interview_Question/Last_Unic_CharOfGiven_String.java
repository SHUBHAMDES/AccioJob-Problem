package GFG_Interview_Question;

import java.util.Scanner;

public class Last_Unic_CharOfGiven_String {
    public static void main(String[] args) {


    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    Last_Unic_CharOfGiven_String obj=new Last_Unic_CharOfGiven_String();
        System.out.println(obj.lastUnicCharactore(str));

}
    char lastUnicCharactore(String str){
        int arr[]=new int[27];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            arr[ch-'a']++;
        }

        for(int i=str.length()-1;i>0;i--){


            char ch=str.charAt(i);

            if(arr[ch-'a']==1)return ch;


        }
        return '0';
    }
}
