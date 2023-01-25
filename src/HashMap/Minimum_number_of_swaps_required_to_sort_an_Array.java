package HashMap;
import java.io.*;
import java.util.*;
public class Minimum_number_of_swaps_required_to_sort_an_Array {
    public static void main(String[] args) throws IOException {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int [n];
       for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        System.out.println(minSwaps(arr));
    }
    public static int minSwaps(int nums[])
    {
        int n=nums.length;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=nums[i];

        Arrays.sort(a);
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)
            hm.put(a[i],i);

        int count=0;
        for(int i=0;i<n;i++)
        {
            while(hm.get(nums[i])!=i)
            {
                count++;
                swap(nums,hm.get(nums[i]),i);
            }
        }
        return count;
    }
    static void swap(int a[],int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
