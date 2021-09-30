package lu.ptc.rentcarapi.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Objects;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "CAR_CATEG")
public class CarCategory {

    @Id
    @Column(name = "CATEGORY_NAME")
    private String categoryName;

    @Column(name = "NO_OF_LUGGAGE", nullable = false)
    private int noOfLuggage;

    @Column(name = "NO_OF_PERSON")
    private int noOfPerson;

    @Column(name = "COST_PER_DAY", nullable = false)
    private Double costPerDay;

    @Column(name = "LATE_FEE_PER_HOUR", nullable = false )
    private Double lateFeePerHour;

    @OneToMany(mappedBy = "carCategory")
    private Set<Car> cars;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarCategory that = (CarCategory) o;
        return categoryName.equals(that.categoryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryName);
    }
}
