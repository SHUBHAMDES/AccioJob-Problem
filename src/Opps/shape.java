package Opps;

public class shape {
    void print1()
    {
        System.out.println("This is Shape");
    }
}
class rectangle extends shape{
  void print2()
   {
        print1();
       System.out.println("This is rectangular shape");

    }
}
class Circle extends shape{
  void print3()
    {
        System.out.println("This is circular shape");
    }
}
class Square extends rectangle{
    void print4(){
        System.out.println("Square is a rectangle");
    }
    public static void main(String[] args) {
    {
        Square sq=new Square();
        sq.print2();

    }
}
}