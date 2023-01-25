package LinkedListProgram;

import java.util.Scanner;

public class main
{
    public static void main(String[] args) {

        LinkedList li=new LinkedList();//create a new Linked List
        li.insrtAtEnd(1);
        li.insrtAtEnd(2);
        li.insrtAtEnd(3);
        li.insrtAtEnd(8);

        li.print();

    }
}
class  Nodea
{
    int val;//1 2 3
    Nodea next;
    Nodea(int val)
    {
        this.val=val;//1 2 3
    }

}
class LinkedList3
{
    Nodea head;//null 1

    //Insert Linked List
    void insrtAtEnd(int val)
    {

        Nodea n=new Nodea(val);//node


        if(this.head==null) {//1
            this.head=n;//1
            return;
        }else
        {

            Nodea temp1 = this.head;// 1
            while (temp1.next != null) //1.null f 2
            {
                temp1 = temp1.next;
            }
            temp1.next = n;// n[ | ]
        }
    }
    //print Linked List
    void print() {
        Nodea exm=this.head;
        while(exm!=null)
        {
            System.out.print(exm.val+" ");
            exm=exm.next;
        }

    }
}