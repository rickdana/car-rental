package lu.ptc.rentcarapi.entity;

import lu.ptc.rentcarapi.TestData;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest implements TestData {

    @Test
    void should_create_car() {
        Car myCar = new Car("CAR123", "BMW", "Serie 1", 2020, 1000,BERLINE_COMPACT,YUTZ,"A");
         assertNotNull(myCar);
    }

}
