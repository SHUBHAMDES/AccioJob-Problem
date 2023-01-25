package LinkedListProgram;

public class deleteFirstElement {
    public static void main(String[] args) {
        LL1 li=new LL1();
        li.deleatAtFirst(100);
        li.deleatAtFirst(10);
        li.deleatAtFirst(20);
        li.deleatAtFirst(30);
        li.deleatAtFirst(40);
        li.delet();
        li.print();
    }
}
class Node5{
    int data;
    Node5 next;
    Node5(int n)
    {
        this.data=n;
    }
}
class LL1{
    Node5 top;
    void deleatAtFirst(int val)
    {
        Node5 node=new Node5(val);
        if(top==null)
        {
            this.top=node;
            return;
        }else{
            Node5 tmp=this.top;
            while(tmp.next!=null)
            {
                tmp=tmp.next;
            }
            tmp.next=node;
            return;
        }

    }
    void delet()
    {
        Node5 x=this.top.next;
       this.top=x;
    }
    void print()
    {
        Node5 shu=this.top;
        while(shu!=null)
        {
            System.out.print(shu.data+" ");
            shu=shu.next;
        }
    }
}
