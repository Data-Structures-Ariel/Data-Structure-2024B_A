package Nodes;

public class BinNode<E> {

    private E value;
    private BinNode<E> left;
    private BinNode<E> right;


    public BinNode(E value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public BinNode(E value, BinNode<E> left, BinNode<E> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public BinNode<E> getLeft() {
        return left;
    }

    public void setLeft(BinNode<E> left) {
        this.left = left;
    }

    public boolean hasLeft() {
        return this.left != null;
    }

    public boolean hasRight() {
        return this.right != null;
    }

    public BinNode<E> getRight() {
        return right;
    }

    public void setRight(BinNode<E> right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return value + "";
    }
}
