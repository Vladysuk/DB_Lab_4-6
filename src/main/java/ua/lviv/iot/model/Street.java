package ua.lviv.iot.model;

import javax.persistence.*;

@Entity(name = "Street")
@Table(name = "street")
public class Street {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "street_name", length = 45)
    private String streetName;

    @ManyToOne
    @JoinColumn(name = "city_id", nullable = false)
    private City city;

    public Street() {}

    public Street(String streetName, City city) {
        this.streetName = streetName;
        this.city = city;
    }

    public Street(Integer id, String streetName, City city) {
        this.id = id;
        this.streetName = streetName;
        this.city = city;
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

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Street[" +
                "id=" + id +
                ", streetName='" + streetName + '\'' +
                ", city=" + city +
                ']';
    }
}
