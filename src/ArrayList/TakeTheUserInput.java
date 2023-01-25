package ArrayList;
import java.util.*;
import java.util.Scanner;

public class TakeTheUserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>al=new ArrayList<>();
        while(sc.hasNextInt()){
            al.add(sc.nextInt());
        }
        for(int i=0;i< al.size();i++)
        {
            int k=al.get(i);
            if(k%2!=0){
                System.out.println(i+1);
                return;
            }
        }
    }
}
