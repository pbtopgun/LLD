package inheritance2;

import java.util.Stack;

public class D extends C{
    D(){
        System.out.println("Creating D");
    }

    D(String s){
        super(s);
        System.out.println("Creating D");
    }

    String returnTheVALUE(){
        return getter(); //private value exposed by getter()!!
    }

}
