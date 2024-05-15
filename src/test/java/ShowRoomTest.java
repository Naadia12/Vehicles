import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ShowRoomTest {

    private ShowRoom showRoom;

    @BeforeEach
    public void setup(){
        showRoom = new ShowRoom();

    }

    @Test
    public void canAddVehicles(){
Car car = new Car("dpdp", "windsor road");

Helicopter helicopter = new Helicopter("triangle",4);
        showRoom.addVehicle(car);
        showRoom.addVehicle(helicopter);

    }

    @Test
    public void canCountVehicles(){
        int expected = 0;
        int result = showRoom.countVehicles();
        assertThat(result).isEqualTo(expected);
    }




}
