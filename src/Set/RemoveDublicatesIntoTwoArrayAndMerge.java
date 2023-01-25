package Set;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDublicatesIntoTwoArrayAndMerge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[m];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            arr2[i]=sc.nextInt();
        }
        System.out.println(removeDublicates(arr1,arr2));
    }
    public static HashSet<Integer> removeDublicates(int arr1[], int arr2[])
    {
        HashSet<Integer>hs=new HashSet<>();
        for(int a:arr1)hs.add(a);
        for(int b:arr2)hs.add(b);
        return hs;

    }
}
