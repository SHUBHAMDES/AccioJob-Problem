package Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class PrintLeaderElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        printLeader(arr);

    }
    public static void printLeader(int arr[]){

        int n=arr.length-1,great=arr[n];
        ArrayList<Integer>li=new ArrayList<>();
        for(int i=n;i>=0;i--)
        {
           // System.out.println(arr[i]);
            if(arr[i]>=great)
            {
                great=arr[i];
                li.add(0,arr[i]);
//                //System.out.println("gre: "+arr[i]);
//                System.out.print(arr[i]+" ");
            }
        }
        for(int i=0;i<li.size();i++){
            System.out.print(li.get(i)+" ");
        }
    }
}
