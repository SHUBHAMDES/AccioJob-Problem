package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class printMissingNumberInSecoundArray {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        //take the first Array
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) arr1[i]=sc.nextInt();

        //Take the Secound Array
        int m=sc.nextInt();
        int arr2[]=new int[m];
        for(int i=0;i<m;i++) arr2[i]=sc.nextInt();
        printMissingNumberInSecoundArray li=new printMissingNumberInSecoundArray();
        li.missingElement(arr1,arr2);

    }
    public  void missingElement(int arr1[],int arr2[])
    {
        HashMap<Integer,Integer>hm1=new HashMap<>();
        HashMap<Integer,Integer>hm2=new HashMap<>();
        ArrayList<Integer>al=new ArrayList<>();

        //Initialisation Of first HashMap
        for(int i=0;i<arr1.length;i++)
        {
            if(hm1.containsKey(arr1[i]))hm1.put(arr1[i],hm1.get(arr1[i])+1);
            else hm1.put(arr1[i],1);
        }

        //Initialisation of Secound HashMap
        for(int i=0;i<arr2.length;i++)
        {
            if(hm2.containsKey(arr2[i])) hm2.put(arr2[i],hm2.get(arr2[i])+1);
            else hm2.put(arr2[i],1);
        }
        //Take larget Array size to Intrate holl Hash Map
        for(int i=1;i<=10000;i++)
        {
            if(hm2.containsKey(i)==true&&hm1.containsKey(i)==false)System.out.print(i+" ");

            else if(hm1.containsKey(i)&&hm2.containsKey(i)&&hm1.get(i)!=hm2.get(i))
                System.out.print(i+" ");
        }
        System.out.println();



    }
}
//10
//        203 204 205 206 207 208 203 204 205 206
//        13
//        203 204 204 205 206 207 205 208 203 206 205 206 204