package org.inventarium.handlers.queries.orders;

import org.inventarium.models.Pedido;
import org.inventarium.repositories.PedidoReadRepository;

import java.util.List;

public class ObtenerTodosLosPedidosQueryHandler {
    private PedidoReadRepository pedidoReadRepository;

    public ObtenerTodosLosPedidosQueryHandler(PedidoReadRepository pedidoReadRepository) {
        this.pedidoReadRepository = pedidoReadRepository;
    }

    public List<Pedido> handle() {
        return pedidoReadRepository.findAll();
    }
}
