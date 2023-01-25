package GFG_Interview_Question;

import java.util.Scanner;

public class Square_Root_of_Number_without_using_Inbuilt_Function {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int low=1,high=n,ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(mid*mid<=n){
                ans=mid;
                low=mid+1;
            }
            high=mid-1;
        }
        System.out.println(ans);
    }
}
