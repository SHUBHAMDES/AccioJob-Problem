package StringProblem;

import java.util.Arrays;

public class SmallestEvenNumber {
    public static void main(String[] args) {
        int arr[]={10,40,50,6,100,5,1,200};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0){
                System.out.println(arr[i]);
                return;
            }
        }
    }
}
