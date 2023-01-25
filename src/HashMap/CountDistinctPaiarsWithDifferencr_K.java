package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class CountDistinctPaiarsWithDifferencr_K {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        System.out.println(findDifferenceWith_k(arr,k));
    }
    public static int findDifferenceWith_k(int arr[],int k)
    {
        int n=arr.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        int count=0;
        for(int i=0;i<n;i++)
        {
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
         for(int a:hm.keySet()){
             if(k==0&&hm.get(a)>1||k!=0&&hm.containsKey(a+k)){
                 count++;
             }
         }
         return count;
    }
/*

int n=4;
int k=1;
 */
}
