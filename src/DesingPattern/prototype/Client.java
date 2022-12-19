package DesingPattern.prototype;

public class Client {
    public static void main(String[] args) throws Exception {
    
        StudentResgistry studentResgistry = new StudentResgistry();
        initializeStudentRegistry(studentResgistry);


        // Multiple object can be created on Demand or in the loops
        Student copy = studentResgistry.get("Batch1").copy();
        copy.setAge(20);
        copy.setName("Ankit");

        Student intelligentStudentCopy = studentResgistry.get("IntelligentStudentBatch1").copy();
        intelligentStudentCopy.setName("Aman");
        intelligentStudentCopy.setAge(17);
        ((IntelligentStudent)intelligentStudentCopy).setIq(180);
        
    }

    private static void initializeStudentRegistry(StudentResgistry studentResgistry) {
        Student s = new Student();
        s.setBatchName("Batch1");
        s.setBatchId("Batch@751");
        s.setAge(10);
        s.setName("Vikas");
        
        studentResgistry.register("Batch1", s);

        IntelligentStudent viswa = new IntelligentStudent();
        viswa.setAge(10);
        viswa.setName("viswa");
        viswa.setBatchId("Sample batch");
        viswa.setBatchName("Sample batch Name");
        viswa.setIq(150);

        studentResgistry.register("IntelligentStudentBatch1", s);
    }
}
