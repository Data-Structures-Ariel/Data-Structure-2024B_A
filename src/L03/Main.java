package L03;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        BinNode<Integer> root2 = null;

        for (int i = 0; i < 15; i++) {
            root2 = add(root2, new Random().nextInt(90));
        }

        System.out.print("preOrder: ");
        preOrder(root2);
        System.out.print("\ninOrder: ");
        inOrder(root2);
        System.out.print("\npostOrder: ");
        postOrder(root2);
        System.out.println();
        System.out.println("----------------------------------------------------");

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

        System.out.print("preOrder: ");
        preOrder(root);
        System.out.print("\ninOrder: ");
        inOrder(root);


        int[] preOrder = {17, 36, 12, 10, 42, 7 ,28, 0, 1, 70};
        int[] inOrder = {10 ,12,42, 36, 17, 28, 7, 0, 1 ,70};


        System.out.println("\n----------------------------------------------------");


        root = build(preOrder, inOrder);

        System.out.print("\npreOrder: ");
        preOrder(root);
        System.out.print("\ninOrder: ");
        inOrder(root);
        System.out.print("\npostOrder: ");
        postOrder(root);


        System.out.println("\n-------------------------------------------------------------------------------------");


        root = new BinNode<>(0); // deg = 0

        // ------------------ deg-1 ---------------------
        root.setRight(new BinNode<>(1));
        root.setLeft(new BinNode<>(2));

        // ------------------ deg-2 ---------------------
        root.getRight().setRight(new BinNode<>(1));
        root.getRight().setLeft(new BinNode<>(3));

        root.getLeft().setLeft(new BinNode<>(3));
        root.getLeft().setRight(new BinNode<>(1));

        // ------------------ deg-3 ---------------------

        root.getLeft().getRight().setRight(new BinNode<>(2));
        root.getLeft().getLeft().setRight(new BinNode<>(1));
        // ------------------ deg-4 ---------------------
        root.getLeft().getLeft().getRight().setRight(new BinNode<>(1));

        System.out.print("preOrder: ");
        preOrder(root);
        System.out.print("\ninOrder: ");
        inOrder(root);



        System.out.println("\n----------------------------------------------------");

        int[] pre = {0, 2, 3, 1, 1, 1, 2, 1, 3, 1};
        int[] in={3, 1, 1, 2, 1, 2, 0, 3, 1, 1};

        root = build(pre, in);

        System.out.print("\npreOrder: ");
        preOrder(root);
        System.out.print("\ninOrder: ");
        inOrder(root);
        System.out.println();


        root = buildLast(pre, in);

        System.out.print("\npreOrder: ");
        preOrder(root);
        System.out.print("\ninOrder: ");
        inOrder(root);
        System.out.println();

    }

    private static BinNode<Integer> build(int[] preOrder, int[] inOrder) {
        if (preOrder == null || inOrder == null || preOrder.length != inOrder.length || preOrder.length == 0)
            return null;

        BinNode<Integer> node = new BinNode<>(preOrder[0]);

        if (preOrder.length == 1)
            return node;

        int mid = preOrder[0];
        int i;
        for (i = 0; i < inOrder.length; i++) {
            if (inOrder[i] == mid)
                break;
        }

        int[] preLeft =Arrays.copyOfRange(preOrder, 1, i+1); ;
        int[] inLeft = Arrays.copyOfRange(inOrder, 0, i);


        int[] preRight=Arrays.copyOfRange(preOrder, i+1, preOrder.length);
        int[] inRight = Arrays.copyOfRange(inOrder, i+1, inOrder.length);


        node.setLeft(build(preLeft,inLeft));
        node.setRight(build(preRight,inRight));

        return node;
    }

    private static BinNode<Integer> buildLast(int[] preOrder, int[] inOrder) {
        if (preOrder == null || inOrder == null || preOrder.length != inOrder.length || preOrder.length == 0)
            return null;

        BinNode<Integer> node = new BinNode<>(preOrder[0]);

        if (preOrder.length == 1)
            return node;

        int mid = preOrder[0];
        int i;
        for (i = inOrder.length-1; i >=0 ; i--) {
            if (inOrder[i] == mid)
                break;
        }

        int[] preLeft =Arrays.copyOfRange(preOrder, 1, i+1); ;
        int[] inLeft = Arrays.copyOfRange(inOrder, 0, i);


        int[] preRight=Arrays.copyOfRange(preOrder, i+1, preOrder.length);
        int[] inRight = Arrays.copyOfRange(inOrder, i+1, inOrder.length);


        node.setLeft(build(preLeft,inLeft));
        node.setRight(build(preRight,inRight));

        return node;
    }

    static public void inOrder(BinNode<Integer> root) {
        if (root != null) {
            inOrder(root.getLeft());
            System.out.print(root.getValue() + ", ");
            inOrder(root.getRight());
        }
    }

    static public void preOrder(BinNode<Integer> root) {
        if (root != null) {
            System.out.print(root.getValue() + ", ");
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }

    static public void postOrder(BinNode<Integer> root) {
        if (root != null) {
            postOrder(root.getLeft());
            postOrder(root.getRight());
            System.out.print(root.getValue() + ", ");
        }
    }

    private static BinNode<Integer> add(BinNode<Integer> root, int value) {
        if (root == null)
            return new BinNode<>(value);
        if (new Random().nextBoolean())
            root.setRight(add(root.getRight(), value));
        else
            root.setLeft(add(root.getLeft(), value));
        return root;
    }

    private static void insert(BinNode<Integer> root, int value) {
        if (root == null)
            return;
        if (new Random().nextBoolean()) {
            insert(root.getRight(), value);
            root.setRight((root.hasRight()) ? root.getRight() : new BinNode<>(value));
        } else {
            insert(root.getLeft(), value);
            root.setLeft((root.hasLeft()) ? root.getLeft() : new BinNode<>(value));
        }
    }

    private static void insertLoop(BinNode<Integer> root, int value) {
        if (root == null)
            return;
        while (root.hasLeft() || root.hasRight()) {

            if (new Random().nextBoolean()) {
                {
                    if (!root.hasRight()) {
                        root.setRight(new BinNode<>(value));
                        break;
                    }
                    root = root.getRight();
                }
            } else {
                if (!root.hasLeft()) {

                    root.setLeft(new BinNode<>(value));
                    break;
                }
                root = root.getLeft();
            }
        }
        if (new Random().nextBoolean())
            root.setRight(new BinNode<>(value));
        else
            root.setLeft(new BinNode<>(value));

    }

}



