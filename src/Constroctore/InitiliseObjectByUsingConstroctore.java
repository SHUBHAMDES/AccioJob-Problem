package Constroctore;

public class InitiliseObjectByUsingConstroctore {
    String Name;
    int ID;
    InitiliseObjectByUsingConstroctore(String name,int id){
        this.Name=name;
        this.ID=id;
    }

    public static void main(String[] args) {
        InitiliseObjectByUsingConstroctore shuham=new InitiliseObjectByUsingConstroctore("Shubham",101);
        InitiliseObjectByUsingConstroctore rohit=new InitiliseObjectByUsingConstroctore("Rohit",102);
        System.out.println(shuham.Name+" "+shuham.ID);
        System.out.println(rohit.Name+" "+rohit.ID);
    }
}
