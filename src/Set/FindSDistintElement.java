package Set;

import java.util.HashSet;
import java.util.Scanner;

public class FindSDistintElement {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
             arr[i]=sc.nextInt();
        }

        System.out.println(revomoDublicates(arr));

    }
    public static HashSet<Integer> revomoDublicates(int[] arr){
        HashSet<Integer>arr1=new HashSet<>();
        for(int a:arr){
            arr1.add(a);
        }
        return arr1;
    }
}