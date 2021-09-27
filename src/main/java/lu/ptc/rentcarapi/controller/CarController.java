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

    @GetMapping("/car/{id}")
    public Car get(@PathVariable String id)  {
        return this.carService.getById(id);
    }

    @PostMapping("/car")
    public Car createCar(@RequestBody Car car) {
        return this.carService.save(car);
    }

    @PostMapping("/cartest")
    public Car createCar() {
        return this.carService.save(new Car("ABX1234","CIVIC","HONDA",
                2014,10000,"ECONOMY","L101","A"));
    }
}
