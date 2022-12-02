package Polymorphism;

public class A {
    void hello(){
        System.out.println("hello from A");
    }
    /** return type is not part of the method signature!!
    String hello(){ 
        System.out.println("Hey folks");
    }
    **/

    void hello(String s){
        System.out.println("hello from A " + s);
    }
}
