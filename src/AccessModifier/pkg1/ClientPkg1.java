package AccessModifier.pkg1;

public class ClientPkg1 {

    public static void main(String args[]) {

        //defaults!!
        Student st1 = new Student();
        st1.age=4;
        st1.name="Ankit";
        //st1.psp=5;  //private hence not visible
        st1.batch="batch1";
    } 

    
}
