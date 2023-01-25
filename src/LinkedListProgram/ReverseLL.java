package LinkedListProgram;

import java.util.Scanner;

public class ReverseLL {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ReverseLL obj=new ReverseLL();
        for(int i=0;i<n;i++){
           // obj.printReverseLinkedList(sc.nextInt());
            obj.reverOrder(sc.nextInt());
        }
        obj.printLinst();
    }
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    //insertion of the Linked List streat order
    Node head;
//    void printReverseLinkedList(int data){
//        Node newNode=new Node(data);
//        if(head==null){
//            head=newNode;
//        }else{
//            Node currNode=head;
//            while(currNode.next!=null){
//                currNode=currNode.next;
//            }
//            currNode.next=newNode;
//        }
//    }

    //reverese Linked List
    void reverOrder(int data){
        Node newNode=new Node(data);
      newNode.next=head;
      head=newNode;
    }
    //printThe Linked List
    void printLinst(){
        Node printNode=head;
        while(printNode!=null){
            System.out.print(printNode.data+" ");
            printNode= printNode.next;
        }
    }
}
