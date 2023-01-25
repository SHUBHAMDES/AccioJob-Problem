package circularLinkedList;

import java.util.Scanner;

public class insertElemetAtEnd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        insertElemetAtEnd l=new insertElemetAtEnd();
        for(int i=0;i<n;i++){
            l.LinkedList(sc.nextInt());
        }
        l.print();
    }

    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    Node head;
    Node tail;

    void  LinkedList(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
            newNode.next=head;
        }else{
            Node currNode=head;
            while(currNode.next!=null)
            {
                tail.next=newNode;
                tail=newNode;
                newNode.next=head;
                break;
            }

        }
    }
    void print()
    {
        Node currNode=head;
        do{
            System.out.print(currNode.data+" ");
            currNode=currNode.next;
        }while(currNode!=head);
    }
}
