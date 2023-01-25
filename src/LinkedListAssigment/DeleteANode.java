package LinkedListAssigment;

import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
 class LinkedList{
    Node head;
     //create the List
    void createList(int data)
    {
        //crete Node object
        Node newNode=new Node(data);
        //if the LL is empty then intilise the newNode On that
        if(head==null)
        {
            head=newNode;
            return;
        }else
        {
            Node currentNode=this.head;
            while (currentNode.next!=null)
            {
                currentNode=currentNode.next;
            }
            currentNode.next=newNode;
        }
    }
    //delete 'target' in given list
    void deleteMideleNumber(int num)
    {
        int i=0;
        while(head!=null)
        {
            if(i!=num)//check i is equal to "num"or if yes skip is block
         {
             System.out.print(head.data+" ");
             head=head.next;
         }
         else
         {
             head=head.next;
         }
            i++;
        }
    }

}
public class DeleteANode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList l=new LinkedList();

        int num=sc.nextInt();
        for (int i=0;i<num;i++) {
            l.createList(sc.nextInt());
        }
        int target=sc.nextInt();
        l.deleteMideleNumber(target);
        //l.print();
    }
}
