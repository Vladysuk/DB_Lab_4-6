package ua.lviv.iot.service;

import ua.lviv.iot.DAO.MeteostationServiceDAO;
import ua.lviv.iot.model.MeteostationService;

public class MeteostationServiceService extends BaseService<MeteostationService, Integer, MeteostationServiceDAO> {
    public MeteostationServiceService() {
        super(MeteostationServiceDAO.class);
    }
}
