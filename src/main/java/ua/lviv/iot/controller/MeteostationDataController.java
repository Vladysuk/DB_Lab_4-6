package ua.lviv.iot.controller;

import ua.lviv.iot.model.MeteostationData;
import ua.lviv.iot.service.MeteostationDataService;

public class MeteostationDataController extends BaseController<MeteostationData, Integer, MeteostationDataService> {
    public MeteostationDataController() {
        super(MeteostationDataService.class);
    }
}
