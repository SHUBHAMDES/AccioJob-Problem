package SortingProgram;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();

        //Logic Insertion Sort
        int tmp,j;
        for(int i=1;i<n;i++)
        {
            tmp=arr[i];
            j=i;
            while(j>0&&arr[j-1]>tmp)
            {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j]=tmp;
        }
          for(int i=0;i<n;i++)
          System.out.print(arr[i]+" ");

    }
}
