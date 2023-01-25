package LinkedListProgram;

import java.util.Scanner;

public class Add_two_numbers_represented_by_linked_lists
{
    public static void main(String[] args)
    {
        Add_two_numbers_represented_by_linked_lists l=new Add_two_numbers_represented_by_linked_lists();

        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        for(int i=0;i<num1;i++)
        {
         l.createLinkedList1(sc.nextInt());
        }
        for(int i=0;i<num2;i++)
        {
            l.createLinkedList2(sc.nextInt());
        }
        l.sum();
        l.print();

    }
  class  Node
  {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;

        }

    }
    Node head;
    String str1="";
    String str2="";

    void createLinkedList1(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
        }else{
            Node currNode=head;
            while(currNode.next!=null)
            {
                str1= String.valueOf(currNode.data);
                currNode=currNode.next;
            }
        }
    }
    void createLinkedList2(int data)
    {
     Node newNode=new Node( data);
        if(head==null)
        {
            head=newNode;
        }else{
            Node currNode=head;
            while(currNode.next!=null)
            {
                str2= String.valueOf(currNode.data);
                currNode=currNode.next;
            }
        }
    }
    void createLinkedList3(int data)
    {
        Node newNode=new Node( data);
        if(head==null)
        {
            head=newNode;
        }else{
            Node currNode=head;
            while(currNode.next!=null)
            {

                currNode=currNode.next;
            }
            currNode.next=newNode;
        }
    }

    void sum()
    {
        Add_two_numbers_represented_by_linked_lists l2=new Add_two_numbers_represented_by_linked_lists();

        int n1 = Integer.parseInt(str1);
        int n2 = Integer.parseInt(str2);
        int n3 = n1 + n2;
        for (int i=n3; i >0; i= i / 10)
        {
            int data=i%10;
               l2.createLinkedList3(data);
        }
    }
    void print()
    {
        Node currNode=head;
        while(currNode!=null)
        {
            System.out.print(currNode.data+" ");
            currNode=currNode.next;
        }
    }
}
