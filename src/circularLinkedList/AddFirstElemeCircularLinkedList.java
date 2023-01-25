package circularLinkedList;

import java.util.Scanner;

public class AddFirstElemeCircularLinkedList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        AddFirstElemeCircularLinkedList l=new AddFirstElemeCircularLinkedList();
        for(int i=0;i<n;i++){
            l.CircularLL(sc.nextInt());
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
    void CircularLL(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
            newNode.next=head;
        }else{
             newNode.next=head;
             head=newNode;
             tail.next=head;
        }
    }
    void print()
    {
        Node currNode=head;
        //While Loop
//        while(currNode!=head)
//        {
//            System.out.print(currNode.data+" ");
//            currNode=currNode.next;
//        }

        //do While Loop
        System.out.println("Check Tail ans Tail.next "+tail.data+ "  "+tail.next.data);
        do{
            System.out.print(currNode.data+" ");
            currNode=currNode.next;
        }
        while(currNode!=head);
    }

}
