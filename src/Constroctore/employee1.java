package Constroctore;

import java.util.Scanner;

public class employee1 {
   int salary;
   int hourse;
   void getinfo (int salary,int hourse)
   {
      this.salary=salary;
      this.hourse=hourse;
      AddSal();
      AddWork();
      System.out.println(this.salary);
   }
   void AddSal()
   {
      if(this.salary<500)
      {
         this.salary+=+10;
      }
   }
void AddWork()
{
   if(this.hourse>6)
   {
      this.salary+=5;
   }
}

   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      employee1 e1=new employee1();
      int salary=sc.nextInt();
      int hourse=sc.nextInt();
      e1.getinfo(salary,hourse);
   }
}
