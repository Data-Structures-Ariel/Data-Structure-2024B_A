package L02.Tree;

public class BinNode<E> {

    private E value;
    private BinNode<E> right;
    private BinNode<E> left;


    public BinNode(E value) {
        this.value = value;
        this.left=null;
        this.right=null;
    }

    public BinNode(E value, BinNode<E> right, BinNode<E> left) {
        this.value = value;
        this.right = right;
        this.left = left;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public BinNode<E> getRight() {
        return right;
    }

    public void setRight(BinNode<E> right) {
        this.right = right;
    }

    public boolean hasRight() {
        return right != null;
    }
    public boolean hasLeft() {
        return left != null;
    }

    public BinNode<E> getLeft() {
        return left;
    }

    public void setLeft(BinNode<E> left) {
        this.left = left;
    }
}
