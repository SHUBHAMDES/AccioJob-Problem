package LinkedListProgram;

import java.util.Scanner;

public class insertNodeIntoTheMiddleOfTheLinkedList
{
    static int n;
    public static void main(String[] args) {
        insertNodeIntoTheMiddleOfTheLinkedList l=new insertNodeIntoTheMiddleOfTheLinkedList();
        Scanner sc=new Scanner(System.in);
             n=sc.nextInt();
        for(int i=0;i<n;i++){
            l.creatLinkeList(sc.nextInt());
        }
        int target=sc.nextInt();
        l.insertElementMidule(target);
        l.print();
    }
    static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    Node head;

    void creatLinkeList(int data)
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
      int xx=0;
    void insertElementMidule(int target){
        Node newNode=new Node(target);
        int num=0;

        if(n%2==0){
            num=n/2;
        }else {
            int k=n/2;
            num=k+1;
        }
        Node tmpNode=head;
                                //0<4-1(3)
        for(int i=0;i<num-1;i++){//0,1,2<3
            tmpNode=tmpNode.next;
            xx=tmpNode.data;
        }
        newNode.next=tmpNode.next;
        tmpNode.next=newNode;

    }
    void print()
    {
        Node tmpNode=head;
        while(tmpNode!=null)
        {
            System.out.print(tmpNode.data+" ");
            tmpNode=tmpNode.next;
        }
        System.out.println();
        System.out.println(xx);
    }

}
