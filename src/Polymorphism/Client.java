package Polymorphism;

public class Client {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        System.out.println("Compile time");
        A a = new A();
        a.hello();
        a.hello("Ankit");

        System.out.println("Run time");

        A aRuntime = new B();
        aRuntime.hello();  //Method of actuall object is being called!!
        aRuntime.hello("Ankit"); //Method of actuall object is being called!!

        //C->B->A

        A objForC = new C();
        objForC.hello();  //Method of actuall object is being called!!
        objForC.hello("Ankit");  // At run time nearest(//C->B->A in parent's heirarchy) real time object implementation will be choosen


        A c = new B();
        
        ((A)c).hello();


    }
    
}
