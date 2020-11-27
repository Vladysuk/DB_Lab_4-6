package ua.lviv.iot.controller;

import ua.lviv.iot.model.MeteostationService;
import ua.lviv.iot.service.MeteostationServiceService;

public class MeteostationServiceController extends BaseController<MeteostationService, Integer, MeteostationServiceService> {
    public MeteostationServiceController() {
        super(MeteostationServiceService.class);
    }
}
