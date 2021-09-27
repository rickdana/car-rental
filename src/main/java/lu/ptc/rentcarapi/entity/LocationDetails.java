package lu.ptc.rentcarapi.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "LOCATION_DETAILS")
public class LocationDetails {

    @Id
    @Column(name = "LOCATION_ID")
    private String locationId;

    @Column(name = "LOCATION_NAME", nullable = false)
    private String locationName;

    @Column(name = "STREET")
    private String street;

    @Column(name = "CITY", nullable = false)
    private String city;

    @Column(name = "STATE_NAME", nullable = false )
    private String stateName;

    @Column(name = "ZIPCODE", nullable = false )
    private int zipCode;



}
