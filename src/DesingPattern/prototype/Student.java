package DesingPattern.prototype;

public class Student implements Protoype<Student>{

    private String name;
    private Integer age;
    private String batchId;
    private String batchName;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getBatchId() {
        return batchId;
    }
    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }
    public String getBatchName() {
        return batchName;
    }
    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    Student(Student s) {
        this.age = s.age;
        this.batchId = s.batchId;
        this.batchName = s.batchName;
        this.name = s.name;
    }


    public Student() {
    }
    
    public Student copy(){
        return new Student(this);
    }
}
