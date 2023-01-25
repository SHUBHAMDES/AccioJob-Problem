package HashMap;
import java.util.*;
import java.lang.*;

public class Solution {
    public long pairsDiffrrence(int []A,int n,int k)
    {
        HashMap<Integer,Integer>hm=new HashMap<>();
        long ans=0;
        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(A[i]))hm.put(A[i],hm.get(A[i]+1));
            else hm.put(A[i],1);
        }
        for(Integer b:hm.keySet()){
            if(k==0 && hm.get(b)>1||(k!=0&&hm.containsKey (b+k))){
                ans++;
            }
        }
        return ans;
    }
}

 class Mains
{
    public static void main (String[] args) throws java.lang.Exception
    {
        //your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int []mat=new int[n];
        for(int i=0;i<n;i++)
        {
            mat[i]=sc.nextInt();
        }

        Solution obj=new Solution();
        System.out.println(obj.pairsDiffrrence(mat,n,k));
        System.out.println('\n');
    }
}
