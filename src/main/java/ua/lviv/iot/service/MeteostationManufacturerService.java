package ua.lviv.iot.service;

import ua.lviv.iot.DAO.MeteostationManufacturerDAO;
import ua.lviv.iot.model.MeteostationManufacturer;

public class MeteostationManufacturerService extends BaseService<MeteostationManufacturer, Integer, MeteostationManufacturerDAO> {
    public MeteostationManufacturerService() {
        super(MeteostationManufacturerDAO.class);
    }
}
