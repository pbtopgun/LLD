package DesingPattern.builder.solution2;

public class Client {
    public static void main(String[] args) throws Exception {
        //Car.CarBuilder cb = Car.getBuilder();

        //Scenario1: Get an object now
        Car c = Car.getBuilder()
        .setId(1)
        .setAutomatic(false)
        .setEngine("Turbo")
        .setNoOfWheels(4)
        .build();
        
        //cb.setAutomatic(false);
        //cb.setEngine("Turbo");
        
        //Scenario2: Get an object after calling some other methods may be part of other classes
        Car c2 = setMandatoryValues(Car.getBuilder()
        .setAutomatic(false)
        .setNoOfWheels(4)
        .setEngine("Turbo")).build();
        

        
        System.out.println("TEST ENDS");
    }
    //pass your half baked car builder to different places
    public static Car.CarBuilder setMandatoryValues(Car.CarBuilder cb){
        //set some more values;
        cb.setId(2);
        cb.setBluetooth(true);
        
        return cb;
    }
}
