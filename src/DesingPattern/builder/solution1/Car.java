package DesingPattern.builder.solution1;


public class Car {
    //All of these variables are going to be private 

    Integer id;
    Integer noOfWheels;
    Integer noOfDoors;
    String engine;
    boolean isAutomatic;
    boolean bluetooth;
    String type;
    String color;
    int cost;
    String manufacturer;
    Integer buildYear;
    
    Car(CarBuilder b) {
        //validations here
        this.id = b.getId();
        this.noOfDoors = b.getNoOfDoors();
        this.noOfWheels = b.getNoOfWheels();
        //other values being set here......
        if(b.getId() == null) throw new RuntimeException("id is null");
        if(b.getNoOfWheels() == null ||  b.getNoOfWheels()< 2) throw new RuntimeException("no fo wheels is less than 2");
    }
}
