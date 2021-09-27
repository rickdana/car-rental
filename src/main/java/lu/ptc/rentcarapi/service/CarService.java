package lu.ptc.rentcarapi.service;

import lu.ptc.rentcarapi.entity.Car;

import java.util.List;

public interface CarService {

    List<Car> getAll();

    Car getById(String id);

    Car save(Car car);

}
