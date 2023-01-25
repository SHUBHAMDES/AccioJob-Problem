package Opps;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Member {
    String Name;
    float Age;
    long PhoenNumber;
    String Adress;
    int salary;

    void PrintSalary(int salary){
        System.out.println(salary);
    }
    void print(String Name,float age,long phoenNumber,String Adress,int salary){
        this.Name=Name;
        this.Age=Age;
        this.PhoenNumber=PhoenNumber;
        this.Adress=Adress;
        this.salary=salary;
        System.out.println(Name);
        System.out.println(Age);
        System.out.println(PhoenNumber);
        System.out.println(Adress);
        System.out.println(salary);


    }
}
class employee extends Member {
    String specilisation;
    String deparment;

    employee(String specilisation, String deparment) {
        this.specilisation = specilisation;
        this.deparment = deparment;
    }

    class Manager extends Member {
        String specilisation;
        String deparment;

        Manager(String specilisation, String deparment) {
            this.specilisation = specilisation;
            this.deparment = deparment;
        }

        public void main(String[] args) {
            // em.print(Name,Age,PhoneNumber,adress,salary);
            employee em = new employee("Chemistr", "A");
            em.print("shubham", 10, 151515151, "sjxbxnw", 21551);
            System.out.println(em.specilisation);
            System.out.println(em.deparment);
            Manager ma = new Manager("Mathematixc", "B");
            ma.print("shubham", 10, 151515151, "sjxbxnw", 21552);
            System.out.println(ma.specilisation);
            System.out.println(ma.deparment);
        }
    }
}