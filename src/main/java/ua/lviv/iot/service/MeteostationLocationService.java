package ua.lviv.iot.service;

import ua.lviv.iot.DAO.MeteostationLocationDAO;
import ua.lviv.iot.model.MeteostationLocation;

public class MeteostationLocationService extends BaseService<MeteostationLocation, Integer, MeteostationLocationDAO> {
    public MeteostationLocationService() {
        super(MeteostationLocationDAO.class);
    }
}
