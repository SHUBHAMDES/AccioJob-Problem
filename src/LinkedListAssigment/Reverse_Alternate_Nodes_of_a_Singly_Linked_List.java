package LinkedListAssigment;

import java.sql.SQLOutput;
import java.util.Scanner;

class Node2{
    int data;
    Node2 next;
    Node2(int data) {
        this.data = data;
    }
}
class LinkeList2{
    Node2 head;
    static  int n=1;
    void InserList(int data)
    {
        Node2 newNode=new Node2(data);
        if(head==null)
            this.head=newNode;
       else
       {
            Node2 currNode = this.head;
            while (currNode.next != null)
            {
                currNode = currNode.next;

            }
            n++;
            currNode.next = newNode;
        }
    }
    void print()
    {
        Node2 currNode = this.head;
      //  System.out.println("n size: "+n);
        int arr[]=new int[n];
        int j=0;
        while (currNode != null)
        {
            arr[j]=currNode.data;
         //   System.out.print(arr[j]+" ");
            //System.out.println(currNode.data+" ");
            currNode = currNode.next;
            j++;
        }
        for(int k=0;k<n;k=k+2)
        {
            System.out.print(arr[k]+" ");
        }
        if(n%2==0)
        {
            int k=n-1;
            while (k>0){
                System.out.print(arr[k]+" ");
                k=k-2;
            }
        }
        else {
            int k=n-2;
            while(k>0){
                System.out.print(arr[k]+" ");
                k=k-2;
            }
        }

    }
}

public class Reverse_Alternate_Nodes_of_a_Singly_Linked_List {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[num];
        LinkeList2 l=new LinkeList2();
        for(int i=0;i<num;i++)
        {
            l.InserList(sc.nextInt());
        }
        l.print();
    }
}
