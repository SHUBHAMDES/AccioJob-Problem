package Opps;

public class ConstoctoreCalling {
    ConstoctoreCalling()
    {
        System.out.println(2+3);
        System.out.println("SRI RAM");
    }
    //Constroctore Overloading
    ConstoctoreCalling(int n,float m)
    {
        System.out.println(n+m);
    }
    ConstoctoreCalling(double n,double m)
    {
        System.out.println(n*m);
    }


    public static void main(String[] args) {
        // Two ways to Constorctore Calling
        //1)
        //ConstoctoreCalling c=new ConstoctoreCalling();    //OR

        //2)
        new ConstoctoreCalling();
        new ConstoctoreCalling(2,5);
        new ConstoctoreCalling(2.5,5.2);
    }
}
