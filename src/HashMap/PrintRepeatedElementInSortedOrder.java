package HashMap;
import java.util.*;
import java.lang.*;
import java.io.*;
public class PrintRepeatedElementInSortedOrder {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++)
       {
           arr[i]=sc.nextInt();
       }
       repeatedElement(arr);


    }
    public static void repeatedElement(int arr[]){
        TreeMap<Integer,Integer>hm=new TreeMap<>();
        int count=-1;
        for(int i=0;i<arr.length;i++)
        {
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
//            if(hm.get(arr[i])>1){
//                System.out.print(arr[i]+" ");
//                count=1;
//            }
        }
            for(int i=0;i< hm.size();i++){
                if(hm.get(arr[i])>1){
                    System.out.print(arr[i]+" ");
                    count=1;
                }
            }
        if(count==-1) System.out.println(count);
    }
}