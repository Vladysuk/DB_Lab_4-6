package ua.lviv.iot.model;


import javax.persistence.*;

@Entity(name = "MeteostationLocation")
@Table(name = "meteostation_location")
public class MeteostationLocation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "gps_location", length = 45)
    private String gpsLocation;

    @ManyToOne
    @JoinColumn(name = "street_id", nullable = false)
    private Street street;

    public MeteostationLocation() {
    }

    public MeteostationLocation(String gpsLocation, Street street) {
        this.gpsLocation = gpsLocation;
        this.street = street;
    }

    public MeteostationLocation(Integer id, String gpsLocation, Street street) {
        this.id = id;
        this.gpsLocation = gpsLocation;
        this.street = street;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGpsLocation() {
        return gpsLocation;
    }

    public void setGpsLocation(String gpsLocation) {
        this.gpsLocation = gpsLocation;
    }

    public Street getStreet() {
        return street;
    }

    public void setStreet(Street street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "MeteostationLocation[" +
                "id=" + id +
                ", gpsLocation='" + gpsLocation + '\'' +
                ", street=" + street +
                ']';
    }
}
