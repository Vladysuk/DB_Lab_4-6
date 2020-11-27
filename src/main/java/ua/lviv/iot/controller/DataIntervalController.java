package ua.lviv.iot.controller;

import ua.lviv.iot.model.DataInterval;
import ua.lviv.iot.service.DataIntervalService;

public class DataIntervalController extends BaseController<DataInterval, Integer, DataIntervalService> {
    public DataIntervalController() {
        super(DataIntervalService.class);
    }
}
