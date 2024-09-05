package TS;

import Nodes.Node;

public class Main {
    public static void main(String[] args) {

        Node<Integer> head = new Node(2);
        head.setNext(new Node(21));
        head.getNext().setNext(new Node(12));
        head.getNext().getNext().setNext(new Node(4));
        head.getNext().getNext().getNext().setNext(new Node(3));
        head.getNext().getNext().getNext().getNext().setNext(new Node(2));
        head.getNext().getNext().getNext().getNext().getNext().setNext(new Node(8));
        head.getNext().getNext().getNext().getNext().getNext().getNext().setNext(new Node(6));
        head.getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(new Node(22));
        head.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(new Node(2));

        if (head == null)
            System.out.println("return / break ");

        while (head != null) {
            System.out.print(head.getValue() + " - > ");
            head = head.getNext();
        }
        System.out.println("null");


        Node<Integer> chain = new Node<>(92);
        chain.setNext(new Node<>(4));
        chain.getNext().setNext(new Node<>(543));

        Node<Integer> ch = new Node<>(92,
                new Node<>(4,
                        new Node<>(543)));
        print(ch);


        print(chain);

        Node<Integer> digits = chainDigit(chain);
        print(digits);


        boolean bool = chainK(chain,2);

    }

    private static boolean chainK(Node<Integer> chain, int k) {
        if (chain == null)
            return true;

        Node<Integer> temp = chain;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.getNext();
        }
        if (size % (2 * k) != 0)
            return false;

        boolean flag = true;
        while (chain != null) {

            if (flag)
                for (int i = 0; i < k - 1; i++) {
                    if (chain.getValue() >= chain.getNext().getValue())
                        return false;
                    chain = chain.getNext();
                }
            else
                for (int i = 0; i < k - 1; i++) {
                    if (chain.getValue() <= chain.getNext().getValue())
                        return false;
                    chain = chain.getNext();
                }
            flag=!flag;
            chain = chain.getNext();
        }


        return true;

    }

    public static void print(Node<Integer> chain) {
        while (chain != null) {
            System.out.print(chain.getValue() + " - > ");
            chain = chain.getNext();
        }
        System.out.println("null");
    }

    public static Node<Integer> chainDigit(Node<Integer> chain) {
        if (chain == null)
            return null;

        Node<Integer> digits = new Node<>(chain.getValue() % 10);
        Node<Integer> temp = digits;
        while (chain != null) { // 92 - > 4 - > 543 - > null
            int item = chain.getValue();
            while (item != 0) {
                int digit = item % 10;
                item /= 10;
                temp.setValue(digit); // 2 -> 9 -> -9 -> 4 -> -9 -> 3 -> 4 -> 5 -> -9 -> -9
                // temp
                temp.setNext(new Node<>(-9));
                temp = temp.getNext();
            }
            if (chain.hasNext()) {
                temp.setNext(new Node<>(-9));
                temp = temp.getNext();
            }
            chain = chain.getNext();
        }
        // 2 -> 9 -> -9 -> 4 -> -9 -> 3 -> 4 -> 5 -> -9 -> null
        return digits;
    }

    static class Node<E> {
        private E value;
        private Node<E> next;

        public Node(E value, Node<E> next) {
            this.value = value;
            this.next = next;
        }

        public Node(E value) {
            this.value = value;
            this.next = null;
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
            return next != null;
        }
    }

}
