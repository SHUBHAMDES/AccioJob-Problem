package Recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        int n=5;
        revNumber(n);
    }
    public static void revNumber(int n)
    {
        if(n==0)return;
        System.out.println(n);
        revNumber(n-1);
    }
}
