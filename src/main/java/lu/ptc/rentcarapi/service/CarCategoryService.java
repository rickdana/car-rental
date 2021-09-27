package lu.ptc.rentcarapi.service;

import lu.ptc.rentcarapi.entity.Car;
import lu.ptc.rentcarapi.entity.CarCategory;

import java.util.List;

public interface CarCategoryService {

    List<CarCategory> getAll();

    CarCategory getById(String id);

    CarCategory save(CarCategory car);

}
