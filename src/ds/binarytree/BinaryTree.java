package ds.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    Node root;

    static class Node {

        int key;
        Node left;
        Node right;

        Node(int key){
            this.key = key;
            this.left = null;
            this.right = null;
        }
    }

    void insert(Node rootRef, int key) {

        if(root==null) {
            root = new Node(key);
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(rootRef);

        while(!q.isEmpty()) {

            rootRef  = q.peek();
            q.remove();

            if(rootRef.left==null)
            {
                rootRef.left = new Node(key);
                break;
            }
            else
                q.add(rootRef.left);

            if(rootRef.right==null)
            {

                rootRef.right= new Node(key);
                break;
            }
            else
                q.add(rootRef.right);
        }
    }

    void preorder(Node rootRef) {



        Queue<Node> q = new LinkedList<>();
        q.add(rootRef);

        while(!q.isEmpty()) {

            rootRef = q.peek();

            System.out.println(rootRef.key);

            q.remove();

            if(rootRef.left!=null)
                q.add(rootRef.left);

            if(rootRef.right!=null)
                q.add(rootRef.right);

        }

    }

    void inorder(Node rootRef) {


        if(rootRef==null)
            return;

        inorder(rootRef.left);

        System.out.println(rootRef.key);

        inorder(rootRef.right);

    }

    void postorder(Node rootRef) {

        if(rootRef==null)
            return;

        inorder(rootRef.left);

        inorder(rootRef.right);

        System.out.println(rootRef.key);


    }

}
