import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HelicopterTest {

    public Helicopter helicopter;

    @BeforeEach
    public void setup(){
        helicopter = new Helicopter("triangle", 6);
    }
    @Test
    public void canGetPropellerShape(){
        assertThat(helicopter.getPropellerShape()).isEqualTo("triangle");
    }

    @Test
    public void canGetNumberOfBlades(){
        assertThat(helicopter.getNumberOfBlades()).isEqualTo(6);
    }
}

