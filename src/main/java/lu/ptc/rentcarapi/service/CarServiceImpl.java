package lu.ptc.rentcarapi.service;

import lu.ptc.rentcarapi.entity.Car;
import lu.ptc.rentcarapi.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public List<Car> getAll() {
        return this.carRepository.findAll();
    }

    @Override
    public Car getById(String id) {return this.carRepository.getById(id);}

    @Override
    public Car save(Car car) {
        return this.carRepository.save(car);
    }
}
