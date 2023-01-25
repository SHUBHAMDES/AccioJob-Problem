package Tree;
import java.util.*;
class node {
    int val;
    node left, right;
    node(int val){
        this.val = val;
        left = null;
        right = null;
    }
}
class BST{
    node root = null;
    BST(){

    }
    node insert(node root, int val){
        if(root == null){
            root = new node(val);
            return root;
        }
        if(val < root.val){
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }
        return root;
    }
}

class solution {
    static ArrayList<Integer>ans=new ArrayList<>();
    //static ArrayList<Integer>ans=new ArrayList<>();
    public static void traversal(node curr, BST t){
        // Your code here, Print output here.
        //formula left->root->right
        if(curr==null)return;
        traversal(curr.left,t);
        ans.add(curr.val);
        traversal(curr.right,t);
    }
    void printTree(){
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}

public class Inorder_Travalsal {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        BST t = new BST();
        for(int i = 0; i < n; i++){
            t.root = t.insert(t.root, input.nextInt());
        }
        solution Obj = new solution();
        Obj.traversal(t.root, t);
        Obj.printTree();
    }
}