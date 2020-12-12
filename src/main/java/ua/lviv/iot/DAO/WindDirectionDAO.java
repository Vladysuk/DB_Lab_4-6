package ua.lviv.iot.DAO;

import ua.lviv.iot.model.WindDirection;

public class WindDirectionDAO extends BaseDAO<WindDirection, Integer> {
    public WindDirectionDAO() {
        super(WindDirection.class);
    }
}
