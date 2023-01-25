package BinarySearch;

import java.util.Scanner;

public class sortedInsertPosition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();

        System.out.println(returnIndex(n,arr,target));


    }
    static int returnIndex(int n,int arr[],int target){

          int low=0,high=n-1;
          while(low<=high)
          {
              int mid=(low+high)/2;
              if(arr[mid]==target)
              {

                  return mid;//1 3 5 6
              }
              if(arr[mid]>target)
              {

                  high=mid-1;
              }
              if(arr[mid]<target)
              {

                  low=mid+1;
                  //System.out.println(low);
              }
          }
        return low;
    }
     //static int indexWorldPresent(int )
}
