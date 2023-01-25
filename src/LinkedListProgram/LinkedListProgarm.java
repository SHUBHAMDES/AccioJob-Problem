package LinkedListProgram;

public class LinkedListProgarm {
    public static void main(String[] args) {
            LinkedList2 li=new LinkedList2();
            li.printList(10);
            li.printList(11);
            li.printList(12);
            li.print();

        }

}
class Node6{
    int data;
    Node6 next;

    Node6(int val){
        data=val;
    }
}
class LinkedList2{
    Node6 head;
    void printList(int value)
    {
        Node6 node=new Node6(value);//10

        if(head==null){
            this.head=node;//[10 | 1001]
            return;
        }else{
            Node6 tmp=this.head;//
            while(tmp.next!=null){
                 tmp=tmp.next;
            }
            tmp.next=node;
        }
    }
    void print()
    {
        Node6 ll=this.head;
        while(ll!=null)
        {
            System.out.print(ll.data+" ");
            ll=ll.next;
        }
    }
}
