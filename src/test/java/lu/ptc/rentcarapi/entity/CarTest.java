package lu.ptc.rentcarapi.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void should_create_car() {
        Car myCar = new Car("CAR123", "BMW", "Serie 1", 2020, 1000);
         assertNotNull(myCar);
    }

}
