package lu.ptc.rentcarapi.service;

import lu.ptc.rentcarapi.entity.LocationDetails;

import java.util.List;

public interface LocationDetailsService {

    List<LocationDetails> getAll();

    LocationDetails getById(String id);

    LocationDetails save(LocationDetails locationDetails);

}
