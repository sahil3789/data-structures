package ds.binarytree;

public class Driver {

    public static void main(String args[]) {

        BinaryTree bt = new BinaryTree();

        bt.insert(bt.root,25);

        bt.insert(bt.root,15);
        bt.insert(bt.root,50);
        bt.insert(bt.root,10);
        bt.insert(bt.root,22);
        bt.insert(bt.root,4);
        bt.insert(bt.root,12);
        bt.insert(bt.root,18);
        bt.insert(bt.root,24);

        bt.insert(bt.root,50);
        bt.insert(bt.root,35);
        bt.insert(bt.root,70);
        bt.insert(bt.root,31);
        bt.insert(bt.root,44);
        bt.insert(bt.root,66);
        bt.insert(bt.root,90);

        System.out.println("preorder");
        bt.preorder(bt.root);

        System.out.println("inorder");
        bt.inorder(bt.root);

        System.out.println("postorder");
        bt.inorder(bt.root);



    }


}
