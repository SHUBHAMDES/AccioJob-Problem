package Recursion;

public class PrintSumOfO_1_To_n_Number {
    public static void main(String[] args) {
        int n=5;
        PrintSum(n);
    }
    public static void PrintSum(int n)
    {
        int sum = 0;
        sum=sum+n;
        PrintSum(n-1);
        if(n==0){
            System.out.println(sum);
            return ;
        }

    }
}
