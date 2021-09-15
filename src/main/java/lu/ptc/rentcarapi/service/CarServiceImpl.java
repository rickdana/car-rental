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
}
