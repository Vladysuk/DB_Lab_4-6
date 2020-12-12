package ua.lviv.iot.service;

import ua.lviv.iot.DAO.DataIntervalDAO;
import ua.lviv.iot.model.DataInterval;

public class DataIntervalService extends BaseService<DataInterval, Integer, DataIntervalDAO> {
    public DataIntervalService() {
        super(DataIntervalDAO.class);
    }
}
