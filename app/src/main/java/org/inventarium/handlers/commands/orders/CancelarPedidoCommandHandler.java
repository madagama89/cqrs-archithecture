package org.inventarium.handlers.commands.orders;

import org.inventarium.commands.orders.CancelarPedidoCommand;
import org.inventarium.repositories.PedidoRepository;

public class CancelarPedidoCommandHandler {
    private PedidoRepository pedidoRepository;

    public CancelarPedidoCommandHandler(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public void handle(CancelarPedidoCommand command) {
        pedidoRepository.delete(command.getId());
    }
}

