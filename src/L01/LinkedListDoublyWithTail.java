package L01;


import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDoublyWithTail<E> implements List<E> {

    private Node<E> head;
    private Node<E> tail;
    private int size;


    public LinkedListDoublyWithTail() {
        this.size = 0;
        this.head = null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    //O(1)
    @Override
    public boolean add(E e) {
        Node<E> newNode = new Node<>(e);
        if (head == null) {
            tail = head = newNode;
            size++;
            return true;
        }
        newNode.setPrev(tail);
        tail.setNext(newNode);
        tail = newNode;
        size++;
        return true;

    }

    //O(1)
    public boolean addLast(E e) {
        return add(e);
    }

    //O(1)
    public boolean addFirst(E e) {
        Node<E> newNode = new Node<>(e);
        newNode.setNext(head);
        if (head != null)
            head.setPrev(newNode);
        else
            tail = newNode;
        head = newNode;
        return true;
    }

    //O(n)
    @Override
    public boolean remove(Object o) {

        if (head == null)
            return false;

        Node<E> current = head;
        while (current != null) {
            if (current.getValue().equals(o)) {
                size--;
                if (!current.hasPrev()) {
                    head = current.getNext();
                    if (head != null)
                        head.setPrev(null);
                    else
                        tail=null;
                    return true;
                }
                Node<E> next = current.getNext();
                Node<E> prev = current.getPrev();
                if (next == null) {
                    prev.setNext(null);
                    tail = prev;
                    return true;
                }
                prev.setNext(next);
                next.setPrev(prev);
                return true;
            }
            current = current.getNext();
        }

        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        head = null;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}
