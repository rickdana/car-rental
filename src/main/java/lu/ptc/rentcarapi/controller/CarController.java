package lu.ptc.rentcarapi.controller;

import lu.ptc.rentcarapi.entity.Car;
import lu.ptc.rentcarapi.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/v1")
@RestController
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public List<Car> getAll() {
        return this.carService.getAll();
    }

    @GetMapping("/cars/{id}")
    public Car get(@PathVariable String id)  {
        return this.carService.getById(id);
    }

    @PostMapping("/cars")
    public Car createCar(@RequestBody Car car) {
        return this.carService.save(car);
    }

}
