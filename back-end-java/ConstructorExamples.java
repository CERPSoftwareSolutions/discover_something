class Base {

    int count = 1000;

    Base() {
        base();
    }

    void base() {
        System.out.println("count Inc = " + (++count));
    }

}

public class ConstructorExamples extends Base  {

    int count = 2000;

    B() {
    }

    void base() {
        System.out.println("count Dec = " + (--count));
    }

    public static void main(String[] args) {
        new Base();
    }
}