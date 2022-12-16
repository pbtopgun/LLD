package DesingPattern.builder.problem1;

public class Car {
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
    
/** Problematic as no way of enforcing bcz of same method sign!!
    Car(int id, int nofOfwheels, boolean bluetooth) {
        //validations here   
    }

    Car(int id, String nofOfwheels, boolean isAutomatic) {
        
    }**/

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        if(id == null) throw new RuntimeException("id is null");
        this.id = id;
    }
    public Integer getNoOfWheels() {
        return noOfWheels;
    }
    public void setNoOfWheels(Integer noOfWheels) {
        if(noOfWheels < 2) throw new RuntimeException("no fo wheels is less than 2");
        this.noOfWheels = noOfWheels;
    }
    public Integer getNoOfDoors() {
        return noOfDoors;
    }
    public void setNoOfDoors(Integer noOfDoors) {
        this.noOfDoors = noOfDoors;
    }
    public String getEngine() {
        return engine;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }
    public boolean isAutomatic() {
        return isAutomatic;
    }
    public void setAutomatic(boolean isAutomatic) {
        this.isAutomatic = isAutomatic;
    }
    public boolean isBluetooth() {
        return bluetooth;
    }
    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public Integer getBuildYear() {
        return buildYear;
    }
    public void setBuildYear(Integer buildYear) {
        this.buildYear = buildYear;
    }

    

}
