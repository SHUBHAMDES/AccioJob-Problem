package LinkedListProgram;

import java.util.Scanner;

public class Next_Highest_height_left {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
      int arr2[] =findDistance(n,arr);
      for(int print:arr2)
      {
          System.out.print(print+" ");
      }

    }

    static int []findDistance(int n, int arr[])
    {
        int arr1[] = new int[n];//4-1=3
        for (int i = n - 1; i >= 0; i--)//1
        {
            if (i == 0) {
                //System.out.println(2);
                arr1[i] = -1;
                break;
            }
            int count = 0;
            for (int j = i-1; j >= 0; j--)//1
            {

                count++;//1
                if (arr[j] > arr[i])//9>4
                {
                   // System.out.println(1);
                    arr1[i] = count;
                    count=0;
                    break;

                }

            }
                 if(count!=0){
                     arr1[i]=-1;
                 }
        }

        return arr1;
    }
}