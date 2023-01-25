package SortingProgram;

import java.util.Scanner;

public class InsertionSort1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        insertionSort(arr);
    }
    public static void insertionSort(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int current=arr[i];
            int j=i-1;
            while(j>=0&&current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
