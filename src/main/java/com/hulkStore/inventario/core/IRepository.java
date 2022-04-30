package com.hulkStore.inventario.core;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

public interface IRepository<T,Long> extends JpaRepository<T,Long> {
}
