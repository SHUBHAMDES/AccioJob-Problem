package Opps;
public class MyClass {
     public static void main(String[] args) {
         Employee obj[] = new Employee[5];
         //System.out.println(12);
         obj[0] = new Employee("Raj", 35000);
         obj[1] = new Employee("Shubham", 100000);
         obj[2] = new Employee("Aayan", 50000);
         obj[3] = new Employee("Shorya", 45000);
         obj[4] = new Employee("Pratik", 57000);
         for(int i = 0; i<obj.length-1;i++) {
             for (int j = 0; j < obj.length - 1 - i; j++) {
                 if (obj[j].salary < obj[j + 1].salary) {
                     Employee  temp = obj[j];
                     obj[j] = obj[j + 1];
                     obj[j + 1] = temp;
                 }}}
         for(int i = 0; i<obj.length;i++) {
             System.out.println(obj[i].Name + " " + obj[i].salary);
         }}}
class Employee {
    String Name;
    int salary;
    Employee(String Name,int salary)
    {
        // System.out.println(34);
        this.Name=Name;
        this.salary=salary;
    }
}
