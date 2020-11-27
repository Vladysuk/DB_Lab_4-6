package ua.lviv.iot.controller;

import ua.lviv.iot.model.ManufacturerAddress;
import ua.lviv.iot.service.ManufacturerAddressService;

public class ManufacturerAddressController extends BaseController<ManufacturerAddress, Integer, ManufacturerAddressService> {
    public ManufacturerAddressController() {
        super(ManufacturerAddressService.class);
    }
}
