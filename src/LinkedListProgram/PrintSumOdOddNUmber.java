package LinkedListProgram;

import java.util.Scanner;

public class PrintSumOdOddNUmber {
    public static void main(String[] args) {
        PrintSumOdOddNUmber obj=new PrintSumOdOddNUmber();
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
        obj.CreateLinkedList(sc.nextInt());
        }
        obj.printSum();
    }
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;

    public void CreateLinkedList(int data){
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
//1->2->4->3->9->10->5
    static  int sum;
    void printSum(){
        Node currNode=head;
        while(currNode.next!=null){
            if(currNode.data%2!=0){
                sum+=currNode.data;
            }
            currNode=currNode.next;
        }
        if(currNode.data%2!=0){
            sum+=currNode.data;
        }

        System.out.println(sum);
    }
}
