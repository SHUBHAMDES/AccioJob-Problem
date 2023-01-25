package Recursion;

public class OneToFiveNumberPrint {
    public static void main(String[] args) {
        int n=1;
        PrintNumber(n);
    }
    public static void PrintNumber(int n)
    {
        System.out.println(n);
        if(n==5)return;
        PrintNumber(n+1);
    }
}
