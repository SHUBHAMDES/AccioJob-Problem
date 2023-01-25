package Opps;

public class Count_object {
    static int count=0;
    void sum(int a,int b)
    {
        System.out.println(a+b);
        count++;
    }
    void mul(int a,int b){
        System.out.println(a*b);
        count++;
    }
    void sub(int a,int b){
        System.out.println(a-b);
        count++;
    }

    void div(int a,int b){
        System.out.println(a/b);
        count++;
    }

    public static void main(String[] args) {
        Count_object l1=new Count_object();
        l1.sum(1,2);
        l1.mul(5,4);
        l1.div(8,6);
        l1.sub(11,20);
        System.out.println("Number Count_object:  "+Count_object.count);
    }
}
