package lu.ptc.rentcarapi.repository;

import lu.ptc.rentcarapi.TestData;
import lu.ptc.rentcarapi.entity.Car;

import static org.junit.Assert.*;

import org.junit.Before;
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
public class CarRepositoryIntegrationTest implements TestData {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private CarRepository carRepository;

    @Before
    public void setUp() throws Exception {
        entityManager.persistAndFlush(BERLINE_COMPACT);
        entityManager.persistAndFlush(SUV);
        entityManager.persistAndFlush(YUTZ);
    }

    @Test
    public void whenFindAll_thenReturnAllCars() {
        // given

        entityManager.persist(BMW_SERIE1);
        entityManager.persist(AUDI_Q5);
        entityManager.flush();

        // when
        List<Car> allCars = carRepository.findAll(Sort.by(Sort.Direction.ASC, "mileAge"));

        // then
        assertEquals(52, allCars.size());

        assertArrayEquals(allCars.toArray(), List.of(BMW_SERIE1, AUDI_Q5).toArray());
    }


    @Test
    public void whenFindByModelName_thenReturnCar() {
        // given

        entityManager.persist(BMW_SERIE1);
        entityManager.persist(AUDI_RS5);
        entityManager.persist(AUDI_TT);
        entityManager.flush();

        // when
        List<Car> found = carRepository.findByModelName("AUDI");

        // then
        boolean match = found.stream().allMatch(car -> car.getCarCategory().equals(BERLINE_COMPACT));
        assertTrue(match);
        assertEquals(List.of(AUDI_RS5, AUDI_TT), found);
    }

    @Test
    public void shouldHaveTheCategoryMapping() {
        entityManager.persist(BMW_SERIE1);
        Car car = carRepository.getById("PTC12930");
        assertEquals(BERLINE_COMPACT, car.getCarCategory());
    }

    @Test
    public void saveShouldThrowsPersistenceExceptionWhenPersistEntityWithExistingPK() {
        // given
        entityManager.persist(AUDI_RS5);

        assertThrows(PersistenceException.class, () -> entityManager.persistAndFlush(AUDI_TT));
    }

}
