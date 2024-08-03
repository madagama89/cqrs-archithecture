package org.inventarium.handlers.commands.inventory;


import org.inventarium.commands.inventory.ActualizarProductoCommand;
import org.inventarium.models.Producto;
import org.inventarium.repositories.ProductoRepository;

public class ActualizarProductoCommandHandler {
    private ProductoRepository productoRepository;

    public ActualizarProductoCommandHandler(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public void handle(ActualizarProductoCommand command) {
        Producto producto = productoRepository.findById(command.getId());
        if (producto != null) {
            producto.setNombre(command.getNombre());
            producto.setStock(command.getStock());
            producto.setPrecio(command.getPrecio());
            productoRepository.update(producto);
        }
    }
}

