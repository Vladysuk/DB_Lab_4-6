package ua.lviv.iot.service;

import ua.lviv.iot.DAO.WindDirectionDAO;
import ua.lviv.iot.model.WindDirection;

public class WindDirectionService extends BaseService<WindDirection, Integer, WindDirectionDAO> {
    public WindDirectionService() {
        super(WindDirectionDAO.class);
    }
}
