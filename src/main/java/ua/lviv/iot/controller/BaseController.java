package ua.lviv.iot.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import ua.lviv.iot.service.ServiceTemplate;

import java.sql.SQLException;
import java.util.List;

public abstract class BaseController<T, ID> implements ControllerTemplate<T, ID> {

    @Override
    public abstract ServiceTemplate<T, ID> getService();


    @Override
    @PostMapping("")
    public void create(T entity) throws SQLException{
        getService().create(entity);
    }

    @Override
    @GetMapping("")
    public List<T> findAll() throws SQLException {
        return getService().findAll();
    }

    @Override
    @GetMapping("/{id}")
    public T findBy(ID id) throws SQLException {
        return (T) getService().findBy(id);
    }

    @Override
    @PutMapping("/{id}")
    public void update(T entity) throws SQLException {
        getService().update(entity);
    }

    @Override
    @DeleteMapping("/{id}")
    public void deleteBy(ID id) throws SQLException {
        getService().deleteBy(id);
    }

}