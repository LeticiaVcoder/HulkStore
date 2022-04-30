package com.hulkStore.inventario.core;

import java.util.List;

public class GenericService <T> implements IGenericService<T>{

    private IRepository<T,Long> repository;
    @Override
    public List<T> findAll() {
        return repository.findAll();
    }

    @Override
    public T save(T entity) {
        return repository.save(entity);
    }

    @Override
    public T findById(long id) {
        return (T) repository.findById(id);
    }

    @Override
    public void delete(T entity) {
        repository.delete(entity);
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }

    @Override
    public long count() {
        return repository.count();
    }
}
