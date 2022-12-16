package DesingPattern.builder.solution1;

public class Client {
    public static void main(String[] args) throws Exception {
        CarBuilder builder = new CarBuilder();
        builder.setId(1);
        builder.setNoOfWheels(3);
        Car c = new Car(builder); //all validations will be done!!
        System.out.println("DEBUGGING");
    }
}
