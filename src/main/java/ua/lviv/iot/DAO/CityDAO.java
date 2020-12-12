package ua.lviv.iot.DAO;

import ua.lviv.iot.model.City;

public class CityDAO extends BaseDAO<City, Integer> {
    public CityDAO() {
        super(City.class);
    }
}
