package LinkedListProgram;

public class AddFirstOrAddHead {
    public static void main(String[] args) {
        LinkedList1 l1=new LinkedList1();
        l1.insertAtHead(1);
        l1.print();
        l1.insertAtHead(5);
        l1.print();
        l1.insertAtHead(6);
        l1.print();
        l1.insertAtHead(10);
        l1.print();


    }
}
class Node1{
    int val;
    Node1 next;

    Node1(int val)
    {

        this.val=val;
    }
}
class LinkedList1{
    Node1 head;//null
    //reference variable ,to refer to the first Node
    void insertAtHead(int val)//1 5
    {
         //1.creat a node with the value 'val' whose next is 'null'
                        //
        Node1 n=new Node1(val);//5

        //2.check if the linked List is empty(this.head==null)

        if(this.head==null){//head==null f
            this.head=n;//head(1)=n(1)
            return;
        }
        //3.Insert the newly created Node before haed
        n.next=head;
        this.head=n;
    }
    void print() {
        Node1 temp=this.head;
        System.out.print("Linked List: ");
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
     //   System.out.println(temp.val+ " ");

    }


}
