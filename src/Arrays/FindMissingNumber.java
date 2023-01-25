package Arrays;

import java.util.Scanner;

public class FindMissingNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();

        int arr1[]=new int[100001];
        for(int i=0;i<n;i++){
            arr1[arr[i]]++;
        }
        int doub=0,miss=0;
        for(int i=1;i<100001;i++){
            if(arr1[i]>1){
                doub=i;
            }
            if(arr1[i]==0){
                miss=i;

            }
            if(doub!=0&&miss!=0)break;
        }
        System.out.println(doub+" "+miss);
    }
}
