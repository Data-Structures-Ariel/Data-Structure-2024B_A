package L02;

import L01.Node;

import java.util.NoSuchElementException;

public class QueueNode<E> {

    private Node<E> head;
    private Node<E> tail;
    private int size;


    public QueueNode() {
        head=tail=null;
        size=0;
    }

    public boolean isEmpty() {
        return head == null; // size==0
    }

    //O(1)
    public void insert(E e) {
        Node<E> newNode = new Node<>(e);
        if (head == null) {
            tail = head = newNode;
            return;
        }
        tail.setNext(newNode);
        tail = newNode;
        size++;
    }

    //O(1)
    public E remove() {
        if (isEmpty())
            throw new NoSuchElementException();
        E item = head.getValue();
        head = head.getNext();
        if (head == null)
            tail = head;
        size--;
        return item;
    }

    //O(1)
    public E head(){
        if (isEmpty())
            throw new NoSuchElementException();
        E item = head.getValue();
        return item;
    }



}
