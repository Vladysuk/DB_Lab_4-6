package ua.lviv.iot.service;

import java.sql.SQLException;
import java.util.List;

public interface ServiceTemplate<T, ID> {

    int create(T entity) throws SQLException;

    List<T> findAll() throws SQLException;

    T findBy(ID id) throws SQLException;

    int update(T entity) throws SQLException;

    int delete(ID id) throws SQLException;

}

