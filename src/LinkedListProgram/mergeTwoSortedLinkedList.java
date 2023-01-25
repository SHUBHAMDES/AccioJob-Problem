package LinkedListProgram;

import java.util.ArrayList;
import java.util.Scanner;

class Node13 {
    int data;
    Node13 next;
    Node13(int data){
        this.data=data;
    }
}
class LinkedList13{
    Node13 head;
    void TwoLinkedList(int val)
    {
        Node13 node=new Node13(val);
        if(head==null){
            head=node;
            return;
        }else{
            Node13 tmp=this.head;
            while(tmp.next!=null){
                tmp=tmp.next;
                System.out.println("L25: "+2);
            }
            tmp.next=node;
        }
    }
    void mergeLinkedList(Node13 head1, Node13 head2){


        while(head1!=null)
        {
            System.out.println(0);
              head1=head1.next;
              System.out.println("L37: "+head.data);
        }

        while(head2!=null)
        {
            System.out.println(1);
            head1=head2;
            head1=head1.next;
            head2=head2.next;
        }


            Node13 tmp=this.head;
            while (tmp!=null)
            {
                System.out.println(3);
                System.out.print("L53: "+tmp.data+" ");
                tmp=tmp.next;
            }
    }
}
public class mergeTwoSortedLinkedList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        LinkedList13 l1=new LinkedList13();
        for(int i=0;i<m;i++)
        {

            l1.TwoLinkedList(sc.nextInt());
        }
        int n=sc.nextInt();
        LinkedList13 l2=new LinkedList13();
        for(int i=0;i<n;i++)
        {

            l2.TwoLinkedList(sc.nextInt());
        }

        l2.mergeLinkedList(l1.head,l2.head);
    }
}
