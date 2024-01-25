class A {

    int count = 1000;

    A() {
        base();
    }

    void base() {
        System.out.println("count Inc = " + (++count));
    }

}

public class B extends A {

    int count = 2000;

    B() {
    }

    void base() {
        System.out.println("count Dec = " + (--count));
    }

    public static void main(String[] args) {
        new B();
    }
}
