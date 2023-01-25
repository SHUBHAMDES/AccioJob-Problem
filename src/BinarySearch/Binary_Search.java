package BinarySearch;
import java.util.*;
public class Binary_Search {
    static int findIndex(int key, int[] arr) {
        //Write code here
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==key)return mid;
            if(arr[mid]>key)high=mid-1;
            if(arr[mid]<key)low=mid+1;

        }
        return -1;


    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, key;
        n = sc.nextInt();
        key = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println(findIndex(key, arr));
        sc.close();
    }
}