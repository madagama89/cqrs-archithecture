package org.inventarium.handlers.queries.inventory;

import org.inventarium.models.Producto;
import org.inventarium.queries.inventory.ObtenerTodosLosProductosQuery;
import org.inventarium.repositories.ProductoReadRepository;

import java.util.List;
import java.util.function.Function;

public class ObtenerTodosLosProductosQueryHandler implements Function<ObtenerTodosLosProductosQuery, List<Producto>> {
    private final ProductoReadRepository productoReadRepository;

    public ObtenerTodosLosProductosQueryHandler(ProductoReadRepository productoReadRepository) {
        this.productoReadRepository = productoReadRepository;
    }

    @Override
    public List<Producto> apply(ObtenerTodosLosProductosQuery query) {
        return productoReadRepository.findAll();
    }
}
