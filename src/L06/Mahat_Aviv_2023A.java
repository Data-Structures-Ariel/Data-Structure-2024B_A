package L06;


import java.util.*;


public class Mahat_Aviv_2023A {

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
                    Node<Integer> n = new Node<>(2,
                            new Node<>(3,
                                    new Node<>(2,
                                            new Node<>(1,
                                                    new Node<>(4,
                                                            new Node<>(1,
                                                                    new Node<>(8), null), null), null), null), null), null);


                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    Node<Integer> lst = new Node<>(4,
                            new Node<>(9,
                                    new Node<>(3,
                                            new Node<>(7,
                                                    new Node<>(9,
                                                            new Node<>(9,
                                                                    new Node<>(7,
                                                                            new Node<>(7,
                                                                                    new Node<>(2,
                                                                                            new Node<>(9), null), null), null), null), null), null), null), null), null);

                    print(lst);
                    System.out.println(distance(lst, 7));
                    System.out.println(distance(lst, 3));
                    System.out.println("min distance -> " + minDistanceValue(lst));
                    System.out.println("סיבוכיות הפעולה הראשונה הינה n פעולות מכיוון ואני עובר על כל איבר פעם אחת בלבד, סיבוכיות הפעולה השניה הינה n^2 מכיוון ועל כל איבר ברשימה אני מבצע את הפעולה הראשונה שהיא עולה לי n פעולות ולכן אם קיים n איברים אז לכל איבר אני מבצע n פעולות ומכאן סיבוכיות הפעולה השניה היא n^2");


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
                    Queue<Stack<Integer>> qst = new LinkedList<>() {{
                        add(new Stack<>() {{
                            add(7);
                            add(3);
                            add(2);
                        }});
                        add(new Stack<>() {{
                            add(15);
                            add(14);
                            add(12);
                            add(10);
                            add(7);
                        }});
                        add(new Stack<>() {{
                            add(70);
                            add(65);
                            add(60);
                            add(36);
                            add(20);
                            add(15);
                        }});
                        add(new Stack<>() {{
                            add(115);
                            add(112);
                            add(108);
                            add(100);
                            add(90);
                            add(80);
                            add(70);
                        }});
                        add(new Stack<>() {{
                            add(800);
                            add(700);
                            add(500);
                            add(300);
                            add(200);
                            add(180);
                            add(130);
                            add(115);
                        }});
                    }};
                    System.out.println(isPerfect(qst));
                    break;
                case 11:
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

    public static int compare(Node<Integer> n1, Node<Integer> n2) {

        int numOfNumber1 = numDigits(n1);
        int numOfNumber2 = numDigits(n2);
        if (numOfNumber1 > numOfNumber2)
            return 1;
        else if (numOfNumber1 < numOfNumber2)
            return 2;
        else {

            while (n1 != null) {
                if (n1.getValue() > n2.getValue())
                    return 1;
                else if (n1.getValue() < n2.getValue())
                    return 2;
                n1 = n1.getNext();
                n2 = n2.getNext();
            }
        }

        return 0;
    }

    public static int numDigits(Node<Integer> n) {
        int num = 0;
        while (n != null) {
            num++;
            n = n.getNext();
        }
        return num;
    }

    public static int size(Stack<Integer> st) {
        if (st == null)
            return -1;

        Stack<Integer> temp = new Stack<>();
        int size = 0;
        while (!st.isEmpty()) {
            temp.add(st.pop());
            size++;
        }
        while (!temp.isEmpty()) {
            st.add(temp.pop());
        }

        return size;

    }

    public static boolean headTailStack(Stack<Integer> st1, Stack<Integer> st2) {
        if (st1 == null || st2 == null)
            return false;

        Stack<Integer> temp = new Stack<>();

        while (!st1.isEmpty()) {
            temp.add(st1.pop());
        }
        boolean bool = temp.peek() == st2.peek();
        while (!temp.isEmpty()) {
            st1.add(temp.pop());
        }

        return bool;

    }

    public static boolean ascStack(Stack<Integer> st) {
        if (st == null)
            return false;

        Stack<Integer> temp = new Stack<>();
        boolean bool = true;
        while (!st.isEmpty()) {
            temp.add(st.pop());
            if (!st.isEmpty())
                if (temp.peek() >= st.peek()) {
                    bool = false;
                    break;
                }
        }
        while (!temp.isEmpty()) {
            st.add(temp.pop());
        }

        return bool;

    }

    public static boolean isPerfect(Queue<Stack<Integer>> q) {
        if (q == null)
            return true;

        while (!q.isEmpty()) {
            Stack<Integer> s = q.remove();
            if (!ascStack(s))
                return false;
            if (!q.isEmpty()) {
                if (size(s) >= size(q.peek()))
                    return false;
                if (!headTailStack(s, q.peek()))
                    return false;
            }

        }
        return true;
    }

    private static void print(Node<Integer> lst) {
        while (lst != null) {
            System.out.print(lst.getValue() + " -> ");
            lst = lst.getNext();
        }
        System.out.println("null");
    }


    //O(n)
    public static int distance(Node<Integer> lst, int num) {

        if (lst == null)
            return -1;
        int indexOf = -1;
        int lastIndexOf = -1;
        int len = 0;
        while (lst != null) {
            len++;
            if (lst.getValue() == num) {
                lastIndexOf = indexOf = len - 1;
                break;
            }
            lst = lst.getNext();
        }

        while ((lst = lst.getNext()) != null) {
            len++;
            if (lst.getValue() == num) {
                lastIndexOf = len - 1;
            }
        }
        if(indexOf+lastIndexOf==-2)
            return -1;

        return indexOf + (len-1 - lastIndexOf);
    }

    //O(n^2)
    public static int minDistanceValue(Node<Integer> lst) {

        if (lst == null)
            return -1;
        Node<Integer> temp = lst;

        int item = temp.getValue();
        int min = distance(lst, item);

        while (temp != null) {
            item = temp.getValue();
            int tempDistance = distance(lst, item);
            if (tempDistance < min)
                min = tempDistance;
            temp = temp.getNext();
        }
        return min;
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