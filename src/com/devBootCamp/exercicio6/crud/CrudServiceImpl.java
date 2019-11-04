package com.devBootCamp.exercicio6.crud;

import java.util.List;

public abstract class CrudServiceImpl<T extends BaseObject> implements CrudService<T> {

    //protected abstract CrudDAO<T> getCrudDAO();

    private CrudDAO<T> crudDAO = new CrudDAOImpl<>();

    protected void preSave(T entity) {

    };

    protected void postSave(T entity) {

    };

    @Override
    public T save(T entity) {
        preSave(entity);
        entity = crudDAO.save(entity);
        postSave(entity);
        return entity;
    }

    @Override
    public void delete(Integer id) {
        crudDAO.delete(id);
    }

    @Override
    public List<T> findAll() {
        return crudDAO.findAll();
    }

    @Override
    public T findById(Integer id) {
        return crudDAO.findById(id);
    }
}
