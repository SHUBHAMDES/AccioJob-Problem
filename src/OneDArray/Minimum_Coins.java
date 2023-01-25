package OneDArray;

import java.util.Arrays;
import java.util.Scanner;

public class Minimum_Coins {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int TA = sc.nextInt();
        int ta=TA;
       //           0    1   2   3   4  5 6  7 8 9
        int arr[]={2000,500,200,100,50,20,10,5,2,1};
        int sum=0;
        int sum1=0;
        int count=0;
        int n = arr.length;


        for (int i = 0; i < n; i++) //0 1 <10
        {
            String flag="false";//t
            sum1+=arr[i];//0+2000=2000
            // 2000<=90&&2000<=90
            if(arr[i]<=ta&&sum1<=ta)//
            {
             //
                sum+=arr[i];//0+=2000=2000
                count++;//1
                flag="true";//t
                ta=ta-sum;//2058-2000=58
                if(ta==0)//58==0
                {
                    System.out.println(count);
                    break;
                }

            }
            // 50>8=0
           // if(sum1>ta)sum1=0;//
            if(flag=="false")sum1=0;

           if(flag=="true") i=i-1;//


        }
    }
}
