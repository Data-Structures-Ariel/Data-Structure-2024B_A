package L02;


import java.util.LinkedList;

public class StackLinkedList<E> {

    private LinkedList<E> ll;

    public StackLinkedList() {
        ll = new LinkedList<>();
    }

    //O(1)
    public boolean isEmpty() {
        return ll.isEmpty();
    }

    //o(1)
    public void push(E x) {
        ll.add(x);
    }

    //O(1)
    public E pop() {
        return ll.removeLast();
    }
    //O(1)
    public E top() {
        return ll.getLast();
    }
}
