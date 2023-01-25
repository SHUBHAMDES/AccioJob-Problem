package Opps;

public class PARENT {
    void print()
    {
        System.out.println("This is parent class" );
    }
}
class CHILD extends PARENT{
    void print1()
    {
        System.out.println("This is child class");
    }
}
class calling{
    public static void main(String[] args) {
        PARENT p=new PARENT();
        p.print();
        CHILD c=new CHILD();
        c.print1();
        c.print();
    }
}