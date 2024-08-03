package org.inventarium.handlers.commands.inventory;

import org.inventarium.commands.inventory.EliminarProductoCommand;
import org.inventarium.repositories.ProductoRepository;

public class EliminarProductoCommandHandler {
    private ProductoRepository productoRepository;

    public EliminarProductoCommandHandler(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public void handle(EliminarProductoCommand command) {
        productoRepository.delete(command.getId());
    }
}
