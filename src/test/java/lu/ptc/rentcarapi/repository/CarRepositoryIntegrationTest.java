package lu.ptc.rentcarapi.repository;

import lu.ptc.rentcarapi.entity.Car;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.PersistenceException;
import java.util.List;


@RunWith(SpringRunner.class)
@DataJpaTest
public class CarRepositoryIntegrationTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private CarRepository carRepository;

    @Test
    public void whenFindAll_thenReturnAllCars() {
        // given
        Car carTest = new Car("CAR123", "BMW", "Serie 1", 2020, 1000);
        Car carTest2 = new Car("CAR124", "BMW", "Serie 1", 2020, 500);

        entityManager.persist(carTest);
        entityManager.persist(carTest2);
        entityManager.flush();

        // when
        List<Car> allCars = carRepository.findAll(Sort.by(Sort.Direction.ASC, "mileAge"));

        // then
        assertEquals(2, allCars.size());

        assertArrayEquals(allCars.toArray(), List.of(carTest2, carTest).toArray());
    }


    @Test
    public void whenFindByModelName_thenReturnCar() {
        // given
        Car carTest = new Car("CAR123", "BMW", "Serie 1", 2020, 1000);
        Car audiRs5 = new Car("CAR124", "AUDI", "RS5", 2020, 10000);
        Car audiTT = new Car("CAR125", "AUDI", "TT", 2005, 250000);
        entityManager.persist(carTest);
        entityManager.persist(audiRs5);
        entityManager.persist(audiTT);
        entityManager.flush();

        // when
        List<Car> found = carRepository.findByModelName("AUDI");

        // then
        assertEquals(List.of(audiRs5, audiTT), found);

    }

    @Test
    public void saveShouldThrowsPersistenceExceptionWhenPersistEntityWithExistingPK() {
        // given
        Car audiRs5 = new Car("CAR124", "AUDI", "RS5", 2020, 10000);
        Car audiTT = new Car("CAR124", "AUDI", "TT", 2005, 250000);
        entityManager.persist(audiRs5);

        assertThrows(PersistenceException.class, () -> entityManager.persistAndFlush(audiTT));
    }

}
