package LinkedListProgram;

public class LinkedListk {
      Node head;

    class Node{
        String data;
        Node next;

        Node(String data)//parametrise constroctore
        {
            this.data=data;
            this.next=null;
        }
    }
    //Add first ,Add Last
    //1)add first
    public void addFirst(String data)
    {
        Node newNode=new Node(data);
         if(head==null)
       {
           head=newNode;
           return;
       }
         newNode.next=head;
         head=newNode;
    }
    //2)Add last
    public void addLast(String data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            //return;
        }
        Node currNode=head;
        while(currNode.next!=null)
        {
         currNode=currNode.next;
            currNode.next=newNode;
        }

    }
//Print List
    public void printList()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null)
        {
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }

        System.out.println("Null");
    }

    public static void main(String[] args) {
       LinkedListk list=new LinkedListk();
       list.addFirst("a");
       list.addFirst("is");
       list.printList();
    }
}
