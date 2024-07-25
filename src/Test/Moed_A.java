package Test;

import java.util.*;

public class Moed_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose the question to run (1A, 1B, 2, 3, 4, 5, 6, 7, 8, 9, 10):");
            String choice = scanner.next();

            switch (choice) {
                case "1A":
                    // Example for Question 1 Part A
                    Queue<Integer> queue1A = new LinkedList<>();
                    queue1A.add(2);
                    queue1A.add(6);
                    queue1A.add(-9);
                    queue1A.add(7);
                    queue1A.add(2);
                    queue1A.add(4);
                    queue1A.add(-9);
                    queue1A.add(8);
                    queue1A.add(-9);
                    queue1A.add(1);
                    queue1A.add(9);
                    queue1A.add(6);
                    System.out.println("Max number: " + findMaxNumber(queue1A));
                    break;

                case "1B":
                    // Example for Question 1 Part B
                    Queue<Integer> queue1B = new LinkedList<>();
                    queue1B.add(2);
                    queue1B.add(6);
                    queue1B.add(-9);
                    queue1B.add(7);
                    queue1B.add(2);
                    queue1B.add(4);
                    queue1B.add(-9);
                    queue1B.add(8);
                    queue1B.add(-9);
                    queue1B.add(1);
                    queue1B.add(9);
                    queue1B.add(6);
                    System.out.println("Queue before removing min number: " + queue1B);
                    removeMinNumber(queue1B);
                    System.out.println("Queue after removing min number: " + queue1B);
                    Queue<Integer> queue1B2 = new LinkedList<>();
                    queue1B2.add(2);
                    queue1B2.add(6);
                    queue1B2.add(-9);
                    queue1B2.add(8);
                    queue1B2.add(-9);
                    queue1B2.add(7);
                    queue1B2.add(2);
                    queue1B2.add(4);
                    queue1B2.add(-9);
                    queue1B2.add(8);
                    queue1B2.add(-9);
                    queue1B2.add(8);
                    queue1B2.add(-9);
                    queue1B2.add(1);
                    queue1B2.add(9);
                    queue1B2.add(6);
                    System.out.println("Queue before removing min number: " + queue1B2);
                    removeMinNumber(queue1B2);
                    System.out.println("Queue after removing min number: " + queue1B2);

                    queue1B2 = new LinkedList<>();
                    queue1B2.add(2);
                    queue1B2.add(6);
                    queue1B2.add(-9);
                    queue1B2.add(1);
                    queue1B2.add(8);
                    queue1B2.add(-9);
                    queue1B2.add(7);
                    queue1B2.add(2);
                    queue1B2.add(4);
                    queue1B2.add(-9);
                    queue1B2.add(1);
                    queue1B2.add(8);
                    queue1B2.add(-9);
                    queue1B2.add(1);
                    queue1B2.add(8);
                    queue1B2.add(-9);
                    queue1B2.add(1);
                    queue1B2.add(9);
                    queue1B2.add(6);
                    System.out.println("Queue before removing min number: " + queue1B2);
                    removeMinNumber(queue1B2);
                    System.out.println("Queue after removing min number: " + queue1B2);
                    break;

                case "2":
                    // Example for Question 2
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
                    System.out.println("Is K-Even Skip: " + isKEvenSkip(head, 2));
                    break;

                case "3":
                    // Example for Question 3
                    Stack<Integer> stack1 = new Stack<>();
                    stack1.push(7);
                    stack1.push(6);
                    stack1.push(14);
                    stack1.push(8);
                    stack1.push(12);
                    stack1.push(9);
                    stack1.push(7);
                    System.out.println("Stack before : " + stack1);
                    Stack<Integer> stack2 = new Stack<>();
                    stack2.push(11);
                    stack2.push(9);
                    stack2.push(1);
                    stack2.push(4);
                    stack2.push(13);
                    stack2.push(4);
                    stack2.push(8);
                    stack2.push(2);
                    System.out.println("Stack before : " + stack2);
                    System.out.println("Max adjacent sum: " + findMaxAdjacentSum(stack1, stack2));
                    System.out.println("Stack after : " + stack1);
                    System.out.println("Stack after : " + stack2);
                    break;

                case "4":
                    // Example for Question 4
                    Queue<Integer> myQueue = new LinkedList<>();
                    myQueue.add(4);
                    myQueue.add(3);
                    myQueue.add(1);
                    myQueue.add(8);
                    myQueue.add(9);

                    Stack<Integer> myStack = new Stack<>();

                    sod1(myQueue, myStack);
                    System.out.println("Queue after sod1: " + myQueue);
                    System.out.println("Stack after sod1: " + myStack);

                    sod2(myQueue, myStack);
                    System.out.println("Queue after sod2: " + myQueue);
                    System.out.println("Stack after sod2: " + myStack);
                    System.out.println(myQueue.peek());
                    break;

                case "5":
                    // Example for Question 5
                    CarInfo car1 = new CarInfo("ABC123", true, 80);
                    CarInfo car2 = new CarInfo("XYZ789", false, 70);
                    CarInfo car3 = new CarInfo("LMN456", true, 90);
                    CarInfo[] cars = {car1, car2, car3};

                    CameraInfo camera1 = new CameraInfo(1, 70, cars);
                    CameraInfo camera2 = new CameraInfo(2, 100, cars);
                    CameraInfo[] cameras = {camera1, camera2};

                    System.out.println("Number of legal cities: " + legalCities(cameras));
                    break;

                case "6":
                    // Example for Question 6
                    Queue<Integer> q1 = new LinkedList<>(Arrays.asList(9, 8, 7)); // 789
                    Queue<Integer> q2 = new LinkedList<>(Arrays.asList(6, 5, 4)); // 456

                    Queue<Integer> result = longNumSum(q1, q2);
                    System.out.println("Sum of long numbers: " + result);
                    break;

                case "7":
                    // Example for Question 7 Part A and B
                    BinNode<Integer> root1 = new BinNode(1);
                    root1.setLeft(new BinNode(2));
                    root1.setRight(new BinNode(2));
                    root1.getLeft().setLeft(new BinNode(3));
                    root1.getLeft().setRight(new BinNode(4));
                    root1.getRight().setLeft(new BinNode(4));
                    root1.getRight().setRight(new BinNode(3));

                    System.out.println("Is 1-2 tree: " + isOneTwoTree(root1));
                    System.out.println("Has uniform path: " + hasUniformPath(root1));

                    root1 = new BinNode(1);

                    root1.setLeft(new BinNode(1));
                    root1.setRight(new BinNode(1));

                    root1.getLeft().setLeft(new BinNode(1));
                    root1.getLeft().setRight(new BinNode(2));

                    root1.getRight().setLeft(new BinNode(1));
                    root1.getRight().setRight(new BinNode(2));

                    root1.getLeft().getLeft().setRight(new BinNode(2));
                    root1.getRight().getLeft().setLeft(new BinNode(1));
                    root1.getRight().getLeft().setRight(new BinNode(2));
                    root1.getRight().getRight().setRight(new BinNode(1));

                    root1.getLeft().getLeft().getRight().setLeft(new BinNode(1));

                    System.out.println("Is 1-2 tree: " + isOneTwoTree(root1));
                    System.out.println("Has uniform path: " + hasUniformPath(root1));


                    root1 = new BinNode(1);

                    root1.setLeft(new BinNode(1));
                    root1.setRight(new BinNode(1));

                    root1.getLeft().setLeft(new BinNode(1));
                    root1.getLeft().setRight(new BinNode(2));

                    root1.getRight().setLeft(new BinNode(1));
                    root1.getRight().setRight(new BinNode(2));

                    root1.getLeft().getLeft().setRight(new BinNode(2));
                    root1.getRight().getLeft().setLeft(new BinNode(2));
                    root1.getRight().getLeft().setRight(new BinNode(2));
                    root1.getRight().getRight().setRight(new BinNode(1));

                    root1.getLeft().getLeft().getRight().setLeft(new BinNode(1));

                    System.out.println("Is 1-2 tree: " + isOneTwoTree(root1));
                    System.out.println("Has uniform path: " + hasUniformPath(root1));
                    break;

                case "8":
//                    B ab = new A();
//                    System.out.println(ab.Doo(44));
                    A aa = new B();
                    System.out.println(aa.Goo(3));
                    break;

                case "9":
                    // Example for Question 9
                    System.out.println("--- (1) ---");
                    First f1 = new First(10);
                    System.out.println("--- (2) ---");
                    System.out.println("sum1 = " + f1.sum());
                    System.out.println("--- (3) ---");
                    System.out.println("count = " + First.getCount());
                    System.out.println("--- (4) ---");
                    First f3 = new First(10, 20);
                    System.out.println("--- (5) ---");
                    System.out.println("count = " + f3.getCount());
                    System.out.println("--- (6) ---");
                    Second s1 = new Second(1);
                    System.out.println("--- (7) ---");
                    First f4 = new Second(2);
                    System.out.println("--- (8) ---");
                    System.out.println("count = " + f4.getCount());
                    System.out.println("--- (9) ---");
                    System.out.println("sum = " + f3.sum());
                    System.out.println("--- (10) ---");
                    System.out.println("Compilation error: cannot find symbol");
                    // f3.setNum3(2); // Compilation error: cannot find symbol
                    System.out.println("--- (11) ---");
                    System.out.println("Compilation error: cannot find symbol");
                    // f4.setNum3(2); // Compilation error: cannot find symbol
                    System.out.println("--- (12) ---");
                    s1.setNum3(2);
                    System.out.println("--- (13) ---");
                    System.out.println("sum = " + s1.sum());
                    System.out.println("--- (14) ---");
                    System.out.println("Compilation error: cannot find symbol");
                    // s1 = f3; // Compilation error: incompatible types
                    System.out.println("--- (15) ---");
                    System.out.println("Compilation error: cannot find symbol");
                    // s1 = f4; // Compilation error: incompatible types
                    System.out.println("--- (16) ---");
                    System.out.println("sum = " + s1.sum());
                    break;

                case "10":
                    IA[] allA = {new Boo(), new Foo(3), new Goo(3)};
                    IB b = new Goo(3);
                    b.B();
                    Foo f = (Foo) allA[1];
                    f = (Boo) allA[0];
                    ((Boo) f).Go();


                    IA a = new Goo(2);
//                    Goo g = new Foo(3);
                    IC c = new Goo(4);
                    c.A();
//                    IB b = new IB();
//                    Foo f = new Foo(6);
//                    ((Boo) f).Go();
                    IC[] collection = new IC[10];
                    break;

                default:
                    break;
            }
        }
    }

    // copy functions
    public static Stack<Integer> copyST(Stack<Integer> st) {
        if (st == null)
            return null;

        Stack<Integer> copy = new Stack<>();
        Stack<Integer> temp = new Stack<>();

        while (!st.isEmpty()) {
            temp.add(st.pop());
        }
        while (!temp.isEmpty()) {
            copy.add(temp.peek());
            st.push(temp.pop());
        }
        return copy;
    }
    // copy functions
    public static Queue<Integer> copyQ(Queue<Integer> q) {
        if (q == null)
            return null;

        Queue<Integer> copy = new LinkedList<>();
        q.add(-999);
        int item;
        while ((item = q.poll()) != -999) {
            copy.add(item);
            q.add(item);
        }
        return copy;
    }

    // Question 1 Help function
    public static int findMinMaxNumber(Queue<Integer> queue,boolean bool) {
        int minMaxNumber = (bool)?Integer.MAX_VALUE:Integer.MIN_VALUE;
        int currentNumber = 0;
        Queue<Integer> copy = copyQ(queue);

        while (!copy.isEmpty()) {
            int digit = copy.poll();
            if (digit == -9) {
                minMaxNumber = (bool)? Math.min(minMaxNumber, currentNumber):Math.max(minMaxNumber, currentNumber);
                currentNumber = 0;
            } else {
                currentNumber = currentNumber * 10 + digit;
            }
        }
        minMaxNumber = (bool)? Math.min(minMaxNumber, currentNumber):Math.max(minMaxNumber, currentNumber);

        return minMaxNumber;
    }
    // Question 1 Part A
    public static int findMaxNumber(Queue<Integer> queue) {
        return findMinMaxNumber(queue,false);
    }

    // Question 1 Part B
    public static void removeMinNumber(Queue<Integer> queue) {

        int minNumber = findMinMaxNumber(queue,true);
        System.out.println("Min number to remove = "+ minNumber);
        queue.add(-999);
        int currentNumber = 0;
        int item;
        while (!queue.isEmpty()) {
            item = queue.poll();
            if (item == -9 || item == -999) {
                if (currentNumber != minNumber) {
                    String sNum = String.valueOf(currentNumber);
                    for (int i = 0; i < sNum.length(); i++) {
                        queue.add(sNum.charAt(i) - '0');
                    }
                    if (item == -999)
                        break;
                    queue.add(item);

                }
                currentNumber = 0;
            } else {
                currentNumber = currentNumber * 10 + item;
            }
        }
    }

    // Question 2
    public static boolean isKEvenSkip(Node<Integer> head, int k) {
        if (head == null) return false;
        Node<Integer> current = head;
        int length = 0;
        int sum = 0;

        // Calculate length and sum of every k-th element
        while (current != null) {
            if (length % k + 1 == 0) {
                sum += current.getValue();
                if (current.getValue() % 2 != 0) return false;
            }
            length++;
            current = current.getNext();
        }

        return length % k == 0 && sum % k == 0;
    }

    // Question 3
    public static int findMaxAdjacentSum(Stack<Integer> st1, Stack<Integer> st2) {
        int maxSum = 0;
        Stack<Integer> tempStack1 = copyST(st1);
        Stack<Integer> tempStack2 = copyST(st2);

        while (!tempStack2.isEmpty()) {
            int top = tempStack2.pop();
            if (!tempStack2.isEmpty()) {
                int nextTop = tempStack2.peek();
                maxSum = Math.max(maxSum, top + nextTop);
            }
        }

        while (!tempStack1.isEmpty()) {
            int top = tempStack1.pop();
            if (!tempStack1.isEmpty()) {
                int nextTop = tempStack1.peek();
                if (maxSum < top + nextTop)
                    return top + nextTop;
            }
        }

        return 0;
    }

    // Question 4
    public static void sod1(Queue<Integer> qu, Stack<Integer> st) {
        if (!qu.isEmpty()) {
            int x = qu.remove();
            sod1(qu, st);
            st.push(x);
            qu.add(x);
        }
    }

    // Question 4
    public static void sod2(Queue<Integer> qu, Stack<Integer> st) {
        if (!qu.isEmpty()) {
            int x = qu.remove();
            sod2(qu, st);
            int y = st.pop();
            qu.add(x + y);
        }
    }

    // Question 5
    public static int legalCities(CameraInfo[] cameras) {
        boolean[] cityStatus = new boolean[100]; // Assuming city codes are from 0 to 99

        for (CameraInfo camera : cameras) {
            if (!camera.allGood()) {
                cityStatus[camera.getCity()] = true;
            }
        }

        int count = 0;
        for (boolean status : cityStatus) {
            if (!status) {
                count++;
            }
        }
        return count;
    }

    // Question 6
    public static Queue<Integer> longNumSum(Queue<Integer> q1, Queue<Integer> q2) {
        Queue<Integer> result = new LinkedList<>();
        int carry = 0;

        while (!q1.isEmpty() || !q2.isEmpty() || carry != 0) {
            int digit1 = q1.isEmpty() ? 0 : q1.poll();
            int digit2 = q2.isEmpty() ? 0 : q2.poll();
            int sum = digit1 + digit2 + carry;
            result.add(sum % 10);
            carry = sum / 10;
        }

        return result;
    }

    // Question 7A
    // O(n)
    public static boolean isOneTwoTree(BinNode<Integer> root) {
        if (root == null)
            return true;
        if (root.getValue() != 1 && root.getValue() != 2)
            return false;
        return isOneTwoTree(root.getLeft()) && isOneTwoTree(root.getRight());
    }

    // Question 7B
    // O(n)
    public static boolean hasUniformPath(BinNode<Integer> root) {
        if (root == null) return true;
        if (!isOneTwoTree(root))
            return false;
        return hasUniformPathHelper(root, root.getValue());
    }
    // Question 7B
    // O(n)
    private static boolean hasUniformPathHelper(BinNode<Integer> node, int value) {
        if (node == null) return false;
        if (node.getValue() != value)
            return false;
        if (!node.hasLeft() && !node.hasRight()) {
            return true;
        }
        return hasUniformPathHelper(node.getLeft(), value) || hasUniformPathHelper(node.getRight(), value);
    }



}

class First {
    private int num1 = 0;
    private int num2 = 0;
    private static int count = 0;

    public First(int num) {
        this(num, num);
        count++;
        System.out.println("First constructor1");
    }

    public First(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        count++;
        System.out.println("First constructor2");
    }

    public int sum() {
        return num1 + num2;
    }

    public static int getCount() {
        return count;
    }
}//end First public

class Second extends First {
    private int num3 = 0;

    public Second(int num) {
        super(num);
        num3 = num;
        System.out.println("Second constructor1");
    }

    public Second(int num1, int num2, int num3) {
        super(num1, num2);
        num3 = num3;
        System.out.println("Second constructor2");
    }

    public int sum() {
        return super.sum() + num3;
    }

    public void setNum3(int num) {
        num3 = num;
    }
}//end Second

class CarInfo {
    private String id;
    private boolean privateCar;
    private int speed;

    public CarInfo(String id, boolean privateCar, int speed) {
        this.id = id;
        this.privateCar = privateCar;
        this.speed = speed;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isPrivateCar() {
        return privateCar;
    }

    public void setPrivateCar(boolean privateCar) {
        this.privateCar = privateCar;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean illegal(int maxSpeed) {
        return privateCar || speed > maxSpeed;
    }
}

class CameraInfo {
    private int city;
    private int maxSpeed;
    private CarInfo[] cars;

    public CameraInfo(int city, int maxSpeed, CarInfo[] cars) {
        this.city = city;
        this.maxSpeed = maxSpeed;
        this.cars = cars;
    }

    public int getCity() {
        return city;
    }

    public void setCity(int city) {
        this.city = city;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public CarInfo[] getCars() {
        return cars;
    }

    public void setCars(CarInfo[] cars) {
        this.cars = cars;
    }

    public boolean allGood() {
        for (CarInfo car : cars) {
            if (car.illegal(maxSpeed)) {
                return false;
            }
        }
        return true;
    }
}

interface IA {
    void A();
}

interface IB {
    void B();
}

interface IC extends IA {
}

class Boo extends Foo implements IB {
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

class Foo implements IA {
    int num;

    public Foo(int num) {
        this.num = num;
    }

    @Override
    public void A() {

    }
}

class Goo implements IB, IC {
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
}

class A {
    public int Goo(double x) {
        return (int) x;
    }
//public int Doo(int i, double x) {return 1;}
//public int Doo(double i) {return (int) i;} // compilation
//public double Goo(int z) {return z;}
//public double Doo(double i) {return 2;}
//public void Doo(double i) { System.out.println("i = " + i);} // compilation
}

class B extends A {
    public double Doo(double i) {
        return i;
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