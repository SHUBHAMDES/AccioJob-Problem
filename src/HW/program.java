package HW;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int tmp=0;
        for(int i=n;i>0;i=i/10){
            tmp=i%10;
            System.out.print(tmp+" ");
        }
    }
}
