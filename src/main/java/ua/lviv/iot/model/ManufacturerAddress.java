package ua.lviv.iot.model;


import javax.persistence.*;
import java.util.Objects;

@Entity(name = "ManufacturerAddress")
@Table(name = "manufacturer_address")
public class ManufacturerAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "building_number", length = 20)
    private  String buildingNumber;

    @ManyToOne
    @JoinColumn(name = "street_id")
    private Street street;

    public ManufacturerAddress() {
    }

    public ManufacturerAddress(String buildingNumber, Street street) {
        this.buildingNumber = buildingNumber;
        this.street = street;
    }
    public ManufacturerAddress(Integer id, String buildingNumber, Street street) {
        this.id = id;
        this.buildingNumber = buildingNumber;
        this.street = street;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public Street getStreet() {
        return street;
    }

    public void setStreet(Street street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "ManufacturerAddress[" +
                "id=" + id +
                ", buildingNumber='" + buildingNumber + '\'' +
                ", street=" + street +
                ']';
    }
}
