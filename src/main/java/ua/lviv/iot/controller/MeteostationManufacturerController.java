package ua.lviv.iot.controller;

import ua.lviv.iot.model.MeteostationManufacturer;
import ua.lviv.iot.service.MeteostationManufacturerService;

public class MeteostationManufacturerController extends BaseController<MeteostationManufacturer, Integer, MeteostationManufacturerService> {
    public MeteostationManufacturerController() {
        super(MeteostationManufacturerService.class);
    }
}
