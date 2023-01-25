package ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {
       Scanner in=new Scanner(System.in);
       ArrayList<Double>inputs=new ArrayList<>();
        System.out.println("Entere some number");
        while (in.hasNextDouble()){
            inputs.add(in.nextDouble());
        }
        System.out.println(inputs);
    }
}
