package LinkedListProgram;

import java.util.Scanner;

public class Remove_duplicates_from_Linked_Lists {
    public static void main(String[] args) {
        Remove_duplicates_from_Linked_Lists l=new Remove_duplicates_from_Linked_Lists();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<num;i++)
        {
            l.creatLL(sc.nextInt());
        }
        l.DeleteDublicate();

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
    void creatLL(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
        }else {
            Node currNode=head;
            while(currNode.next!=null){
                currNode=currNode.next;
            }
            currNode.next=newNode;
        }

    }
    void DeleteDublicate(){
        Node currNode=head;
       // System.out.println(44);
      //  System.out.println(currNode.data);
        //System.out.println(currNode.next.data);
        int count=0;
        while(currNode.next!=null)
        {
          //  System.out.print(currNode.data+" ");
            if(currNode.data != currNode.next.data ){
                System.out.print(currNode.data+" ");
                count++;
            }
            currNode=currNode.next;
        }
        if(count==0)
        {

        }
    }
//    void print()
//    {
//        Node currNode=head;
//        while(currNode!=null){
//            System.out.print(currNode.data);
//            currNode=currNode.next;
//        }
//
//    }
    }

