package lu.ptc.rentcarapi.entity;

import lu.ptc.rentcarapi.TestData;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class CarCategoryTest implements TestData {

    @Test
    void should_create_car_category() {
        CarCategory myCarCategory = new CarCategory("SUV", 350, 5, 250D, 30D);
         assertNotNull(myCarCategory);
    }

}
