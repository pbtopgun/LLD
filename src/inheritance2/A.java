package inheritance2;

public class A {
    private String privateUsername;

    A(){
        System.out.println("Creating A");
    }

    A(String s){
        System.out.println("Creating A with val");
        this.privateUsername = s;
    }

    String getter() { //
        return privateUsername;
    }
}
