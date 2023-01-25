package HashMap;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Most_Frequent_Word_in_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        String []arr = new String[n];
        for(int i=0;i<n;++i){
            arr[i] = sc.next();
        }
        coountFrequncy Obj = new coountFrequncy();
        Obj.mostFrequent(arr,n);
        System.out.println('\n');
    }
}


class coountFrequncy {
    public void mostFrequent(String []arr, int n) {
        // write your code here
        HashMap<String,Integer> tm=new HashMap<>();
        for(int i=0;i<n;i++){
            if(tm.containsKey(arr[i]))tm.put(arr[i],tm.get(arr[i])+1);
            else tm.put(arr[i],1);
        }
        int max_freq=0;
        String s=" ";
        for(String str:tm.keySet())
        {
            if(max_freq<tm.get(str))
            {
                max_freq=tm.get(str);
                s=str;
            }
        }
        System.out.println(s);
    }


}