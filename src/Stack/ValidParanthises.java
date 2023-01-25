package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ValidParanthises {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String Str=sc.nextLine();
        ValidParanthises obj=new ValidParanthises();
        System.out.println(obj.isValid(Str));

    }
    public  boolean isValid(String str){
        Stack<Character>st=new Stack<>();
        int n=str.length();
        for(int i=0;i<n;i++){
            //if str.charAt() is opening bracket push to stack
            if(str.charAt(i)=='('||str.charAt(i)=='{'||str.charAt(i)=='['){
                st.push(str.charAt(i));
            }else{
                //its closing bracket
                //1.stack is empty
                if(st.empty())return false;

                //2.opening And closing Are equals
                else if(match(st.peek(),str.charAt(i)))
                    st.pop();

                    //3.closing bracket doesnt match closing bracket
                  else return false;

            }
        }
        if(st.empty())return true;
        else return false;
    }
    public static boolean match(char open,char close){
        if(open=='['&&close==']')return true;
        if(open=='('&&close==')')return true;
        if(open=='{'&&close=='}')return true;
        else return false;
    }
}
