package LinkedListAssigment;
import java.io.*;
import java.util.*;

   public class Main {
       class Node {

           int data;
           Node next;

           Node(int x) {
               data = x;
               next = null;
           }
       }

       static void printList(Node node) {
           while (node != null) {
               System.out.print(node.data + " ");
               node = node.next;
           }
           System.out.println();
       }

       public void main(String args[]) throws IOException {
           Scanner sc = new Scanner(System.in);

           int n = sc.nextInt();

           Node head = new Node(sc.nextInt());
           Node tail = head;

           for (int i = 0; i < n - 1; i++) {
               tail.next = new Node(sc.nextInt());
               tail = tail.next;
           }

           int k = sc.nextInt();

           Solution g = new Solution();
           head = g.solve(head, k);

           printList(head);
       }

       class Solution {

           Node solve(Node head, int key) {


               return head;
           }


       }
   }
