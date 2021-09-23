package lu.ptc.rentcarapi.repository;

import lu.ptc.rentcarapi.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, String> {

    List<Car> findByModelName(String modelName);

    @Query("select car from CAR car where car.mileAge < :mileAge")
    List<Car> findAllCarLessThan(@Param("mileAge") int mileAge);
}
