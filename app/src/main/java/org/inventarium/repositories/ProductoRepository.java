package org.inventarium.repositories;

import org.inventarium.models.Producto;

public interface ProductoRepository {
    Producto findById(String id);
    void save(Producto producto);
    void update(Producto producto);
    void delete(String id);
}
