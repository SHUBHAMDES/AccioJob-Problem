package Recursion;

public class print1To10 {
    public static void main(String[] args) {
        int i=0;
        int n=10;
        print(i,n);
    }
    public static void print(int i,int n)
    {
        if(i==n) { //f,f,f,t
            return ;
        }
        //System.out.println("L11  "+i);
        System.out.println(i++);//1,2,3,4,5


            print(i++,n);//2,3,4,5
            System.out.println("L17 "+i);
    }
}
