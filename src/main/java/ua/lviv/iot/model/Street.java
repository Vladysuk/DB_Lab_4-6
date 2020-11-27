package ua.lviv.iot.model;

import ua.lviv.iot.model.annotation.Column;
import ua.lviv.iot.model.annotation.PrimaryKey;
import ua.lviv.iot.model.annotation.Table;

@Table(name = "street")
public class Street {
    @PrimaryKey
    @Column(name = "id")
    private Integer id;
    @Column(name = "street_name", length = 45)
    private String streetName;
    @Column(name = "city_id")
    private Integer cityId;

    public Street() {}

    public Street(String streetName, Integer cityId) {
        this(-1, streetName, cityId);
    }

    public Street(Integer id, String streetName, Integer cityId) {
        this.id = id;
        this.streetName = streetName;
        this.cityId = cityId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    @Override
    public String toString() {
        return "Street{" +
                "id=" + id +
                ", streetName='" + streetName + '\'' +
                ", cityId=" + cityId +
                '}';
    }
}
