package Constroctore;

public class IntiliseObjectByUsingReferenceVerible {
    String Name;
    int ID;

    public static void main(String[] args) {
        IntiliseObjectByUsingReferenceVerible shu=new IntiliseObjectByUsingReferenceVerible();
        shu.Name="Shubham";
        shu.ID=555;
        IntiliseObjectByUsingReferenceVerible pra=new IntiliseObjectByUsingReferenceVerible();
        pra.Name="Pratik";
        pra.ID=213;
        System.out.println(shu.Name+" "+shu.ID);
        System.out.println(pra.Name+" "+pra.ID);
    }
}
