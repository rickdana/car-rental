package lu.ptc.rentcarapi.controller;

import lu.ptc.rentcarapi.entity.Car;
import lu.ptc.rentcarapi.entity.LocationDetails;
import lu.ptc.rentcarapi.service.CarService;
import lu.ptc.rentcarapi.service.LocationDetailsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/v1")
@RestController
public class LocationDetailsController {

    private final LocationDetailsService locationDetailsService;

    public LocationDetailsController(LocationDetailsService locationDetailsService) {
        this.locationDetailsService = locationDetailsService;
    }

    @GetMapping("/locationDetails")
    public List<LocationDetails> getAll() {
        return this.locationDetailsService.getAll();
    }

    @GetMapping("/locationDetail/{id}")
    public LocationDetails get(@PathVariable String id) {
        return this.locationDetailsService.getById(id);
    }

    @PostMapping("/locationDetail")
    public LocationDetails createCar(@RequestBody LocationDetails locationDetails) {
        return this.locationDetailsService.save(locationDetails);
    }
}