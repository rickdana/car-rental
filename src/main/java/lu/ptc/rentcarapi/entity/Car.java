package lu.ptc.rentcarapi.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return modelYear == car.modelYear && mileAge == car.mileAge && registrationNumber.equals(car.registrationNumber) && modelName.equals(car.modelName) && make.equals(car.make);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registrationNumber, modelName, make, modelYear, mileAge);
    }
}
