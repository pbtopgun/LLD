package DesingPattern.builder.problem1;

public class Client {
    public static void main(String[] args) throws Exception {
        Car c = new Car(1,2,false);
        //Able to build a car!!
        c.setBluetooth(false);
        c.setAutomatic(false);
        c.setBuildYear(2012);
        
        System.out.println("DEBUGGING");
    }
}
