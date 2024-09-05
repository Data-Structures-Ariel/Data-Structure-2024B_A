package TS;

import Nodes.Node;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Node<Integer> head = new Node(2);
        head.setNext(new Node(21));
        head.getNext().setNext(new Node(12));
        head.getNext().getNext().setNext(new Node(4));
        head.getNext().getNext().getNext().setNext(new Node(1));
        head.getNext().getNext().getNext().getNext().setNext(new Node(2));
        head.getNext().getNext().getNext().getNext().getNext().setNext(new Node(8));
        head.getNext().getNext().getNext().getNext().getNext().getNext().setNext(new Node(6));
        head.getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(new Node(2));
        head.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(new Node(21));
        head.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(new Node(28));
        head.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(new Node(20));


        boolean bool = chainK(head, 2);
        System.out.println(bool);

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


        IA[] allA = {new Boo(), new Foo(3), new Goo(3)};
        IB b = new Goo(3);
        b.B();
        IA f = (Foo) allA[1];
        f = (Boo) allA[0];
        ((Boo) f).Go();


        IC c = new Goo(4);


    }

    static class PriorityQueue {
        private Queue<Student> students;
        private int size;

        public PriorityQueue() {
            students = new LinkedList<>();
            size = 0;
        }

        public boolean add(Student s) {
            boolean bool = true;
            if (students.isEmpty())
                students.add(s);

            else
                for (int i = 0; i < size; i++) {
                    if (students.peek().getAverage() < s.getAverage())
                        students.add(students.poll());
                    else if (bool) {
                        students.add(s);
                        students.add(students.poll());
                        size++;
                        bool = !bool;
                    }


                }

            return true;
        }

        public double remove() {
            if (students.isEmpty())
                return -1;
            size--;
            for (int i = 0; i < size; i++) {
                students.add(students.poll());
            }
            Student s = students.remove();
            return s.getAverage();
        }
    }

    static class Student {
        private String name;
        private Node<Integer> grades;

        public double addGrade(int grade) {

            if (grades == null)
                grades = new Node<>(grade);
            else {
                Node<Integer> newGrade = new Node<>(grade);
                newGrade.setNext(grades);
                grades = newGrade;
            }
            return grade;

        }

        public double getAverage() {
            if (grades == null)
                return 0;
            Node<Integer> temp = grades;
            int sum = 0;
            int count = 0;

            while (temp != null) {
                count++;
                sum += temp.getValue();
                temp = temp.getNext();

            }
            return (double) sum / count;

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Node<Integer> getGrades() {
            return grades;
        }

        public void setGrades(Node<Integer> grades) {
            this.grades = grades;
        }
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
            flag = !flag;
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


    interface IA {
        void A();
    }

    interface IB {
        void B();
    }

    interface IC extends IA {
        void C();
    }

    static class Boo extends Foo implements IB {
        public Boo() {
            super(2);
        }

        public void A() {
        }

        public void B() {
        }

        public void Go() {
        }
    }

    static class Foo implements IA {
        int num;

        public Foo(int num) {
            this.num = num;
        }

        @Override
        public void A() {

        }
    }

    static class Goo implements IC, IB {
        int num;

        public Goo(int num) {
            this.num = num;
        }

        @Override
        public void A() {

        }

        @Override
        public void B() {

        }

        @Override
        public void C() {

        }
    }


}
