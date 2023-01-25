package LinkedListProgram;

import java.util.Scanner;
public class reverseLinkedList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList12 ll=new LinkedList12();
        for(int i=0;i<n;i++)
        {
            ll.reverseList(sc.nextInt());
        }

        ll.ptint();
    }
}
class Node12{
    int data;
    Node12 next;
    Node12(int num){
        this.data=num;
    }
}
class LinkedList12{
    Node12 head;
    void reverseList(int val){
        Node12 node=new Node12(val);
        node.next=head;
        head=node;
    }
    void ptint(){
        Node12 pre=this.head;
        while(pre!=null){
            System.out.print(pre.data+" ");
            pre=pre.next;
        }
    }
}

