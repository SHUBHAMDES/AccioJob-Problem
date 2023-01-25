package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class RemoveDublicatInSubArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++)arr[i]=sc.nextInt();
         zeroSum(arr,n);
    }
    public static void zeroSum(int arr[],int n)
    {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            hm.put(sum,hm.getOrDefault(sum,0)+1);
            if(sum==0||hm.containsKey(sum)){
                System.out.println("YES");
                return;
            }

        }
              System.out.println("NO");
    }
}
