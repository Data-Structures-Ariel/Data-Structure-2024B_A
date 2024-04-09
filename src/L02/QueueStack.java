package L02;

import java.util.NoSuchElementException;
import java.util.Stack;

public class QueueStack<E> {

    private Stack<E> st;
    private Stack<E> temp;


    public QueueStack() {
        st=new Stack<>();
        temp=new Stack<>();
    }
    //O(1)
    public boolean isEmpty() {
       return st.isEmpty();
    }

    //O(n)
    public void insert(E e) {

        while(!st.isEmpty()){
            temp.push(st.pop());
        }
        st.push(e);
        while(!temp.isEmpty()){
            st.push(temp.pop());
        }

    }

    //O(n)
    public E remove() {
        if (isEmpty())
            throw new NoSuchElementException();
        return st.pop();
    }

    //O(n)
    public E head(){
        if (isEmpty())
            throw new NoSuchElementException();

        return st.peek();
    }


}

class QueueStack_<E> {

    private Stack<E> st;
    private Stack<E> temp;


    public QueueStack_() {
        st=new Stack<>();
        temp=new Stack<>();
    }
    //O(1)
    public boolean isEmpty() {
        return st.isEmpty();
    }

    //O(1)
    public void insert(E e) {
        st.push(e);
    }

    //O(n)
    public E remove() {
        if (isEmpty())
            throw new NoSuchElementException();
        while(!st.isEmpty()){
            temp.push(st.pop());
        }
        E item = temp.pop();
        while(!temp.isEmpty()){
            st.push(temp.pop());
        }
        return item;
    }

    //O(n)
    public E head(){
        if (isEmpty())
            throw new NoSuchElementException();
        while(!st.isEmpty()){
            temp.push(st.pop());
        }
        E item = temp.peek();
        while(!temp.isEmpty()){
            st.push(temp.pop());
        }
        return item;
    }


}
