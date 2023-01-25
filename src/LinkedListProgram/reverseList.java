package LinkedListProgram;

public class reverseList {
    public static void main(String[] args) {
 list ll=new list();
 ll.revlist(10);
 ll.revlist(25);
 ll.revlist(27);
 ll.print();
    }
}
class Node3{
    int data;
    Node3 next;

    Node3(int val)
    {
        data=val;
    }
}
class list{
    Node3 top;//5
    void revlist(int num)
    {
        Node3 node=new Node3(num);
        node.next=top;
       this.top=node;
    }
    void print()
    {
        Node3 shu=this.top;
        while(shu!=null)
        {
            System.out.print(shu.data+" ");
            shu=shu.next;
        }

    }
}