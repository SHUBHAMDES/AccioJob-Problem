package LinkedListProgram;

import java.util.Scanner;

public class InsertPositionAtSpecificPosition {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        InsertPositionAtSpecificPosition ll=new InsertPositionAtSpecificPosition();
       int num=sc.nextInt();
       for(int i=0;i<num;i++)
       {
          ll.CreatList(sc.nextInt());
       }
       int number=sc.nextInt();
       int index=sc.nextInt();
       ll.specificIndex(number,index);
       ll.print();

    }
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
     void  CreatList(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }else{
            Node currentNode=head;
            while(currentNode.next!=null)
            {
                currentNode=currentNode.next;
            }
            currentNode.next=newNode;
        }

    }
    //Create method to Insert Element At Specific Index
    void specificIndex(int number,int index)
    {
        Node newNode=new Node(number);
        if(head==null)
        {
            System.out.println("Linked List iS Emepty");
        }else{
            Node currentNode=head;
            for(int i=0;i<index-1;i++)
            {
                currentNode=currentNode.next;
            }
            newNode.next=currentNode.next;
            currentNode.next=newNode;

        }

    }
    void print()
    {
        Node currentNode=head;
        while(currentNode!=null)
        {
            System.out.println(currentNode.data+" ");
            currentNode=currentNode.next;
        }

    }
}
