package StringProblem;
import java.util.*;
class Accio{
    static void BeautifulYear(int y){
        while(true){
            y+=1;
            int a=y/1000;//firstDigit;
            int b=y/100%10;//secound Digit
            int c=y/10%10;//3rd digit
            int d=y%10;
            if(a!=b &&a!=c &&a!=d&&b!=c &&b!=d && c!=d){
                System.out.println(y);

break;
            }
        }

    }
}

public class BeautifulYear {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        Accio obj = new Accio();
        obj.BeautifulYear(y);

    }
}
