package ua.lviv.iot.model;

import ua.lviv.iot.model.annotation.Column;
import ua.lviv.iot.model.annotation.PrimaryKey;
import ua.lviv.iot.model.annotation.Table;

@Table(name = "wind_direction")
// TODO: mb u should use enum
public class WindDirection {
    @PrimaryKey
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
        return "WindDirection{" +
                "id=" + id +
                ", direction='" + direction + '\'' +
                '}';
    }
}
