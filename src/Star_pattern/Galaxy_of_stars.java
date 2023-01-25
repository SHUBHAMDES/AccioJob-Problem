package Star_pattern;

import java.util.Scanner;

public class Galaxy_of_stars {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n/2;
        m=m+1;
        galaxyStartPAttren(m,0);
    }
    public static void galaxyStartPAttren(int n,int index ){
// base condition
        if(n==index)return;
        for(int i=0;i<=index;i++){

            System.out.print("*");
        }
        System.out.println();




        galaxyStartPAttren(n,index+1);
        //System.out.print(index+" ");
        for(int i=index;i>0;i--){
            System.out.print("*");
        }
        System.out.println();
    }
}
