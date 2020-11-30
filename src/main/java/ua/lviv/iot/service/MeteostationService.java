package ua.lviv.iot.service;

import ua.lviv.iot.DAO.MeteostationDAO;
import ua.lviv.iot.model.Meteostation;

public class MeteostationService extends BaseService<Meteostation, Integer, MeteostationDAO> {
    public MeteostationService(){
        super(MeteostationDAO.class);
    }
}
