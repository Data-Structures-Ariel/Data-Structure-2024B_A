package L02.Tree;

import java.util.Random;

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

    inOrder(root);
        insert(root, 9);
        root = add(root, 8);
    }

    static public void inOrder(BinNode<Integer> root) {
        if (root != null) {
            inOrder(root.getLeft());
            System.out.print(root.getValue() + " ");
            inOrder(root.getRight());
        }
    }

    static public void preOrder(BinNode<Integer> root) {
        if (root != null) {
            System.out.println(root.getValue());
            inOrder(root.getLeft());
            inOrder(root.getRight());
        }
    }

    static public void postOrder(BinNode<Integer> root) {
        if (root != null) {
            inOrder(root.getLeft());
            inOrder(root.getRight());
            System.out.println(root.getValue());
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



