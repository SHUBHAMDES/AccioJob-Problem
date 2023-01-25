package Constroctore;

public class Employee {
    String Name;
    int  Year_of_joining;
    String Address;
    void print_detail(String Name,int  Year_of_joining,  String Address)
    {
        this.Name=Name;
        this.Year_of_joining=Year_of_joining;
        this.Address=Address;
        System.out.println(Name+"  "+Year_of_joining+"  "+Address);
    }

    public static void main(String[] args) {
        Employee l1=new Employee();
        l1.print_detail("Robert",1994, "64C-WallsStreat");
        l1.print_detail("Sam",1994, "64C-WallsStreat");
        l1.print_detail("John",1994, "64C-WallsStreat");
    }
}
