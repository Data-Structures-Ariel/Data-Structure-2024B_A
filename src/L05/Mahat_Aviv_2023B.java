package L05;

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
                    Square sqr1 = new Square(1);
                    Square sqr2 =new Square(1);
                    Square sqrRec = new Rectangle(1,2);
                    Rectangle rec = new Rectangle(1,2);
                    System.out.println(sqr1.equals(sqr2));
                    System.out.println(sqrRec.equals(rec));
                    System.out.println(sqrRec.equals((Square)rec));
                    System.out.println(((Rectangle)sqrRec).equals(rec));
                    System.out.println(rec.equals(sqrRec));

                    break;
                case 4:
                    break;
                case 5:
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




}


 class Square {
    protected double width;
    protected String color;
    public Square(double val){ width = val; color = "black";}
    public void paint(double scale, String color){}
    public double perimeter(double scale){ return 0; }
}

 class Rectangle extends Square {
    private double length;
    public Rectangle(double val1, double val2){
        super(val1);
        length = val2;
    }
    public boolean equals(Rectangle other){
        System.out.print("equals(Rectangle other) -> ");
        return width == other.width && length == other.length;
    }



 }
