package ua.lviv.iot.model;

import javax.persistence.*;

@Entity(name = "WindDirection")
@Table(name = "wind_direction")
public class WindDirection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "direction", length = 3)
    private String direction;

    public WindDirection() {
    }

    public WindDirection(String direction) {
        this(-1, direction);
    }

    public WindDirection(Integer id, String direction) {
        this.id = id;
        this.direction = direction;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public String
    toString() {
        return "WindDirection[" +
                "id=" + id +
                ", direction='" + direction + '\'' +
                ']';
    }
}
