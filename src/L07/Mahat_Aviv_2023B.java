package L07;


import java.util.*;


public class Mahat_Aviv_2023B {

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
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:

                    break;
                case 6:
                    Inter1 x = new F();
                    G y = new G();
                    Inter3 z = new H();
                    x = y;
                    y = new H();
                    y.g2();
                    z.g3();
                    ((H)z).g4();
                    z = new F();
                    Object[] objects = new Object[100];
                    int cntG1=0;
                    int cntNG3=0;
                    for (int i = 0; i < objects.length; i++) {
                        if(objects[i] instanceof Inter1 )
                            cntG1++;
                        if(!(objects[i] instanceof Inter3))
                            cntNG3++;
                    }
                    System.out.println(cntG1);
//                    System.out.println(cntG3);
                    break;
                case 7:
                    BinNode<Integer> root = new BinNode<>(8,
                            new BinNode<>(3, new BinNode<>(4), new BinNode<>(2)),
                            new BinNode<>(8, new BinNode<>(9, new BinNode<>(8), null), new BinNode<>(6)));

                    System.out.println(second(root));
                    print(root);
                    System.out.println();
                    third(root);
                    print(root);
                    System.out.println();
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:

                    break;
                case 11:
                    BinNode<Character> bt = new BinNode<>('b');
                    BinNode<Character> bt1 = new BinNode<>('w');
                    BinNode<Character> bt2 = new BinNode<>('b',
                            new BinNode<>('w', new BinNode<>('b'), new BinNode<>('b')),
                            new BinNode<>('w', new BinNode<>('b'), new BinNode<>('b')));
                    BinNode<Character> bt3 = new BinNode<>('b',
                            new BinNode<>('w',
                                    new BinNode<>('b'), new BinNode<>('b')),
                            new BinNode<>('w',
                                    new BinNode<>('b'), new BinNode<>('w')));
                    BinNode<Character> bt4 = new BinNode<>('b',
                            new BinNode<>('w', new BinNode<>('b'), null),
                            new BinNode<>('w', null, new BinNode<>('w')));
                    BinNode<Character> bt5 = new BinNode<>('w',
                            new BinNode<>('b'),
                            new BinNode<>('b', new BinNode<>('b'), null));

                    bool = blueWhiteTree(bt);
                    System.out.println(ANSI_PURPLE);
                    System.out.println("bt -> " + bool);

                    bool = blueWhiteTree(bt1);
                    System.out.println(ANSI_CYAN);
                    System.out.println("bt1 -> " + bool);

                    bool = blueWhiteTree(bt2);
                    System.out.println(ANSI_RED);
                    System.out.println("bt2 -> " + bool);

                    bool = blueWhiteTree(bt3);
                    System.out.println(ANSI_GREEN);
                    System.out.println("bt3 -> " + bool);

                    bool = blueWhiteTree(bt4);
                    System.out.println(ANSI_YELLOW);
                    System.out.println("bt4 -> " + bool);

                    bool = blueWhiteTree(bt5);
                    System.out.println(ANSI_BLUE);
                    System.out.println("bt5 -> " + bool);
                    System.out.println();
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

    //O(n)
    private static boolean blueWhiteTree(BinNode<Character> bt) {
        if (bt == null)
            return true;

        if (bt.getValue() != 'w' && bt.getValue() != 'b')
            return false;

        if (!bt.hasLeft() && !bt.hasRight())
            return bt.getValue() == 'b';

        if (bt.getValue() == 'b')
            if (!bt.hasRight() || !bt.hasLeft() || bt.getLeft().getValue() != 'w' || bt.getRight().getValue() != 'w')
                return false;

        return blueWhiteTree(bt.getLeft()) && blueWhiteTree(bt.getRight());
    }

    private static void print(BinNode<Integer> root) {
        if (root == null)
            return;
        print(root.getLeft());
        System.out.print(root.getValue() + " ");
        print(root.getRight());
    }

    public static int first(BinNode<Integer> bt) {
        if (bt == null)
            return 0;
        return
                bt.getValue() + first(bt.getLeft()) + first(bt.getRight());
    }

    public static int second(BinNode<Integer> bt) {
        return first(bt.getLeft()) + first(bt.getRight());
    }

    public static void third(BinNode<Integer> bt) {
        if (bt != null) {
            bt.setValue(second(bt));
            third(bt.getLeft());
            third(bt.getRight());
        }
    }
}

interface Inter1 {
    void g1();
}

interface Inter2 {
    void g2();
}

interface Inter3 {
    void g3();
}

class F implements Inter1, Inter3 {

    @Override
    public void g1() {

    }

    @Override
    public void g3() {

    }
}

class G implements Inter1, Inter2 {

    @Override
    public void g1() {

    }

    @Override
    public void g2() {

    }
}

class H extends G implements Inter3 {
    public void g2() {

    }

    public void g3() {

    }

    public void g4() {

    }
}

class Node<E> {

    private E value;
    private Node<E> next;
    private Node<E> prev;


    public Node(E value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }

    public Node(E value, Node<E> next, Node<E> prev) {
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