package Opps;

public class Triangle {
    int calArea;
    int perimeter;
    public void calculate_area(int a,int b,int c)
    {
        calArea=a+b+c/2;

        System.out.println("calArea "+calArea);
    }
    public void calculate_perimeter(int a,int b,int c)
    {
        perimeter=a+b+c;
        System.out.println("perimeter "+perimeter);
    }
     Triangle(int a,int b,int c)
     {
         calculate_area(a,b,c);
         calculate_perimeter(a,b,c);
     }

    public static void main(String[] args) {
        Triangle t=new Triangle(3,4,5);
    }
}
