package Opps;

public class ColleageStudent {

        String StudentName;
        int StudentRollNumber;
        char StudentClass;
        String Optional_Subject;
    ColleageStudent(String StudentName,int StudentRollNumber,char StudentClass,String Optional_Subject )
        {
            this.StudentName=StudentName;
            this.StudentRollNumber=StudentRollNumber;
            this.StudentClass=StudentClass;
            this.Optional_Subject=Optional_Subject;
            System.out.println("StudentName: "+StudentName);
            System.out.println("StudentRollNumber: "+StudentRollNumber);
            System.out.println("StudentClass: "+StudentClass);
            System.out.println("Optional_Subject: "+Optional_Subject);
        }

}
class callingConstroctore{
    public static void main(String[] args) {
        ColleageStudent RAM=new ColleageStudent("ram",2,'B',"chemistry");
        ColleageStudent SHUBHAM=new ColleageStudent("shubham",1,'B',"Mathematics");
    }
}
