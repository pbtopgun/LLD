package inheritance;

public class Instructor extends User {
    void cancelClass() {
        System.out.println("Cancelling class");
    }   

    void reschedule() {
        System.out.println("Rescheduling class");
    }

    void scheduleClass() {
        System.out.println("Scheduling class");
    }
}
