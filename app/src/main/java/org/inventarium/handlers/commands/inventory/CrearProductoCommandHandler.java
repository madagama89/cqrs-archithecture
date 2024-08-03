package org.inventarium.handlers.commands.inventory;

import org.inventarium.commands.inventory.CrearProductoCommand;
import org.inventarium.models.Producto;
import org.inventarium.repositories.ProductoRepository;

import java.util.function.Consumer;


public class CrearProductoCommandHandler implements Consumer<CrearProductoCommand> {
    private final ProductoRepository productoRepository;

    public CrearProductoCommandHandler(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public void accept(CrearProductoCommand command) {
        Producto producto = new Producto(command.getId(), command.getNombre(), command.getStock(), command.getPrecio());
        productoRepository.save(producto);
    }
}


