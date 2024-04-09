package L01;


import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedList<E> implements List<E> {

    private Node<E> head;
    private int size;


    public LinkedList() {
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

        return new Iterator<E>() {
            Node<E> chain=head;

            @Override
            public boolean hasNext() {
                return chain!=null;
            }

            @Override
            public E next() {
                E item = chain.getValue();
                chain=chain.getNext();
                return item;
            }
        } ;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    //O(n)
    @Override
    public boolean add(E e) {
        if (head == null) {
            head = new Node<>(e);
            size++;
            return true;
        }
        Node<E> temp = head;
        while (temp.hasNext())
            temp = temp.getNext();

        temp.setNext(new Node<>(e));
        size++;
        return true;

    }

    //O(n)
    @Override
    public boolean remove(Object o) {

        if (isEmpty())
            return false;
        if (head.getValue().equals(o)) {
            head = head.getNext();
            size--;
            return true;
        }
        Node<E> prev = head;
        Node<E> current =head.getNext();
        while (current.hasNext()) {
            if (current.getValue().equals(o)) {
                prev.setNext(current.getNext());
                size--;
                return true;
            }
            prev = current;
            current = current.getNext();
        }
        if (current.getValue().equals(o)) {
            prev.setNext(null);
            size--;
            return true;
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

    //O(1)
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
