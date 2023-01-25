package ArrayList;

import java.util.*;

public class Echo {
  static    ArrayList<Integer> memory = new ArrayList<Integer>();
  static int x=1;
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);


        while(true)
        {
            memory.add(reader.nextInt());
          //  System.out.println(memory);
            aa();
        }



    }
   public static void  aa(){

       LL();

    }

    public  static void LL(){


        if(x==memory.size()){
            //System.out.println("L32");
           // System.out.println(memory.size());
        }
        x++;
        System.out.println(x);
    }


}
