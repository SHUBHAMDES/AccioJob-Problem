package Opps;

public class Members_interviewQuestion {
    public static void main(String[] args) {
        Members_interviewQuestion obj = new Members_interviewQuestion("shubham", 22, 111111111, "At.post Nashik", 100000);
        Members_interviewQuestion shu=new Members_interviewQuestion("dj",5,84,"nn",545);

    }
      String Name;
        int Age;
        long Phone_Number;
        String address;
        int salary;
        Members_interviewQuestion(String name, int age, long PN, String adr,int slry){
            this.Name = name;
            this.Age = age;
            this.Phone_Number = PN;
            this.address = adr;
            this.salary = slry;
            System.out.println(Name);
            System.out.println(Age);
            System.out.println(Phone_Number);
            System.out.println(address);
            printSalary(salary);
        }
        public static void printSalary ( int salary){
            System.out.println(salary);
        }
    }
    class Employees extends Members_interviewQuestion {
    Employees(String name, int age, long PN, String adr, int slry) {
        super(name, age, PN, adr, slry);
    }

}

