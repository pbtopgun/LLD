package AccessModifier.pkg2;

import AccessModifier.pkg1.Student;

public class StudentChild extends Student {
    int someattribute;

    void someMethodforProtected(){
        System.out.println(this.batch);  //allowed to access batch from the child class in different package!!
    }


}
