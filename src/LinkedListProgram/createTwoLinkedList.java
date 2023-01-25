package LinkedListProgram;

import java.util.Scanner;
class Node8{
    int data;//1
    Node8 next;
    Node8(int num){
        data=num;
    }
}
class creatTwoList{
    Node8 head;
    void TwoList(int val)
    {
        Node8 node=new Node8(val);
        if(head==null)
        {
            this.head=node;
            return;
        }else{
            Node8 tmp=this.head;
            while(tmp.next!=null)
            {
                tmp=tmp.next;//3
            }
            tmp.next=node;//1->2->3(head)->4
        }
    }
    static void compaire(Node8 h1,Node8 h2)
    {
        //h1->1 2 3 4
        //h2->1 2 3
        while(h1!=null&&h2!=null)
        {
            if (h1.data == h2.data)
            {
                h1 = h1.next;//4
                h2 = h2.next;//null
            } else
            {
                System.out.println(0);
                return;
            }
        }
        if(h1!=null||h2!=null)
            System.out.println(0);
        else System.out.println(1);
    }
}
public class createTwoLinkedList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        creatTwoList l1=new creatTwoList();
        creatTwoList l2=new creatTwoList();
         for(int i=0;i<m;i++){
             l1.TwoList(sc.nextInt());
         }
         for(int i=0;i<n;i++){
             l2.TwoList(sc.nextInt());
         }
         creatTwoList.compaire(l1.head,l2.head);
    }
}
