package OneDArray;


import java.util.Scanner;

public class MejorityElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//7
        int arr[]=new int[n];//
        for(int i=0;i<n;i++)
        {             //           0 1 2 3 4 5 6
            arr[i]=sc.nextInt();//[2,2,1,1,1,2,2]
        }
        //Logic:->
        int count=0;//1
        int first=arr[0];//2
        for(int i=0;i<arr.length;i++)//7<7
        {
            if(count==0)//0==0t
            {
                first=arr[i];//2
                count++;//1
            }else if (first==arr[i])//1==2
            {
                count++;//1
            }
            else{
                count--;//2-1=1,1-1=0,1-1=0
            }
        }
          System.out.println(first);

    }
}
