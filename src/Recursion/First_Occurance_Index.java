package Recursion;

import java.util.Scanner;

public class First_Occurance_Index {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        int k=sc.nextInt();
        System.out.println(returnIndex(0,arr,k));

    }
    public static int returnIndex(int index,int arr[],int k)
    {
        if(arr[index]==k)return index;
        else if(index==arr.length-1)return -1;
        return returnIndex(index+1,arr,k);
    }
}
