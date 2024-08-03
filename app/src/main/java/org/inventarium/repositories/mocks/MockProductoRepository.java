package org.inventarium.repositories.mocks;


import org.inventarium.models.Producto;
import org.inventarium.repositories.ProductoRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MockProductoRepository implements ProductoRepository {
    private final Map<String, Producto> productos = new HashMap<>();

    @Override
    public void save(Producto producto) {
        productos.put(producto.getId(), producto);
    }

    @Override
    public Producto findById(String id) {
        return productos.get(id);
    }

    public Map<String, Producto> findAll() {
        return productos;
    }

    @Override
    public void update(Producto producto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
}
