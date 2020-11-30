package ua.lviv.iot.service;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;
import ua.lviv.iot.DAO.DAOTemplate;

@SuppressWarnings({ "unchecked", "deprecation" })
public abstract class BaseService<T, ID, DAO> implements ServiceTemplate<T, ID> {

    private DAOTemplate<T, ID> dataaccess;

    public BaseService(Class<DAO> currentClass) {
        try {
            dataaccess = (DAOTemplate<T, ID>) currentClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void create(T entity, Session session) throws SQLException {
        dataaccess.create(entity, session);
    }

    @Override
    public List<T> findAll(Session session) throws SQLException {
        return dataaccess.getAll(session);
    }

    @Override
    public T findBy(ID id, Session session) throws SQLException {
        return dataaccess.getBy(id, session);
    }

    @Override
    public void update(T entity, Session session) throws SQLException {
         dataaccess.update(entity, session);
    }

    @Override
    public void deleteBy(ID id, Session session) throws SQLException {
         dataaccess.deleteBy(id, session);
    }


}