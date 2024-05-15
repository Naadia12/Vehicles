import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {

    public Car car;

    @BeforeEach
    public void set(){
        car = new Car ("dpdpd", "Windsor rd");

    }

    @Test
    public void canGetNumberPlate(){
        assertThat(car.getNumberPlate()).isEqualTo("dpdpd");
    }

    @Test
    public void canGetPickupLocation(){
        assertThat(car.getNumberPlate()).isEqualTo("Windsor rd");
    }
    @Test
    public void canGetNumberOfWheels() {
        assertThat(car.getNumberOfWheels()).isEqualTo(4);

    }
    @Test
    public void canGetModel() {
        assertThat(car.getModel()).isEqualTo("Nissan");
    }

    @Test
    public void canGetNumberOfDoors() {
        assertThat(car.getNumberOfDoors()).isEqualTo(4);
    }
    @Test
    public void canGetNumberOfWindows() {
        assertThat(car.getNumberOfWindows()).isEqualTo(5);
    }


}
