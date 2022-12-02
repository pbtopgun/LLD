package AccessModifier.pkg1;

public class Student {    
    int age;   
    public String name;
    protected String batch;
    private double psp;

    void changeBatch(String bString){   
        this.batch = bString;
    }
    
    void incrementPSP(){
        psp = psp+1;  //this is reffering the current object!!
    }
}
