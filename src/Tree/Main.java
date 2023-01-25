package Tree;
import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;
class Node {
    int data;
    Node left, right;
    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinarySearchTree {
    static Node constructBST(int[]arr,int start,int end,Node root) {
        if(start>end) return null;
        int mid=(start+end)/2;

        if(root==null)
            root=new Node(arr[mid]);

        root.left=constructBST(arr,start,mid-1, root.left);
        root.right=constructBST(arr,mid+1,end, root.right);

        return root;

    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        Node root=null;
        BinarySearchTree bst=new BinarySearchTree();
        root=bst.constructBST(arr,0,n-1,root);

        Level_order_traversal A = new Level_order_traversal();
        ArrayList<Integer> ans=A.levelOrder(root);
        for(Integer num:ans)
            System.out.print(num+" ");

        System.out.println();


    }
}

 class Level_order_traversal {
    //Function to return the level order traversal of a tree.
    static ArrayList levelOrder(Node root) {
        // Your code here
        Queue PQ = new LinkedList<>();

        PQ.add(root);

        ArrayList<Integer> Result = new ArrayList<>();
        while(!PQ.isEmpty()){
            Node node = (Node) PQ.poll();

            Result.add(node.data);

            if(node.left != null) PQ.add(node.left);
            if(node.right != null) PQ.add(node.right);
        }
        return Result;

    }
}

