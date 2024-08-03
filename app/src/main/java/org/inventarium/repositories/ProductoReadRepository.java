package org.inventarium.repositories;

import org.inventarium.models.Producto;

import java.util.List;

public interface ProductoReadRepository {
    Producto findById(String id);
    List<Producto> findAll();
}


