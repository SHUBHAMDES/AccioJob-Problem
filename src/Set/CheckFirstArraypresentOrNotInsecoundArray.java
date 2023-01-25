package Set;

import java.util.HashSet;
import java.util.Scanner;

public class CheckFirstArraypresentOrNotInsecoundArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr1[]=new int[m];
        int arr2[]=new int[n];
        for (int i = 0; i < m; i++) arr1[i]=sc.nextInt();

        for (int i = 0; i < n; i++) arr2[i]=sc.nextInt();
        System.out.println(intesectTwoArray(arr1,arr2));

    }
    public static int intesectTwoArray(int arr1[],int arr2[])
    {
        HashSet<Integer>hs=new HashSet<>();
        int count=0;
        for(int a:arr1) hs.add(a);

        for(int b:arr2){
            if(hs.contains(b)){
                count++;
                hs.remove(b);
            }
        }
        return count;
    }
}