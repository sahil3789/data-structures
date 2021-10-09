package ds.binarytree;

import java.util.LinkedList;
import java.util.Queue;

class Node {

    int key;
    Node left;
    Node right;

    Node(int key){

        this.key = key;
        this.left=null;
        this.right=null;
    }
}

public class BinaryTree {

    Node root;

    BinaryTree(int key){

        root = new Node(key);
        System.out.println("added root:"+root.key);
    }

    void insert(int key){

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){

            if(q.peek().left==null) {
                q.peek().left = new Node(key);
                System.out.println("added left:"+q.peek().left.key);
                break;
            }
            else
                q.add(q.peek().left);

            if(q.peek().right==null){
                q.peek().right=new Node(key);
                System.out.println("added right:"+q.peek().right.key);
                break;
            }
            else
                q.add(q.peek().right);

            q.remove();
        }

    }

    void preorder(Node rootRef){

        if(rootRef==null)
            return;

        System.out.println(rootRef.key);
        preorder(rootRef.left);
        preorder(rootRef.right);

    }

    void inorder(Node rootRef) {

        if (rootRef==null)
            return;

        inorder(rootRef.left);
        System.out.println(rootRef.key);
        inorder(rootRef.right);

    }

    void postorder(Node rootRef) {

        if (rootRef==null)
            return;

        postorder(rootRef.left);
        postorder(rootRef.right);
        System.out.println(rootRef.key);

    }


}