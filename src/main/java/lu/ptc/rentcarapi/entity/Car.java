package lu.ptc.rentcarapi.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Car {

    @Id
    @Column(name = "REGISTRATION_NUMBER")
    private String registrationNumber;

    @Column(name = "MODEL_NAME", nullable = false)
    private String modelName;

    @Column(name = "MAKE")
    private String make;

    @Column(name = "MODEL_YEAR", nullable = false)
    private int modelYear;

    @Column(name = "MILEAGE", nullable = false )
    private int mileAge;



}
