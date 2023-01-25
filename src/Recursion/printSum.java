package Recursion;

public class printSum {
    public static void main(String[] args) {


        int n = 4;
        System.out.println( printSum(n, 0,0));

    }
    public static int  printSum(int n,int index,int sum){
        //if index is equal to
        if(index==10)return sum;

        //if index is eqaul to n return
        if(index==n) return sum;
        sum=sum+index;
      return printSum(n,index+2,sum);

    }
}
