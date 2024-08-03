package org.inventarium.repositories.mocks;

import org.inventarium.models.Producto;
import org.inventarium.repositories.ProductoReadRepository;

import java.util.ArrayList;

import java.util.List;


public class MockProductoReadRepository implements ProductoReadRepository {
    private final MockProductoRepository productoRepository;

    public MockProductoReadRepository(MockProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public Producto findById(String id) {
        return productoRepository.findById(id);
    }

    @Override
    public List<Producto> findAll() {
        return new ArrayList<>(productoRepository.findAll().values());
    }
}

