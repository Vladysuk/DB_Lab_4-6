package ua.lviv.iot.controller;

import ua.lviv.iot.model.MeteostationLocation;
import ua.lviv.iot.service.MeteostationLocationService;

public class MeteostationLocationController extends BaseController<MeteostationLocation, Integer, MeteostationLocationService> {
    public MeteostationLocationController() {
        super(MeteostationLocationService.class);
    }
}
