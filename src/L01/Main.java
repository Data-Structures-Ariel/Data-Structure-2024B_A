package L01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Node<Integer> chain1 = new Node<>(0);
        chain1.setNext(new Node<>(1));
        chain1.getNext().setNext(new Node<>(2));

        addToChain(chain1, 8);


        Node<Integer> chain2 = null;
        chain2 = addChain(chain2, 0);
        addChain(chain2, 1);


        Node<Integer> head = new Node<>(0);
        head.setNext(new Node<>(1));
        head.getNext().setPrev(head);
        head.getNext().setNext(new Node<>(2));
        head.getNext().getNext().setPrev(head.getNext());

//        Node<Integer> chain = new Node<>(0);
//        print(chain);
//        for (int i = 1; i < 10; i++) {
//            add(chain, i);
//        }
//        print(chain);

        LinkedList<Integer> ll = new LinkedList<>(){{
            for (int i = 0; i < 10; i++) {
                add(i);
            }
        }};
        ArrayList<Integer> al = new ArrayList<>();
        search(ll);
        search(al);
        System.out.println("With loop");
        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i)+" ");
        }
        System.out.println("");

        Iterator<Integer> iter = ll.iterator();
        System.out.println("With if Iter");

        if(iter.hasNext())
            System.out.print(iter.next()+" ");
        System.out.println("");
        System.out.println("With while Iter");
        while (iter.hasNext())
            System.out.print(iter.next()+" ");
        System.out.println("");
    }

    public static int search(List<Integer> list) {
        if (list instanceof LinkedList)
            System.out.println("ok");

        return -1;
    }

    //O(n)
    private static void addToChain(Node<Integer> chain, int value) {
        if (chain == null)
            return;

        while (chain.hasNext())
            chain = chain.getNext();

        chain.setNext(new Node<>(value));
    }

    private static Node<Integer> addChain(Node<Integer> chain, int value) {
        if (chain == null)
            return new Node<>(value);

        while (chain.hasNext())
            chain = chain.getNext();

        chain.setNext(new Node<>(value));

        return chain.getNext();
    }

    private static void print(Node<Integer> chain) {

        while (chain != null) {

            System.out.println(chain.getPrev() + " <-(prev) " + chain.getValue() + " (next)-> " + chain.getNext());
            chain = chain.getNext();
        }
    }

    public static void add(Node<Integer> head, int value) {

        Node<Integer> temp = head;
        while (temp.getNext() != head)
            temp = temp.getNext();

        Node<Integer> newNode = new Node<>(value);
        newNode.setNext(head);
        head.setPrev(newNode);
        temp.setNext(newNode);
        newNode.setPrev(temp);


    }

    public static void addDo(Node<Integer> head, int value) {


        while (head.hasNext())
            head = head.getNext();

        Node<Integer> newNode = new Node<>(value, null, head);
        head.setNext(newNode);


    }
}
