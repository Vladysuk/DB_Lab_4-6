package ua.lviv.iot.DAO;

import ua.lviv.iot.model.MeteostationLocation;

public class MeteostationLocationDAO extends BaseDAO<MeteostationLocation, Integer> {
    public MeteostationLocationDAO() {
        super(MeteostationLocation.class);
    }
}
