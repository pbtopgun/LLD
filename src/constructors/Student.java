package constructors;

import org.w3c.dom.NameList;

public class Student{    
    int age = 15;   
    String name;
    String batch;
    private double psp;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Student(int age, String name,String batch,double pspValue) {
        this.age = age;
        this.name = name;
        this.batch = batch;
        this.psp = pspValue;
    }

    public Student(Student ref) {
        this.age = ref.age;
        this.name = ref.name;
        this.batch = ref.batch;
        this.psp = ref.psp; //private of ref still accesbile as within the class
    }

    void changeBatch(String bString){   ///[RETURN TYPE] [NAME OF THE METHOD](<Parameters>)
        this.batch = bString;
    }

    //Student() {
      //  this.age=15;
    //}
}
