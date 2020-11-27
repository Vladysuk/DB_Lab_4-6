package ua.lviv.iot.service;

import ua.lviv.iot.DAO.StreetDAO;
import ua.lviv.iot.model.Street;

public class StreetService extends BaseService<Street, Integer, StreetDAO> {
    public StreetService() {
        super(StreetDAO.class);
    }
}
