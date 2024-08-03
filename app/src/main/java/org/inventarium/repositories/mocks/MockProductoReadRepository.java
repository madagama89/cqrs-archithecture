package org.inventarium.repositories.mocks;

import org.inventarium.models.Producto;
import org.inventarium.repositories.ProductoReadRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MockProductoReadRepository implements ProductoReadRepository {
    private Map<String, Producto> productos = new HashMap<>();

    @Override
    public Producto findById(String id) {
        return productos.get(id);
    }

    @Override
    public List<Producto> findAll() {
        return new ArrayList<>(productos.values());
    }

    public void addProducto(Producto producto) {
        productos.put(producto.getId(), producto);
    }
}

