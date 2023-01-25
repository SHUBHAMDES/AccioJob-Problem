package LinkedListAssigment;

import java.util.ArrayList;
import java.util.Scanner;

public class OddSum {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int data=sc.nextInt();
//        OddSum ll=new OddSum();
//
//
//    }
//
//    //create a Node
//    class Node {
//        int data;
//        Node next;
//        void Node(int data){
//          this. data=data;
//            Node next=null;
//        }
//    }

    public static void main(String[] args) {

        ArrayList numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some numbers.");

        while (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            numbers.add(i);
            i++;
        }
        System.out.println(numbers);


    }





}
