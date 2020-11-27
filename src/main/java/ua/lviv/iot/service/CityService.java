package ua.lviv.iot.service;

import ua.lviv.iot.DAO.CityDAO;
import ua.lviv.iot.model.City;

public class CityService extends BaseService<City, Integer, CityDAO> {
    public CityService() {
        super(CityDAO.class);
    }
}
