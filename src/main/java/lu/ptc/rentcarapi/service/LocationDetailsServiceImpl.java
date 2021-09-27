package lu.ptc.rentcarapi.service;

import lu.ptc.rentcarapi.entity.LocationDetails;
import lu.ptc.rentcarapi.repository.CarCategoryRepository;
import lu.ptc.rentcarapi.repository.LocationDetailsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationDetailsServiceImpl implements LocationDetailsService {

    private final LocationDetailsRepository locationDetailsRepository;

    public LocationDetailsServiceImpl(LocationDetailsRepository locationDetailsRepository) {
        this.locationDetailsRepository = locationDetailsRepository;
    }

    @Override
    public List<LocationDetails> getAll() {
        return this.locationDetailsRepository.findAll();
    }

    @Override
    public LocationDetails getById(String id) {return this.locationDetailsRepository.getById(id);}

    @Override
    public LocationDetails save(LocationDetails car) {
        return this.locationDetailsRepository.save(car);
    }
}
