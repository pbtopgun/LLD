package constructors;

public class Client {
    public static void main(String[] args) throws Exception {
        //Student s1 = new Student(); //default constructor
        //System.out.println(s1);

        //Student s2 = new Student(); //by using the our own defination of constructor we have created!! NON parameterized!!

        Student s3 = new Student(5,"Ankit");
        Student s4 = new Student(5,"Raj","batch",2.0);

        Student copy = new Student(s3);

        System.out.println("s3"+s3);
        System.out.println("copy"+copy);


        System.out.println("FOR DEBUGGING");
    }

}
