package inheritance;

public class Client {
    public static void main(String args[]) {
        System.out.println("STUDENT");

        //[TYPE] [NAME] = [values]
        User st = new Student();  //valid!!
        
        //Student st = new User(); //Error, EVERY USER is not a Student!!
        //Dog m = new Mammal(); //doesn't hold!!
        //Mammal m = new Dog();  //Holds true
        st.userName = "Ankit";  //coming from parent proprties!!
        //st.psp = 5.0; though st is a student but is contained by a User class hence psp is not visible!!
        st.displayId="ANKIT";
        st.login();
        //st.pauseCourse();
        
        System.out.println("INSTRUCTOR");

        Instructor inst = new Instructor();
        //inst.psp psp is only for Student(specialization)
        inst.userName = "Abhishek";
        inst.displayId ="AB";
        inst.login();

        inst.cancelClass();
        inst.scheduleClass();
    }
}
