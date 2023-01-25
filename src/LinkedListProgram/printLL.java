package LinkedListProgram;

public class printLL {
    public static void main(String[] args) {
        //  Scanner sc=new Scanner(System.in);
        LinkedList li=new LinkedList();//create a new Linked List
//        for(int i=0;i<3;i++){
//            li.insrtAtEnd(sc.nextInt());
//        }

        li.insrtAtEnd(1);
        li.insrtAtEnd(2);
        li.insrtAtEnd(3);
        li.insrtAtEnd(8);

        li.print();

    }
}
class  Node
{//Node is user Difine data type
    int val;//1 2 3
    Node next;//referce verible which can store reference of "Node' object
    Node(int val)
    {
        this.val=val;//1 2 3
        //this .next will be default have the value 'null'
    }

}

class LinkedList
{
    //'Node and head'is are  reference verible and its default value is 'null'
    Node head;//null 1

    //Insert Linked List
    void insrtAtEnd(int val)
    {
        //1.Create a node with the value 'val'.
        Node n=new Node(val);//1 2 3

        //2.check if the  Linked List is empty(this.head==null)
        if(this.head==null) {//1!=null
            this.head=n;//1
            return;
        }
        //3.make temp1 refer to the last node of Linked List

        Node temp1=this.head;//we create temparary verialbe'temp1' to travers to the linked list
        while(temp1.next!=null){//1!=null
            temp1=temp1.next;//null=temp1.null
        }
        //3.Now insert new Node 'n' next to the Node referred by 'temp1'
        //n is reference of a newly created node(list)'val'(L29)
        //and its store the this newly created Node(list) in the 'temp1.next'
        // 'n' ki value 'next' me store hogi 'temp1' is refer to 'next' verible
        //'next' is also refernce veribel but its store the value on of'n'

        temp1.next=n;//temp1.null=2=temp1(2)

    }
    //print Linked List
    void print() {
        Node shubham=this.head;
        while(shubham!=null)
        {
            System.out.print(shubham.val+" ");
            shubham=shubham.next;
        }

    }
}