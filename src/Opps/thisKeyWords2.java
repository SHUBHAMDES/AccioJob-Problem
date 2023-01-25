package Opps;

public class thisKeyWords2 {
    //"this" key word use to invoke current class method (implicity)
    void add()
    {
       String name="Hello my name is Shubham";
        System.out.println(name);
    }
    void test()
    {
        //IMP:-if we donts use the "this" keyword.compiler automaticaly adds "this" keyword while invoking the method
       // add();//OR
        this.add();
    }
}
// new class
    class mains
{
    public static void main(String[] args) {
        thisKeyWords2 tc=new thisKeyWords2();
        tc.test();
    }
}
