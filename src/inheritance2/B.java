package inheritance2;

public class B extends A{
    B(){
        System.out.println("Creating B");
    }

    B(String s){
        super(s);
        System.out.println("Creating B with string");
    }
}
