package BinarySearch;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int min=minNumber(arr);
        System.out.println(min);
    }
    public static int minNumber(int arr[])
    {
        int n=arr.length;
        int low=0,high=n-1;
        while(low<=high)
        // 0  1 2 3 4
        {//10 1 2 5 6  =mid->0,high=1,low=0;
            int mid=(low+high)/2;
            if(arr[0]<arr[n-1])return arr[0];
            if(arr[mid]==arr[high])return arr[mid];
            else if(arr[mid]>arr[high])low=mid+1;
            else if(arr[mid]<arr[high]){//mis->2,high->6
                high=mid;
            }
        }
        return arr[low];
    }

}
