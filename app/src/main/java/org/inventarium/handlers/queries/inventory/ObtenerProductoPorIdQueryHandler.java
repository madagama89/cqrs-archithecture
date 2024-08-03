package org.inventarium.handlers.queries.inventory;


import org.inventarium.models.Producto;
import org.inventarium.repositories.ProductoReadRepository;
import org.inventarium.queries.inventory.ObtenerProductoPorIdQuery;

import java.util.function.Function;

public class ObtenerProductoPorIdQueryHandler implements Function<ObtenerProductoPorIdQuery, Producto> {
    private final ProductoReadRepository productoReadRepository;

    public ObtenerProductoPorIdQueryHandler(ProductoReadRepository productoReadRepository) {
        this.productoReadRepository = productoReadRepository;
    }

    @Override
    public Producto apply(ObtenerProductoPorIdQuery query) {
        return productoReadRepository.findById(query.getId());
    }
}

