package ua.lviv.iot.controller;

import ua.lviv.iot.model.Meteostation;
import ua.lviv.iot.service.MeteostationService;

public class MeteostationController extends BaseController<Meteostation, Integer, MeteostationService> {
    public MeteostationController(){
        super(MeteostationService.class);
    }
}
