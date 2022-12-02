package encapsulation;

public class Client {
    public static void main(String[] args) {
        //[TYPE] [NAME] = [value];   int i=5;
        Student st1 = new Student();
        st1.age=20;
        st1.batch="somebatch";
        st1.name="Ravi";
        st1.psp=4;

        //[TYPE] [NAME] = [value];   int i=5;
        Student st2 = new Student();
        st2.name="Ankit";
        st2.age=19;
        st2.psp=2;

        System.out.println(st1);  //encapsulation.Student@626b2d4a
        System.out.println(st2); //encapsulation.Student@5e265ba4
    }
}
