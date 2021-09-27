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

 }
