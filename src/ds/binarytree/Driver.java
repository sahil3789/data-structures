package ds.binarytree;

public class Driver {

    public static void main(String args[]) {

    BinaryTree bt = new BinaryTree(25);

    bt.insert(15);
    bt.insert(50);
    bt.insert(10);
    bt.insert(22);
    bt.insert(35);
    bt.insert(70);
    bt.insert(4);
    bt.insert(12);
    bt.insert(18);
    bt.insert(24);
    bt.insert(31);
    bt.insert(44);
    bt.insert(66);
    bt.insert(90);

    System.out.println("preorder");
    bt.preorder(bt.root);

    System.out.println("inorder");
    bt.inorder(bt.root);

        System.out.println("postorder");
        bt.postorder(bt.root);





    }


}
