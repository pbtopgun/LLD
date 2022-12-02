package inheritance2;

public class C extends B {
    C(){
        System.out.println("Creating C");
    }

    C(String s){
        super(s);
        System.out.println("Creating C with string");
    }
}
