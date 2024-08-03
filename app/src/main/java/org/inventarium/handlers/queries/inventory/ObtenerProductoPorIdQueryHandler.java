package org.inventarium.handlers.queries.inventory;


import org.inventarium.models.Producto;
import org.inventarium.repositories.ProductoReadRepository;

public class ObtenerProductoPorIdQueryHandler {
    private ProductoReadRepository productoReadRepository;

    public ObtenerProductoPorIdQueryHandler(ProductoReadRepository productoReadRepository) {
        this.productoReadRepository = productoReadRepository;
    }

    public Producto handle(String id) {
        return productoReadRepository.findById(id);
    }
}

