public abstract class Vehicle {

    private int numberOfWheels;
    private String model;
    private int numberOfDoors;
    private int numberOfWindows;

    //Constructor
    public Vehicle(int inputNumberOfWheels, String model, int numberOfDoors, int numberOfWindows) {
            this.numberOfWheels= inputNumberOfWheels;
            this.model = model;
            this.numberOfDoors = numberOfDoors;
            this.numberOfWindows = numberOfWindows;
    }

    //setters and getters
    public int getNumberOfWheels() {
        return this.numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getModel(){
        return this.model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public int getNumberOfDoors() {
        return this.numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors){
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfWindows(){
            return this.numberOfWindows;
    }
}
