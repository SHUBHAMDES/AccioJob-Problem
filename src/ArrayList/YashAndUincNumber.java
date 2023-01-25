package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class YashAndUincNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        System.out.println(unicElement(arr));
    }
    public static int unicElement(ArrayList<Integer>arr){
        // write code here
        //System.out.println("n "+n);
        int n=arr.size();

        int start=0,end=n,uicElement=0;
        while(start<=end){
            int mid=(start+end)/2;
            if(mid==0&&arr.get(mid)!=arr.get(mid+1)||mid==n&&arr.get(mid)!=arr.get(mid-1))return arr.get(mid);
            if(arr.get(mid-1)==arr.get(mid)){
                start=mid+1;
            }
            if(arr.get(mid+1)==arr.get(mid)){
                end=mid-1;
            }
            if(arr.get(mid-1)!=arr.get(mid)&&arr.get(mid+1)!=arr.get(mid))return arr.get(mid);
        }
        return 1;
    }
}
