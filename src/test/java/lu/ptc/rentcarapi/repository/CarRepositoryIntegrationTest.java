package lu.ptc.rentcarapi.repository;

import lu.ptc.rentcarapi.entity.Car;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@DataJpaTest
public class CarRepositoryIntegrationTest {

    @Autowired
    private CarRepository carRepository;

    @Test
    public void whenFindByModelName_thenReturnCar() {
        // given
        Car carTest = new Car("CAR123", "BMW", "Serie 1", 2020, 1000);
        // when
        Car found = carRepository.findByModelName("BMW");
        // then
        assertEquals(carTest.getMake(), found.getMake());
    }

//    @Test
//    public void whenFindAllCarLessThan_thenReturnCar() {
//        // given
//        Car carTest = new Car("CAR123", "BMW", "Serie 1", 2020, 1000);
//        // when
//        Car found = carRepository.findAllCarLessThan(100);
//        // then
//        assertEquals(carTest.getMake(), found.getMake());
//    }
}
