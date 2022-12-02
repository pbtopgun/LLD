package Polymorphism;

public class B extends A{

    void hello() {
        System.out.println("hello from B");
    }

    void hello(String s){
        System.out.println("hello from B " + s);
    }
}
