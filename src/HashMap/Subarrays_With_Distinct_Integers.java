package HashMap;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Subarrays_With_Distinct_Integers {
    public static void main (String[] args) throws java.lang.Exception
    {
        //your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        int k=sc.nextInt();
        Subarrays_With_Distinct_Integers l=new Subarrays_With_Distinct_Integers();
        System.out.println(l.subarraysWithKDistinct(arr,k));
       // System.out.println( l.subarraysWithKSize(arr,k));


    }
    public int subarraysWithKDistinct(int[] nums, int k) {


        return subarraysWithKSize(nums,k)-subarraysWithKSize(nums,k-1);
    }
    public int subarraysWithKSize(int[] nums, int k) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        int count=0;
        int i=0;
        int j=0;
        while(j<nums.length){
            hs.put(nums[j],hs.getOrDefault(nums[j],0)+1);



            while(hs.size()==k+1){ //while(hs.size()>k){ this is taking more time
                hs.put(nums[i],hs.get(nums[i])-1);
                if(hs.get(nums[i])==0)
                    hs.remove(nums[i]);
                i++;

            }

            count+=j-i+1;
            j++;

        }


        return count;

    }
}
