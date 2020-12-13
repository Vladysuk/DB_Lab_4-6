package ua.lviv.iot.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public abstract class BaseService<T, ID> implements ServiceTemplate<T, ID> {

    @Override
    public abstract JpaRepository<T, ID> getRepository();

    @Override
    public void create(T entity) throws SQLException {
        getRepository().save(entity);
    }

    @Override
    public List<T> findAll() throws SQLException {
        return getRepository().findAll();
    }

    @Override
    public T findBy(ID id) throws SQLException {
        return (T) getRepository().findById(id).orElse(null);
    }

    @Override
    public void update(T entity) throws SQLException {
        getRepository().save(entity);
    }

    @Override
    public void deleteBy(ID id) throws SQLException {
        getRepository().deleteById(id);
    }

}
