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
    @Column(name = "street_id")
    private Integer streetId;

    public MeteostationLocation() {
    }

    public MeteostationLocation(String gpsLocation, Integer streetId) {
        this(-1, gpsLocation, streetId);
    }

    public MeteostationLocation(Integer id, String gpsLocation, Integer streetId) {
        this.id = id;
        this.gpsLocation = gpsLocation;
        this.streetId = streetId;
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

    public Integer getStreetId() {
        return streetId;
    }

    public void setStreetId(Integer streetId) {
        this.streetId = streetId;
    }

    @Override
    public String toString() {
        return "MeteostationLocation[" +
                "id=" + id +
                ", gpsLocation='" + gpsLocation + '\'' +
                ", streetId=" + streetId +
                ']';
    }
}
