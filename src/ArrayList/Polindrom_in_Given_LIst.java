package ArrayList;
import java.util.*;

class Solution{

    public static void countPal(int min, int max)
    {
        // write code here
        ArrayList<Integer>ans=new ArrayList<>();


        for(int i=min;i<max;i++)
        {
            int reverse=0;
            for(int j=i;j>0;j=j/10){

                int temp=i%10;
                reverse=reverse*10+temp;

            }

            if(reverse==i){
                ans.add(i);
            }

        }
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
public class Polindrom_in_Given_LIst {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        Solution Obj = new Solution();
        Obj.countPal(start, end);
    }
}
