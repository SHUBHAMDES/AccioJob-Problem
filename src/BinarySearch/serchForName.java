package BinarySearch;

import java.util.Scanner;

public class serchForName {
    public static void main (String[] args) throws java.lang.Exception
    {
        //your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();

        serchForName l=new serchForName();
       l.searchRange(arr,target);
    }
   public void searchRange(int []arr,int target)
    {
        int result[]=new int[2];
        result[0]=firstOccurrence(arr,target);
        result[1]=lastOccurrence(arr,target);

       for(int var:result)
       {
           System.out.print(var+" ");
       }

    }
 int firstOccurrence(int arr[], int target)
    {
        int ans=-1;
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target)
            {
                high=mid-1;
            }
            if(arr[mid]<target)
            {
                low=mid+1;
            }
            if(arr[mid]==target)
            {
                ans=mid;
                high=mid-1;
            }
        }
        return ans;
    }
   int lastOccurrence(int arr[],int target)
    {
        int ans=-1;
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target)
            {
                high=mid-1;
            }
            if(arr[mid]<target){
                low=mid+1;
            }
            if(arr[mid]==target){
                ans=mid;
                low=mid+1;
            }
        }
        return ans;
    }
}
