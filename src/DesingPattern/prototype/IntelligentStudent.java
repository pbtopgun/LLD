package DesingPattern.prototype;

public class IntelligentStudent extends Student {

    private int iq;

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    IntelligentStudent(IntelligentStudent is){
        super(is);   //super(Student) call the copy constructor of parent's class 
        this.iq = is.iq;
    }


    public IntelligentStudent() {
    }

    @Override
    public IntelligentStudent copy() {
        return new IntelligentStudent(this);
        
        /** NOT GOING TO WORK
        Student s = super.copy();
        ((IntelligentStudent)s).setIq(this.iq); //this s is not representing the Child class.
        return ((IntelligentStudent)s);
         */
    }
}
