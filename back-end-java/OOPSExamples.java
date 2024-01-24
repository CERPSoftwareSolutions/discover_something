// package inhrite;

/*
abstract class A {

    static{
        System.out.println("1");
    }

    A(String name){
        super();
        System.out.println("2");
    }

    {
        System.out.println("3");
    }
}

public class B extends A{

    {
        System.out.println("4");
    }

    B(String name){
        super(name);
        System.out.println("5");
    }

    public static void main(String[] args) {
        new B("B");  // 12345 // 13245
    }
}*/


class A{

    static int count = 1000;

    A(){
       System.out.println("Before calling Method! class A");
       base("Super Class Con Calling.");
    }

    void base(String ref){
        System.out.println("count Inc = "+ ++count +" : Ref "+ref);
    }

}

public class B extends A{

    static int count = 2000;

    B(){
        System.out.println("Before calling Method! class B");
        base("Sub Class Con Calling.");
    }

    void base(String ref){
        System.out.println("count Dec = "+ --count +" : Ref "+ref);
    }

    public static void main(String[] args) {
       A a = new B();
       a.base("Main Method Calling.");
      // System.out.println("count : "+a.count);
    }

}
