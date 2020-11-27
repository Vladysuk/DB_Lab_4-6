package ua.lviv.iot.DAO;

import ua.lviv.iot.model.Street;

public class StreetDAO extends BaseDAO<Street, Integer> {
    public StreetDAO() {
        super(Street.class);
    }
}
