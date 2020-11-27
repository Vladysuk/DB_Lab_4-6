package ua.lviv.iot.service;

import ua.lviv.iot.DAO.MeteostationDataDAO;
import ua.lviv.iot.model.MeteostationData;

public class MeteostationDataService extends BaseService<MeteostationData, Integer, MeteostationDataDAO> {
    public MeteostationDataService() {
        super(MeteostationDataDAO.class);
    }
}
