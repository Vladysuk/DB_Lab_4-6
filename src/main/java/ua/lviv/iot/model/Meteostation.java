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

    @OneToOne
    @JoinColumn(name = "meteostation_location_id")
    private MeteostationLocation meteostationLocation;

    @ManyToOne
    @JoinColumn(name = "meteostation_manufacturer_id")
    private MeteostationManufacturer meteostationManufacturer;

    @ManyToOne
    @JoinColumn(name = "data_interval_id")
    private DataInterval dataInterval;

    public Meteostation() {
    }

    public Meteostation(String meteostationCode, Date installationDate, MeteostationLocation meteostationLocation,
                        MeteostationManufacturer meteostationManufacturer, DataInterval dataInterval) {
        this.meteostationCode = meteostationCode;
        this.installationDate = installationDate;
        this.meteostationLocation = meteostationLocation;
        this.meteostationManufacturer = meteostationManufacturer;
        this.dataInterval = dataInterval;
    }

    public Meteostation(Integer id, String meteostationCode, Date installationDate, MeteostationLocation meteostationLocation,
                        MeteostationManufacturer meteostationManufacturer, DataInterval dataInterval) {
        this.id = id;
        this.meteostationCode = meteostationCode;
        this.installationDate = installationDate;
        this.meteostationLocation = meteostationLocation;
        this.meteostationManufacturer = meteostationManufacturer;
        this.dataInterval = dataInterval;
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

    public MeteostationLocation getMeteostationLocation() {
        return meteostationLocation;
    }

    public void setMeteostationLocation(MeteostationLocation meteostationLocation) {
        this.meteostationLocation = meteostationLocation;
    }

    public MeteostationManufacturer getMeteostationManufacturer() {
        return meteostationManufacturer;
    }

    public void setMeteostationManufacturer(MeteostationManufacturer meteostationManufacturer) {
        this.meteostationManufacturer = meteostationManufacturer;
    }

    public DataInterval getDataInterval() {
        return dataInterval;
    }

    public void setDataInterval(DataInterval dataInterval) {
        this.dataInterval = dataInterval;
    }

    @Override
    public String toString() {
        return "Meteostation[" +
                "id=" + id +
                ", meteostationCode='" + meteostationCode + '\'' +
                ", installationDate=" + installationDate +
                ", meteostationLocation=" + meteostationLocation +
                ", meteostationManufacturer=" + meteostationManufacturer +
                ", dataInterval=" + dataInterval +
                ']';
    }
}
