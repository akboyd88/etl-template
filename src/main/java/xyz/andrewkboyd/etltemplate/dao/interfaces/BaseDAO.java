package xyz.andrewkboyd.etltemplate.dao.interfaces;

public interface BaseDAO<T> {
    void save(T obj);
}
