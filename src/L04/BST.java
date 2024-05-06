package L04;

import L03.BinNode;


public class BST<E extends Comparable<E>> {

    private BinNode<E> root;
    private int size;


    public BST() {
        root = null;
        size = 0;
    }

    public void insert(E value) {
        if (root == null)
            root = new BinNode<>(value);
        else
            insert(root, value);
        size++;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public int size() {
        return size;
    }

    private void insert(BinNode<E> r, E value) {
        if (r == null)
            return;
        if (value.compareTo(r.getValue())>=0) {
            insert(r.getRight(), value);
            r.setRight((r.hasRight()) ? r.getRight() : new BinNode<>(value));
        } else {
            insert(r.getLeft(), value);
            r.setLeft((r.hasLeft()) ? r.getLeft() : new BinNode<>(value));
        }
    }
}
