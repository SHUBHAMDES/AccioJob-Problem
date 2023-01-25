package BinarySearch;

import java.util.Scanner;

public class CountOneInList {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int low=0,high=n-1,count=0;
        while(low<high)
        {
            int mid=(low+high)/2;
            if(1==arr[mid])count++;
            if(1<arr[mid]){
                high=mid-1;
            }else
                {
                    low=mid+1;
                }

        }
        System.out.println(count);
    }


}
