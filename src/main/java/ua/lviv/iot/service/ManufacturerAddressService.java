package ua.lviv.iot.service;

import ua.lviv.iot.DAO.ManufacturerAddressDAO;
import ua.lviv.iot.model.ManufacturerAddress;

public class ManufacturerAddressService extends BaseService<ManufacturerAddress, Integer, ManufacturerAddressDAO> {
    public ManufacturerAddressService() {
        super(ManufacturerAddressDAO.class);
    }
}
