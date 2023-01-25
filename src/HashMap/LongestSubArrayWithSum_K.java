package HashMap;

import java.util.Scanner;

public class LongestSubArrayWithSum_K {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
      subArraywithSum_k(arr,k);

    }
    public static void subArraywithSum_k(int arr[],int k){
        int n=arr.length,count=0,max=0;

        for(int i=0;i<n;i++){
            count=0;
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                count++;
               // System.out.print("sum:"+sum);
                if(sum==k)

                    max=Math.max(count,max);



            }
           // System.out.println("->"+max);
        }
if(max==0) System.out.println(0);
else System.out.println(max);

    }
}
