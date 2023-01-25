package LinkedListProgram;

import java.util.Scanner;

public class Delete_Node_Without_Head_Node {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Delete_Node_Without_Head_Node l=new Delete_Node_Without_Head_Node();
        for(int i=0;i<n;i++)
        {
            l.LinkedList(sc.nextInt());
        }
        int target=sc.nextInt();
        l.deleteAndPrint(target);

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
    void LinkedList(int data)
    {
        Node newNode=new Node(data);
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
    void deleteAndPrint(int target)
    {
        Node currNode=new Node(target);

     while(head!=null)
     {
         if(head.data!=target)
         {
             System.out.print(head.data+" ");
             head=head.next;
         }else{
             head=head.next;
         }

     }
    }

}
