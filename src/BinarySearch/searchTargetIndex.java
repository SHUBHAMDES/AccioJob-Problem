package BinarySearch;

import java.util.Scanner;

public class searchTargetIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int key=sc.nextInt();
        int arr[]=new int[num];
        int low=0,high=num-1;
        for(int i=0;i<num;i++)
        {
            arr[i] = sc.nextInt();
            System.out.println(13);
        }

        System.out.println("Low: "+low);System.out.println("high: "+high);
        while(low<high)
        {
            System.out.println(17);
            int mid=(low+high)/2;
            if(key==arr[mid])
            {
                System.out.println(20);
                System.out.println(mid);
              //  return;
            }
            if(key<arr[mid]) {
                System.out.println(24);
                high = mid - 1;
            }
            else
            {
                System.out.println(29);
                low = mid + 10;
            }
        }
        System.out.println(-1);
    }
}
