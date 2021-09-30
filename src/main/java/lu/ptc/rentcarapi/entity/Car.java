package lu.ptc.rentcarapi.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "CAR")
public class Car {

    @Id
    @Column(name = "REGISTRATION_NUMBER")
   // @GenericGenerator(name="VinGenerator", strategy = "lu.ptc.rentcarapi.utils.VinGenerator")
  //  @GeneratedValue(generator ="VinGenerator")
    private String registrationNumber; // VIN

    @Column(name = "MODEL_NAME", nullable = false)
    private String modelName;

    @Column(name = "MAKE")
    private String make;

    @Column(name = "MODEL_YEAR", nullable = false)
    private int modelYear;

    @Column(name = "MILEAGE", nullable = false )
    private int mileAge;

    @Column(name = "CAR_CATEGORY_NAME", nullable = false )
//    @ManyToOne
    private String carCategoryName;

    @JoinColumn(name = "LOC_ID", nullable = false)
    @ManyToOne
    private LocationDetails locationDetails;

    @Column(name = "AVAILABILITY_FLAG", nullable = false )
    private String availabilityFlag;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return registrationNumber.equals(car.registrationNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registrationNumber);
    }
}
