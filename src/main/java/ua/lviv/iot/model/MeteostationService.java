package ua.lviv.iot.model;

import ua.lviv.iot.model.annotation.Column;
import ua.lviv.iot.model.annotation.PrimaryKey;
import ua.lviv.iot.model.annotation.Table;

import java.sql.Date;

@Table(name = "meteostation_service")
public class MeteostationService {
    @PrimaryKey
    @Column(name = "id")
    private Integer id;
    @Column(name = "service_description")
    private String serviceDescription;
    @Column(name = "service_date")
    private Date serviceDate;
    @Column(name = "is_regular")
    private Boolean isRegular;
    @Column(name = "meteostation_id")
    private Integer meteostationId;

    public MeteostationService() {
    }

    public MeteostationService(String serviceDescription, Date serviceDate, Boolean isRegular, Integer meteostationId) {
        this(-1, serviceDescription, serviceDate, isRegular, meteostationId);
    }

    public MeteostationService(Integer id, String serviceDescription, Date serviceDate, Boolean isRegular, Integer meteostationId) {
        this.id = id;
        this.serviceDescription = serviceDescription;
        this.serviceDate = serviceDate;
        this.isRegular = isRegular;
        this.meteostationId = meteostationId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public Date getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(Date serviceDate) {
        this.serviceDate = serviceDate;
    }

    public Boolean getRegular() {
        return isRegular;
    }

    public void setRegular(Boolean regular) {
        isRegular = regular;
    }

    public Integer getMeteostationId() {
        return meteostationId;
    }

    public void setMeteostationId(Integer meteostationId) {
        this.meteostationId = meteostationId;
    }

    @Override
    public String toString() {
        return "MeteostationService{" +
                "id=" + id +
                ", serviceDescription='" + serviceDescription + '\'' +
                ", serviceDate=" + serviceDate +
                ", isRegular=" + isRegular +
                ", meteostationId=" + meteostationId +
                '}';
    }
}
