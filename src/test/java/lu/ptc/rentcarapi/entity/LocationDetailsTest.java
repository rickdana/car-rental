package lu.ptc.rentcarapi.entity;

import lu.ptc.rentcarapi.TestData;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class LocationDetailsTest implements TestData {

    @Test
    void should_create_location_details() {
        LocationDetails myLocationDetails = new LocationDetails("YUTZ","YUTZ", "Place de la republique", "Yutz", "France", 57970);
         assertNotNull(myLocationDetails);
    }

}
