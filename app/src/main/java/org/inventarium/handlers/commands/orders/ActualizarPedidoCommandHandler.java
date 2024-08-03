package org.inventarium.handlers.commands.orders;

import org.inventarium.commands.orders.ActualizarPedidoCommand;
import org.inventarium.models.Pedido;
import org.inventarium.repositories.PedidoRepository;

public class ActualizarPedidoCommandHandler {
    private PedidoRepository pedidoRepository;

    public ActualizarPedidoCommandHandler(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public void handle(ActualizarPedidoCommand command) {
        Pedido pedido = pedidoRepository.findById(command.getId());
        if (pedido != null) {
            pedido.setProductos(command.getProductos());
            pedido.setTotal(command.getTotal());
            pedidoRepository.update(pedido);
        }
    }
}

