package LinkedListProgram;

import java.util.Scanner;

public class seprateElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int m=sc.nextInt();
        int n=m+1;
        int tmp=0;
        LinkedList10 l=new LinkedList10();
        for(int i=n;i>0;i=i/10){
            tmp=i%10;
            l.Insert(tmp);
        }
        l.print();
    }
}
class Node10{
    int data;
    Node10 next;
    Node10(int data){
        this.data=data;
    }
}
class LinkedList10{
    Node10 head;
    void Insert(int val){
        Node10 node=new Node10(val);
       node.next=head;
       head=node;


    }
   void print(){
        Node10 tmp=this.head;
        while(tmp!=null){
            System.out.print(tmp.data+" ");
            tmp=tmp.next;
        }
    }
}