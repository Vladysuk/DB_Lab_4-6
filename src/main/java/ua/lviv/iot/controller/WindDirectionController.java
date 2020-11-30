package ua.lviv.iot.controller;

import ua.lviv.iot.model.WindDirection;
import ua.lviv.iot.service.WindDirectionService;

public class WindDirectionController extends BaseController<WindDirection, Integer, WindDirectionService> {
    public WindDirectionController() {
        super(WindDirectionService.class);
    }
}
