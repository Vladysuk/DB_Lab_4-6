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
    @Column(name = "street_id")
    private Integer streetId;

    public ManufacturerAddress() {
    }

    public ManufacturerAddress(String buildingNumber, Integer streetId) {
        this(-1, buildingNumber, streetId);
    }

    public ManufacturerAddress(Integer id, String buildingNumber, Integer streetId) {
        this.id = id;
        this.buildingNumber = buildingNumber;
        this.streetId = streetId;
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

    public Integer getStreetId() {
        return streetId;
    }

    public void setStreetId(Integer streetId) {
        this.streetId = streetId;
    }

    @Override
    public String toString() {
        return "ManufacturerAddress[" +
                "id=" + id +
                ", buildingNumber='" + buildingNumber + '\'' +
                ", streetId=" + streetId +
                ']';
    }

}
