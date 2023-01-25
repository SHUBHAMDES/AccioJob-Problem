package Recursion;

public class ReverseNumberNTo1 {
    public static void main(String[] args) {
        int n=5;
        print(n);
    }
    public static void print(int n)
    {
        if(n==0)return;//0

        //System.out.println(n);//5,4,3,2,1
        print(n-1);//4,3,2,1,0
        System.out.println(n);//1,2,3,4,5
    }
}
