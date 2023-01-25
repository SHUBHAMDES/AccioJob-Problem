package LinkedListProgram;

public class memaryManegmentAtTheEnd {
    public static void main(String[] args) {
        LinkedList7 newNode =new LinkedList7();
        newNode.insertAtEnd(10);
        newNode.insertAtEnd(20);
        newNode.insertAtEnd(30);
        newNode.print();
    }
}
class Node7
{
    int data;
    Node7 next;
    Node7(int num)//10
    {

        this.data=num;
    }
}
class LinkedList7{
    Node7 head;//null
    void insertAtEnd(int DATA)//30
    {
        Node7 newNode=new Node7(DATA);//30
         if(head ==null)//10==null
         {
             head =newNode;//
             return;
         }
         else{
            Node7 currentNode=this.head;//10->current node(10)
            while(currentNode.next !=null) {//10.next->null
                currentNode=currentNode.next;//20->20
            }
            currentNode.next =newNode;//10->20

         }
    }
    void print()
    {
        Node7 prin=this.head;
        while(prin!=null)
        {
            System.out.print(prin.data+" ");
            prin=prin.next;
        }
    }
}

