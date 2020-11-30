package ua.lviv.iot.model;


import javax.persistence.*;
import java.sql.Date;

@Entity(name = "Meteostation")
@Table(name = "meteostation")
public class Meteostation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "meteostation_code", length = 10)
    private String meteostationCode;
    @Column(name = "installation_date")
    private Date installationDate;
    @Column(name = "meteostation_location_id")
    private Integer meteostationLocationId;
    @Column(name = "meteostation_manufacturer_id")
    private Integer meteostationManufacturerId;
    @Column(name = "data_interval_id")
    private Integer dataIntervalId;

    public Meteostation() {
    }

    public Meteostation(String meteostationCode, Date installationDate, Integer meteostationLocationId, Integer meteostationManufacturerId, Integer dataIntervalId) {
        this(-1, meteostationCode, installationDate, meteostationLocationId, meteostationManufacturerId, dataIntervalId);
    }

    public Meteostation(Integer id, String meteostationCode, Date installationDate, Integer meteostationLocationId,
                        Integer meteostationManufacturerId, Integer dataIntervalId) {
        this.id = id;
        this.meteostationCode = meteostationCode;
        this.installationDate = installationDate;
        this.meteostationLocationId = meteostationLocationId;
        this.meteostationManufacturerId = meteostationManufacturerId;
        this.dataIntervalId = dataIntervalId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMeteostationCode() {
        return meteostationCode;
    }

    public void setMeteostationCode(String meteostationCode) {
        this.meteostationCode = meteostationCode;
    }

    public Date getInstallationDate() {
        return installationDate;
    }

    public void setInstallationDate(Date installationDate) {
        this.installationDate = installationDate;
    }

    public Integer getMeteostationLocationId() {
        return meteostationLocationId;
    }

    public void setMeteostationLocationId(Integer meteostationLocationId) {
        this.meteostationLocationId = meteostationLocationId;
    }

    public Integer getMeteostationManufacturerId() {
        return meteostationManufacturerId;
    }

    public void setMeteostationManufacturerId(Integer meteostationManufacturerId) {
        this.meteostationManufacturerId = meteostationManufacturerId;
    }

    public Integer getDataIntervalId() {
        return dataIntervalId;
    }

    public void setDataIntervalId(Integer dataIntervalId) {
        this.dataIntervalId = dataIntervalId;
    }

    @Override
    public String toString() {
        return "Meteostation[" +
                "id=" + id +
                ", meteostationCode='" + meteostationCode + '\'' +
                ", installationDate=" + installationDate +
                ", meteostationLocationId=" + meteostationLocationId +
                ", meteostationManufacturerId=" + meteostationManufacturerId +
                ", dataIntervalId=" + dataIntervalId +
                ']';
    }
}
