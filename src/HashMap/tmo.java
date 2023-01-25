package HashMap;

import java.util.Scanner;

public class tmo {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70};
        revArr(arr);
    }
    public static void revArr(int arr[]){
        int n=arr.length;
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
