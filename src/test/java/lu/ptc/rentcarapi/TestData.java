package lu.ptc.rentcarapi;

import lu.ptc.rentcarapi.entity.Car;
import lu.ptc.rentcarapi.entity.CarCategory;
import lu.ptc.rentcarapi.entity.LocationDetails;

import java.util.Collections;

public interface TestData {
    CarCategory BERLINE_COMPACT = new CarCategory("BERLINE_COMPACT", 250, 5, 150D, 30D);
    CarCategory SUV = new CarCategory("SUV", 350, 5, 250D, 30D);


    LocationDetails YUTZ = new LocationDetails("YUTZ","YUTZ", "Place de la republique", "Yutz", "France", 57970);

    Car BMW_SERIE1 = new Car("PTC12930", "BMW", "Serie 1", 2020, 1000,BERLINE_COMPACT,YUTZ,"A");
    Car AUDI_Q5 = new Car("PTC12409", "AUDI", "Q5", 2020, 500,SUV,YUTZ,"A");
    Car AUDI_RS5 = new Car("PTC12432", "AUDI", "RS5", 2020, 10000,BERLINE_COMPACT,YUTZ,"A");
    Car AUDI_TT = new Car("PTC12514", "AUDI", "TT", 2005, 250000,BERLINE_COMPACT,YUTZ,"A");
}
