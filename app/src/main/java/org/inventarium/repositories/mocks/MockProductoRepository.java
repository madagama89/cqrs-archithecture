package org.inventarium.repositories.mocks;


import org.inventarium.models.Producto;
import org.inventarium.repositories.ProductoRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MockProductoRepository implements ProductoRepository {
    private Map<String, Producto> productos = new HashMap<>();

    @Override
    public void save(Producto producto) {
        productos.put(producto.getId(), producto);
    }

    @Override
    public void update(Producto producto) {
        productos.put(producto.getId(), producto);
    }

    @Override
    public void delete(String id) {
        productos.remove(id);
    }

    public Producto findById(String id) {
        return productos.get(id);
    }

    public List<Producto> findAll() {
        return new ArrayList<>(productos.values());
    }
}
