package LinkedListProgram;

import java.util.Scanner;
class Node99
{
    int data;
    Node99 next;

    Node99(int data, Node99 next)
    {
        this.data = data;
        this.next = next;
    }
}

public class Mains {

    public static void printList( Node99 head)
    {


        Node99 ptr = head;
        while (ptr != null)
        {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }


    }

    // Function to swap the k'th node from the beginning with the
    // k'th node from the end in a linked list
    public static Node99 swapNodes(Node99 head, int k)
    {
        Node99 x, y, prev_x = null, prev_y = head;

        // Find the k'th node from the beginning and store it in `x`.
        // Also, calculate the previous node of `x` and store it in `prev_x`.
        Node99 curr = head;
        for (int i = 1; i < k && curr != null; i++)
        {
            prev_x = curr;
            curr = curr.next;
        }
        x = curr;

        // If `k` is more than the total number of nodes, X and Y doesn't exist
        if (curr == null) {
            return null;
        }

        // Find the k'th node from the end and store it in `y`.
        // Also, calculate the previous node of `y` and store it in `prev_y`.
        Node99 ptr = head;
        while (curr.next != null)
        {
            prev_y = ptr;
            ptr = ptr.next;
            curr = curr.next;
        }
        y = ptr;

        // Y is next to X (X —> Y)
        if (x.next == y)
        {
            x.next = y.next;
            y.next = x;

            if (prev_x != null && prev_x != x) {
                prev_x.next = y;
            } else {
                head = y;
            }
        }

        // X is next to Y (Y —> X)
        else if (y.next == x)
        {
            y.next = x.next;
            x.next = y;

            if (prev_y != null && prev_y != y) {
                prev_y.next = x;
            } else {
                head = x;
            }
        }

        // X is the head node
        else if (x == head)
        {
            head = y;
            y.next = x.next;
            prev_y.next = x;
            x.next = null;
        }

        // Y is the head node
        else if (y == head)
        {
            head = x;
            x.next = y.next;
            prev_x.next = y;
            y.next = null;
        }

        // Otherwise
        else {
            ptr = y.next;
            y.next = x.next;
            x.next = ptr;

            prev_x.next = y;
            prev_y.next = x;
        }

        return head;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
       // int[] arr = { 1, 2, 3, 4};
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        Node99 head = null;
        for (int i = arr.length - 1; i >= 0; i--) {
            head = new Node99(arr[i], head);
        }

       // printList("Before : ", head);

        //int k = 4;
        head = swapNodes(head, k);

        printList(head);
    }
}
