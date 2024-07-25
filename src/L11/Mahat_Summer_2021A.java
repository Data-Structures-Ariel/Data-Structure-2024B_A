package L11;


import java.util.*;


public class Mahat_Summer_2021A {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    static Scanner sc = new Scanner(System.in);
    static Random rd = new Random();


    public static void main(String[] args) {
        int ans;
        boolean bool;
        while (true) {
            System.out.println("Enter q number");
            int num = sc.nextInt();
            System.out.println("------------------------------------------");
            switch (num) {
                case 1:


                    break;
                case 2:

                    Queue<Integer> q = new LinkedList<>() {{
                        add(2);
                        add(5);
                        add(5);
                        add(7);
                        add(2);
                        add(4);
                        add(1);
                        add(3);
                        add(2);
                        add(5);
                        add(5);
                        add(1);
                    }};
                    System.out.println(q);
                    Queue<Integer> newQ = duplicate(q);
                    System.out.println(newQ);
                    break;
                case 3:
                    break;
                case 4:

                    break;
                case 5:
                    A a = new A();
                    B b = new B();
                    A ab = new B();
                    a.f();
                    ab.f();
                    b.f();
                    a.g();
                    ab.g();
                    b.g();
                    ((B) (ab)).superG();
                    b.superG();

//                    a.superG();
                    ((B) a).superG();
                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:
                    break;
                case 10:

                    break;
                case 11:
                    One x1 = new One(4, 'E');
                    One x2 = new One(3);
                    Two y1 = new Two(x1);
                    One x3 = new Two(5);
                    System.out.println("x1 before " + x1);
                    x1.inc();
                    System.out.println("x1 after " + x1);
                    System.out.println("x2 " + x2);
                    System.out.println("y1 " + y1);
                    System.out.println("x3 " + x3);
                    Two y2 = new Two(y1, 1);
                    System.out.println("y2 " + y2);
                    One x4 = y2.makeOne();
                    System.out.println("x4 " + x4);
                    break;
                case 12:
                    break;
                case 13:
                    break;
                case 14:
                    break;
                case -1:
                    return;

            }
        }
    }

    public static Queue<Integer> duplicate(Queue<Integer> q) {
        if (q == null)
            return null;

        Queue<Integer> newQ = new LinkedList<>();

        if (q.isEmpty())
            return newQ;
        int size = 0;

        while (!q.isEmpty()) {
            size++;
            newQ.add(q.poll());
        }

        while (!newQ.isEmpty())
            q.add(newQ.poll());

        while (!q.isEmpty()) {
            int item = q.peek();
            int cnt = 0;
            for (int i = 0; i < size; i++) {
                if (q.peek() == item) {
                    cnt++;
                    q.poll();
                    size--;
                } else
                    q.add(q.poll());
            }
            if (cnt > 2)
                newQ.add(item);
        }

        return newQ;

    }


}

class One {
    private int num;
    private char ch;

    public One() {
        num = 2;
        ch = 'G';
    }

    public One(int n) {
        num = n;
        ch = 'M';
    }

    public One(int n, char c) {
        num = n;
        ch = c;
    }

    public One(One other) {
        num = other.num;
        ch = other.ch;
    }

    public int getNum() {
        return num;
    }

    public char getCh() {
        return ch;
    }

    public void inc() {
        num++;
        ch++;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < num; i++)
            s += ch;
        return s;
    }
}

class Two extends One {
    private One first;

    public Two() {
        super();
        first = new One();
    }

    public Two(int n) {
        super(n);
        first = new One();
    }

    public Two(One other) {
        super();
        first = new One(other);
    }

    public Two(One other, int n) {
        super(other);
        first = new One(n);
    }

    public void inc() {
        first.inc();
    }

    private int what(int n, int m) {
        if (n > m) return n;
        return m;
    }

    private char what(char ch1, char ch2) {
        if (ch1 < ch2) return ch1;
        return ch2;
    }

    public One makeOne() {
        return
                new One(what(first.getNum(), getNum()),
                        what(first.getCh(), getCh()));
    }

    public String toString() {
        return first.toString();
    }
}


class A {
    public void f() {
        System.out.println("A.f");
    }

    public void g() {
        f();
    }
}

class B extends A {
    public void f() {
        System.out.println("B.f");
    }

    public void g() {
        System.out.println("B.g");
    }

    public void superG() {
        super.g();
    }
}

class Memory {
    private Node<Data> start;

    public Memory(int totalSize) {
        this.start = new Node<Data>(new Data(totalSize));
    }

    public boolean firstFit(int num) {
        if (isDangerousState())
            return false;
        Node<Data> temp = start;
        while (temp != null) {
            Data d = temp.getValue();
            if (d.isFree() && d.getSize() >= num)
                break;

            temp = temp.getNext();
        }

        if (temp == null)
            return false;

        Node<Data> newNode = new Node<>(new Data(num));
        newNode.getValue().setFree(false);
        newNode.setNext(temp.getNext());
        temp.setNext(newNode);
        temp.getValue().setSize(temp.getValue().getSize() - num);

        if (isDangerousState()) {
            temp.setNext(newNode.getNext());
            temp.getValue().setSize(temp.getValue().getSize() + num);
            return false;
        }

        return true;
    }

    public boolean isDangerousState() {

        int totalMemory = 0;
        int memory = 0;

        Node<Data> temp = start;
        while (temp != null) {
            Data d = temp.getValue();
            totalMemory += d.getSize();
            if (!d.isFree())
                memory += d.getSize();
            temp = temp.getNext();
        }

        return ((double) memory / totalMemory) > 0.9;

    }
}

class Data {
    private boolean free;
    private int size;

    //constructor
    public Data(int size) {
        this.free = true;
        this.size = size;
    }

    public boolean isFree() {
        return free;
    }

    public int getSize() {
        return size;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

class Node<E> {

    private E value;
    private Node<E> next;


    public Node(E value) {
        this.value = value;
        this.next = null;

    }

    public Node(E value, Node<E> next) {
        this.value = value;
        this.next = next;
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

    @Override
    public String toString() {
        return value + "";
    }
}

class BinNode<E> {

    private E value;
    private BinNode<E> left;
    private BinNode<E> right;


    public BinNode(E value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public BinNode(E value, BinNode<E> left, BinNode<E> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public BinNode<E> getLeft() {
        return left;
    }

    public void setLeft(BinNode<E> left) {
        this.left = left;
    }

    public boolean hasLeft() {
        return this.left != null;
    }

    public boolean hasRight() {
        return this.right != null;
    }

    public BinNode<E> getRight() {
        return right;
    }

    public void setRight(BinNode<E> right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return value + "";
    }
}