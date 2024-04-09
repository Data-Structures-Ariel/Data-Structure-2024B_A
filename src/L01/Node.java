package L01;

public class Node<E> {

    private E value;
    private Node<E> next;
    private Node<E> prev;


    public Node(E value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }

    public Node(E value, Node<E> next,Node<E> prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public boolean hasNext() {
        return this.next != null;
    }

    public boolean hasPrev() {
        return this.prev != null;
    }
    public Node<E> getPrev() {
        return prev;
    }

    public void setPrev(Node<E> prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return value+"";
    }
}
