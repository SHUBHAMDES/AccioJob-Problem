package Arrays;

import java.util.Scanner;

public class Reverse_a_SubArray {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
       Main obj=new Main();
        boolean ans=obj.checkReverseSubArray(n,arr);
        if(ans==true) System.out.println("Yes");
        else System.out.println("No");

    }
    static class Main{
        static boolean checkReverseSubArray(int n,int arr[]){
                  boolean flag=false;
            for(int i=0;i<n-1;i++){

                    if(arr[i]>arr[i+1])
                        flag=true;
                    else flag=false;

            }
            return flag;
        }

    }
}
