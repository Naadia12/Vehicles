import java.util.ArrayList;

public class ShowRoom {

    private ArrayList<Vehicle> vehicles;

    //constructor

    public ShowRoom(){
        this.vehicles = new ArrayList<>();
    }

    //methods

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    public int countVehicles(){
    return this.vehicles.size();

}
}
