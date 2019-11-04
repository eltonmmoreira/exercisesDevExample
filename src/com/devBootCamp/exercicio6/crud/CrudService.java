package com.devBootCamp.exercicio6.crud;

import java.util.List;

public interface CrudService<T extends BaseObject> {

    T save(T entity);

    void delete(Integer id);

    List<T> findAll();

    T findById(Integer id);

}
