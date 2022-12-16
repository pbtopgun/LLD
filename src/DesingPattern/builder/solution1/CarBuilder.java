package DesingPattern.builder.solution1;

public class CarBuilder {
    //all of them private
    private Integer id;
    private Integer noOfWheels;
    Integer noOfDoors;
    String engine;
    boolean isAutomatic;
    boolean bluetooth;
    String type;
    String color;
    int cost;
    String manufacturer;
    Integer buildYear;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getNoOfWheels() {
        return noOfWheels;
    }
    public void setNoOfWheels(Integer noOfWheels) {
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
