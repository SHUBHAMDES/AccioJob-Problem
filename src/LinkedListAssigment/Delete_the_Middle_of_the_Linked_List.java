package LinkedListAssigment;

import java.util.Scanner;
class Node1{
    int data;
    Node1 next;
    Node1(int data){
        this.data=data;
    }
}
class LinkedList1{
    Node1 head;
    //create the List
    void createList(int data)
    {
        //crete Node object
        Node1 newNode=new Node1(data);
        //if the LL is empty then intilise the newNode On that
        if(head==null)
        {
            head=newNode;
            return;
        }else
        {
            Node1 currentNode=this.head;
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
public class Delete_the_Middle_of_the_Linked_List {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList1 l=new LinkedList1();

        int num=sc.nextInt();
        for (int i=0;i<num;i++) {
            l.createList(sc.nextInt());
        }
        int target=num/2;

        l.deleteMideleNumber(target);
    }
}
//1 2 3 5 6