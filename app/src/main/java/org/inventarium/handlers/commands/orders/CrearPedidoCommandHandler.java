package org.inventarium.handlers.commands.orders;

import org.inventarium.commands.orders.CrearPedidoCommand;
import org.inventarium.models.Pedido;
import org.inventarium.repositories.PedidoRepository;

public class CrearPedidoCommandHandler {
    private PedidoRepository pedidoRepository;

    public CrearPedidoCommandHandler(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public void handle(CrearPedidoCommand command) {
        Pedido pedido = new Pedido(command.getId(), command.getProductos(), command.getTotal());
        pedidoRepository.save(pedido);
    }
}
