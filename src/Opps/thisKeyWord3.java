package Opps;

public class thisKeyWord3 {
    //3)this key word can be use to invoke current class constorctore
    thisKeyWord3()
    {
        System.out.println("Non argument constroctore  Calling througth thiskey word");
    }
    thisKeyWord3(int a)
    {
        this();//its calling  the [thisKeyWord3()] constroctore //calling Line No 4 constoctore//calling no argument constroctore
        System.out.println("Parametrise Constroctore");
    }
}
   class a{
       public static void main(String[] args) {

           new thisKeyWord3(10);
       }
   }