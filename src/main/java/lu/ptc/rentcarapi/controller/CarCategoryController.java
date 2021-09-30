package lu.ptc.rentcarapi.controller;

import lu.ptc.rentcarapi.entity.CarCategory;
import lu.ptc.rentcarapi.service.CarCategoryService;
import org.springframework.web.bind.annotation.*;

import java.lang.ref.Reference;
import java.util.List;

@RequestMapping(value = "/v1")
@RestController
public class CarCategoryController {

    private final CarCategoryService carCategoryService;

    public CarCategoryController(CarCategoryService carCategoryService) {
        this.carCategoryService = carCategoryService;
    }

    @GetMapping("/carCategorys")
    public List<CarCategory> getAll() {
        return this.carCategoryService.getAll();
    }

    @GetMapping("/carCategory/{id}")
    public CarCategory get(@PathVariable String id)  {
        return this.carCategoryService.getById(id);
    }

    @PostMapping("/carCategory")
    public CarCategory createCar(@RequestBody CarCategory carCategory) {
        return this.carCategoryService.save(carCategory);
    }
}
