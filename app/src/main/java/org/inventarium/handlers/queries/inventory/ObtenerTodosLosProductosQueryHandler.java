package org.inventarium.handlers.queries.inventory;

import org.inventarium.models.Producto;
import org.inventarium.repositories.ProductoReadRepository;

import java.util.List;

public class ObtenerTodosLosProductosQueryHandler {
    private ProductoReadRepository productoReadRepository;

    public ObtenerTodosLosProductosQueryHandler(ProductoReadRepository productoReadRepository) {
        this.productoReadRepository = productoReadRepository;
    }

    public List<Producto> handle() {
        return productoReadRepository.findAll();
    }
}

