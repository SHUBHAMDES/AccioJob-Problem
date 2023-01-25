package BinarySearch;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int index=findterget(arr,target);
        System.out.println(index);
    }
    public static int findterget(int arr[],int target)//5   tar=5
    {
        int low=0,high= arr.length-1;//0+0/2
        while(low<=high){
            int mid=(low+high)/2;
            System.out.println("mid:"+mid);
            if(arr[mid]==target)
                return mid;
            if(arr[mid]<target)
                low=mid+1;
            if(arr[mid]>target)
                high=mid-1;

        }
        return  -1;
    }
}
