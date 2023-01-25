package Star_pattern;

import java.util.Scanner;

public class Diamond_of_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n/2+1;
        printNumberStar(m);
    }
    public static void printNumberStar(int n){
        int x=0;
        int z=1;
        for(int i=0;i<n;i++){
             z=1;
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i+x;j++) {
                System.out.print(z++);
                if(z==10)z=1;
            }
            System.out.println();
            x++;
            if(z==9)z=1;
        }
        x=x-4;
        for(int i=0;i<n-1;i++){
               z=1;
            for(int j=0;j<=i+1;j++){
                System.out.print(" ");
            }
            for(int j=n-i+x;j>=0;j--){
                System.out.print(z++);
                if(z==10)z=1;
            }
            System.out.println();
            x--;

        }

    }
}
