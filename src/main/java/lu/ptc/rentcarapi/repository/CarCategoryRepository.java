package lu.ptc.rentcarapi.repository;

import lu.ptc.rentcarapi.entity.CarCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarCategoryRepository extends JpaRepository<CarCategory, String> {


}
