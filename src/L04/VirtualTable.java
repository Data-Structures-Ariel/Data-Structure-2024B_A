package L04;

public class VirtualTable {

    public static void main(String[] args) {
        A a = new A();
        A b = new B();
        A c = new C();
        B b1 = new B();
        B c1 = new C();
        C c2 = new C();
        c.func();
        b.func();
//        ((B)a).b(); //run-time
        ((B)b).b();
        /*
        b.b();
        a.a();
        b.a();
        b.func();
        c.func();
         */

        a.func();
        b.func();
        c.func();


    }


}

class A{
    int a;
    int a1;
    void func(){
        System.out.println("Hello func from A");
    }
    void a(){ }


}
class B extends A{
    int b;
    void b(){ }
}
class C extends B{
    int c;
    void c(){ }
    void func(){ System.out.println("Hello func from C");}
}

interface Int1{ void doIt1(); }
interface Int2{ void doIt2(); }

class One implements Int1
{
    private int a;
    public One()
    {
        System.out.println("ctor One");
        this.a = 0;
    }
    public void doIt1()
    {
        System.out.println("One:DoIt1()");
        this.a += 5;
    }
    public String toString()
    {
        return "One: a=" + this.a;
    }
}
class Two extends One
{
    private int b;
    public Two()
    {
        System.out.println("ctor Two");
        this.b = 0;
    }
    public void doIt1()
    {
        System.out.println("Two: doIt1()");
        super.doIt1();
        this.b += 5;
    }
    public String toString()
    {
        return super.toString() + " Two: b=" + this.b;
    }
}
class Three extends One implements Int2
{
    private int c;
    public Three()
    {
        System.out.println("ctor1 Three");
        this.c = 0;
    }

    public void doIt1()
    {
        System.out.println("Three: doIt1()");
        super.doIt1();
        this.c += 5;
    }
    public void doIt2()
    {
        System.out.println("Three: doIt2()");
        super.doIt1();
        this.c += 10;
    }
    public String toString()
    {
        return super.toString() + " Three: c=" + this.c;
    }
}
