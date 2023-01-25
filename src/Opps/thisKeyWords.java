package Opps;

public class thisKeyWords {
    //1) this key word can be use to refer current class instance variable
    int i;
    void  Set_values(int i)
    {
        this.i=i;
    }
    void test()
    {
        System.out.println(i);
    }
}
class main{
    public static void main(String[] args) {
        thisKeyWords t=new thisKeyWords();
        t.Set_values(100);
        t.test();
    }

}
