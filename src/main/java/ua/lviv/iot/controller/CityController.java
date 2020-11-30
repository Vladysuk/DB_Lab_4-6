package ua.lviv.iot.controller;

import ua.lviv.iot.model.City;
import ua.lviv.iot.service.CityService;

public class CityController extends BaseController<City, Integer, CityService> {
    public CityController() {
        super(CityService.class);
    }
}
