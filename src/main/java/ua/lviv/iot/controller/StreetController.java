package ua.lviv.iot.controller;

import ua.lviv.iot.model.Street;
import ua.lviv.iot.service.StreetService;

public class StreetController extends BaseController<Street, Integer, StreetService> {
    public StreetController() {
        super(StreetService.class);
    }
}
