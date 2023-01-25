package Recursion;

import java.util.Scanner;

public class SumOfArrayUsingRecursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println(sumArray(arr,0));
    }
    public  static  int sumArray(int arr[],int index)
    {
        if(index==arr.length)
        {
            return 0;
        }
        return arr[index]+sumArray(arr,index+1);
    }
}
