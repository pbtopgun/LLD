package inheritance2;

public class Client {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //D d = new D();
        //System.out.println("Hello, World!");
        D d1 = new D("Ankit");
        System.out.println("Printing username"+ d1.getter());  
        //D->C->B->A(username)
    }
}
