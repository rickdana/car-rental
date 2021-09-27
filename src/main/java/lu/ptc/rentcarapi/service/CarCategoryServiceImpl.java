package lu.ptc.rentcarapi.service;

import lu.ptc.rentcarapi.entity.Car;
import lu.ptc.rentcarapi.entity.CarCategory;
import lu.ptc.rentcarapi.repository.CarCategoryRepository;
import lu.ptc.rentcarapi.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarCategoryServiceImpl implements CarCategoryService {

    private final CarCategoryRepository carCategoryRepository;

    public CarCategoryServiceImpl(CarCategoryRepository carCategoryRepository) {
        this.carCategoryRepository = carCategoryRepository;
    }

    @Override
    public List<CarCategory> getAll() {
        return this.carCategoryRepository.findAll();
    }

    @Override
    public CarCategory getById(String id) {return this.carCategoryRepository.getById(id);}

    @Override
    public CarCategory save(CarCategory car) {
        return this.carCategoryRepository.save(car);
    }
}
