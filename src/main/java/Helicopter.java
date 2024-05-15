public class Helicopter  extends Vehicle{

    private String propellerShape;
    private int numberOfBlades;

    //Constructor

    public Helicopter(String propellerShape, int numberOfBlades)
    {
super(10, "gtop", 8, 15 );

        this.propellerShape = propellerShape;

        this.numberOfBlades= numberOfBlades;


    }
    //setters and getters
public String getPropellerShape(){
        return this.propellerShape;
}
public int getNumberOfBlades(){
        return this.numberOfBlades;
}
}
