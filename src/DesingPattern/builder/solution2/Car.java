package DesingPattern.builder.solution2;


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
    String kindOfSteering; //Manual,Power,Electrical
    
    private Car(CarBuilder b) {
        //validations here
        this.id = b.getId();
        this.noOfDoors = b.getNoOfDoors();
        this.noOfWheels = b.getNoOfWheels();
        this.engine = b.engine;
        //other values being set here......
        if(b.getId() == null) throw new RuntimeException("id is null");
        if(b.getNoOfWheels() == null ||  b.getNoOfWheels()< 2) throw new RuntimeException("no fo wheels is less than 2");
    }

    public static CarBuilder getBuilder() {
        return new CarBuilder();
    }


    static class CarBuilder {
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
        public CarBuilder setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getNoOfWheels() {
            return noOfWheels;
        }
        public CarBuilder setNoOfWheels(Integer noOfWheels) {
            this.noOfWheels = noOfWheels;
            return this;
        }
        public Integer getNoOfDoors() {
            return noOfDoors;
        }
        public CarBuilder setNoOfDoors(Integer noOfDoors) {
            this.noOfDoors = noOfDoors;
            return this;
        }
        public String getEngine() {
            return engine;
        }
        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public boolean isAutomatic() {
            return isAutomatic;
        }
        public CarBuilder setAutomatic(boolean isAutomatic) {
            this.isAutomatic = isAutomatic;
            return this;
        }
        public boolean isBluetooth() {
            return bluetooth;
        }
        public CarBuilder setBluetooth(boolean bluetooth) {
            this.bluetooth = bluetooth;
            return this;
        }
        public String getType() {
            return type;
        }
        public CarBuilder setType(String type) {
            this.type = type;
            return this;
        }
        public String getColor() {
            return color;
        }
        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }
        public int getCost() {
            return cost;
        }
        public CarBuilder setCost(int cost) {
            this.cost = cost;
            return this;
        }
        public String getManufacturer() {
            return manufacturer;
        }
        public CarBuilder setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }
        public Integer getBuildYear() {
            return buildYear;
        }
        public CarBuilder setBuildYear(Integer buildYear) {
            this.buildYear = buildYear;
            return this;
        }
        
        public Car build(){
            //validations can also be present here!!
            return new Car(this);
        }
        
    }
    
    
}
