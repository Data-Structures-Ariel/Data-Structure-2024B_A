package L04;

import L03.BinNode;

import java.util.LinkedList;
import java.util.Queue;

public class Main {


    public static void main(String[] args) {
        BinNode<Integer> root = new BinNode<>(17); // deg = 0

        // ------------------ deg-1 ---------------------
        root.setRight(new BinNode<>(7));
        root.setLeft(new BinNode<>(36));

        // ------------------ deg-2 ---------------------
        root.getRight().setRight(new BinNode<>(0));
        root.getRight().setLeft(new BinNode<>(28));

        root.getLeft().setLeft(new BinNode<>(12));

        // ------------------ deg-3 ---------------------
        root.getLeft().getLeft().setLeft(new BinNode<>(10));
        root.getLeft().getLeft().setRight(new BinNode<>(42));

        root.getRight().getRight().setRight(new BinNode<>(1));

        // ------------------ deg-4 ---------------------
        root.getRight().getRight().getRight().setRight(new BinNode<>(70));


        levelOrder(root);
        int num =5;
        boolean bool = search(root,num);
    }

    public static boolean search(BinNode<Integer> root, int num) {
        if(root== null)
            return false;
        if(root.getValue()==num)
            return true;
        else if (root.getValue()>=num)
            return search(root.getLeft(),num);
        return search(root.getRight(),num);
    }

    private static void levelOrder(BinNode<Integer> root) {
        if (root == null)
            return;

        Queue<BinNode<Integer>> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            BinNode<Integer> item = q.remove();
            System.out.println(item.getValue() + "-> ");
            if(item.hasLeft())
                q.add(item.getLeft());
            if(item.hasRight())
                q.add(item.getRight());
        }
    }
}
