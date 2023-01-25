package Recursion;

import java.util.Scanner;

public class findEleven {
    public static void main(String[] args) {
        System.out.println(12);
        Scanner sc=new Scanner(System.in);

        System.out.println(11);
        int n=sc.nextInt();

        System.out.println(10);
        int arr[]=new int[n];
        System.out.println(8);

        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        System.out.println(4);
      printCount(arr,0,0);
        System.out.println(3);

    }
    public static void printCount(int arr[],int index,int count){
        System.out.println(2);
        if(arr.length==index) System.out.println(count);
        if(arr[index]==11)count++;
        System.out.println(1);
        printCount(arr,index+1,count);

    }
    }

