package lu.ptc.rentcarapi.repository;

import lu.ptc.rentcarapi.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CarRepository extends JpaRepository<Car, String> {

    Car findByModelName(String modelName);

    @Query("select car from Car car where car.mileAge < :mileAge")
    Car findAllCarLessThan(@Param("mileAge") int mileAge);
}
