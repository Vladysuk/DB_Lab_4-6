package ua.lviv.iot.model;

import javax.persistence.*;

@Entity(name = "MeteostationData")
@Table(name = "meteostation_data")
public class MeteostationData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "temperature")
    private Float temperature;
    @Column(name = "humidity")
    private Float humidity;
    @Column(name = "wind_speed")
    private Float windSpeed;
    @Column(name = "atmospheric_pressure")
    private Float atmosphericPressure;
    @Column(name = "wind_direction_id")
    private Integer windDirectionId;
    @Column(name = "meteostaion_id")
    private Integer meteostationId;

    public MeteostationData() {
    }

    public MeteostationData(Float temperature, Float humidity, Float windSpeed, Float atmosphericPressure, Integer windDirectionId, Integer meteostationId) {
        this(-1, temperature, humidity, windSpeed, atmosphericPressure, windDirectionId, meteostationId);
    }

    public MeteostationData(Integer id, Float temperature, Float humidity, Float windSpeed, Float atmosphericPressure,
                            Integer windDirectionId, Integer meteostationId) {
        this.id = id;
        this.temperature = temperature;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
        this.atmosphericPressure = atmosphericPressure;
        this.windDirectionId = windDirectionId;
        this.meteostationId = meteostationId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getTemperature() {
        return temperature;
    }

    public void setTemperature(Float temperature) {
        this.temperature = temperature;
    }

    public Float getHumidity() {
        return humidity;
    }

    public void setHumidity(Float humidity) {
        this.humidity = humidity;
    }

    public Float getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Float windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Float getAtmosphericPressure() {
        return atmosphericPressure;
    }

    public void setAtmosphericPressure(Float atmosphericPressure) {
        this.atmosphericPressure = atmosphericPressure;
    }

    public Integer getWindDirectionId() {
        return windDirectionId;
    }

    public void setWindDirectionId(Integer windDirectionId) {
        this.windDirectionId = windDirectionId;
    }

    public Integer getMeteostationId() {
        return meteostationId;
    }

    public void setMeteostationId(Integer meteostationId) {
        this.meteostationId = meteostationId;
    }

    @Override
    public String toString() {
        return "MeteostationData[" +
                "id=" + id +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                ", windSpeed=" + windSpeed +
                ", atmosphericPressure=" + atmosphericPressure +
                ", wind_directionId=" + windDirectionId +
                ", meteostationId=" + meteostationId +
                ']';
    }
}
