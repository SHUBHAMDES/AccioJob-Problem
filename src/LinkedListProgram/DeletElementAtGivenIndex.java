package LinkedListProgram;

import java.util.Scanner;

public class DeletElementAtGivenIndex {
    public static void main(String[] args) {
        DeletElementAtGivenIndex l=new DeletElementAtGivenIndex();

        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();

        int index=4;


        for(int i=0;i<num;i++)
        {

            l.CreatList(sc.nextInt());

        }

        l.deleteIndex(index);
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
    void CreatList(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
        }else
        {
              Node currentNode=head;
              while(currentNode.next!=null)
              {

                currentNode=currentNode.next;
              }
              currentNode.next=newNode;
        }
    }

    void deleteIndex(int index)
    {
        //System.out.println(59);
        Node currentNode=head;
         for(int i=0;i<index-2;i++)
         {
           currentNode=currentNode.next;
         }
         currentNode.next=currentNode.next.next;
    }
    void print()
    {
        Node tmpNode=head;
        while(tmpNode!=null)
        {

            System.out.print(tmpNode.data+" ");
            tmpNode=tmpNode.next;

        }
    }
}
