package ua.lviv.iot.DAO;

import ua.lviv.iot.model.Meteostation;

public class MeteostationDAO extends BaseDAO<Meteostation, Integer> {
    public MeteostationDAO(){
        super(Meteostation.class);
    }
}
