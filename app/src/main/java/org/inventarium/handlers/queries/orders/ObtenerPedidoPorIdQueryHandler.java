package org.inventarium.handlers.queries.orders;

import org.inventarium.models.Pedido;
import org.inventarium.repositories.PedidoReadRepository;

public class ObtenerPedidoPorIdQueryHandler {
    private PedidoReadRepository pedidoReadRepository;

    public ObtenerPedidoPorIdQueryHandler(PedidoReadRepository pedidoReadRepository) {
        this.pedidoReadRepository = pedidoReadRepository;
    }

    public Pedido handle(String id) {
        return pedidoReadRepository.findById(id);
    }
}
