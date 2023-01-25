package Recursion;

public class SharpnerAssigment_17 {
    public static void main(String[] args) {
        System.out.println(count(1));
    }
    static int count(int i){
        if(i>5)

        {

            return 1;

        }

        else

        {

            return i*count(i+1);

        }
    }
}
