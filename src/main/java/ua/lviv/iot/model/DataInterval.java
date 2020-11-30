package ua.lviv.iot.model;


import javax.persistence.*;

@Entity(name = "DataInterval")
@Table(name = "data_interval")
public class DataInterval {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "hours")
    private Integer hours;
    @Column(name = "minutes")
    private Integer minutes;
    @Column(name = "seconds")
    private Integer seconds;

    public DataInterval() {
    }

    public DataInterval(Integer hours, Integer minutes, Integer seconds) {
        this(-1, hours, minutes, seconds);
    }

    public DataInterval(Integer id, Integer hours, Integer minutes, Integer seconds) {
        this.id = id;
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    public Integer getSeconds() {
        return seconds;
    }

    public void setSeconds(Integer seconds) {
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return "DataInterval[" +
                "id=" + id +
                ", hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                ']';
    }

}
