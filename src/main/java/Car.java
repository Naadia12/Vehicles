public class Car extends Vehicle {

    private String numberPlate;
    private String pickUpLocation;

    //Constructor
    public Car (String numberPlate,String pickUpLocation){
       super(4, "Nissan", 3, 5);

        this.numberPlate = numberPlate;
        this.pickUpLocation = pickUpLocation;

    }
    //setters and getters
    public String getNumberPlate(){
        return this.numberPlate;
    }
    public String getPickUpLocation(){
        return this.pickUpLocation;
    }
    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }
    public void setPickUpLocation(String pickUpLocation){
        this.pickUpLocation = pickUpLocation;
    }
}
