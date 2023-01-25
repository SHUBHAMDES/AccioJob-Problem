package LinkedListProgram;

import java.util.Scanner;

public class printMiddaleOfLinkeList {
    static  int n;
    public static void main(String[] args) {
        printMiddaleOfLinkeList ll=new printMiddaleOfLinkeList();
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            ll.LL(sc.nextInt());
        }
        ll.middleOfLinkeList();

    }

    //Create Linked List
    class Node{
        int data;
        Node next;
        //Constroctore
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    public void LL(int data){
        Node currNode=new Node(data);
        if(head==null){
            head=currNode;
        }else{
            Node tempNode=head;
            while(tempNode.next!=null){
                tempNode=tempNode.next;
            }
            tempNode.next=currNode;
        }

    }

    public void middleOfLinkeList(){
        Node currNode=head;
        int m=(n/2)+1;
        for(int i=0;i<m-1;i++){
            currNode=currNode.next;
        }
        System.out.println(currNode.data);
    }

}
