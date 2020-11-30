package ua.lviv.iot.DAO;

import ua.lviv.iot.model.MeteostationData;

public class MeteostationDataDAO extends BaseDAO<MeteostationData, Integer> {
    public MeteostationDataDAO() {
        super(MeteostationData.class);
    }
}
