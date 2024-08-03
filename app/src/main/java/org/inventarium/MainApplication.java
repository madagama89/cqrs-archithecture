package org.inventarium;

import java.util.List;

import org.inventarium.commands.inventory.CrearProductoCommand;
import org.inventarium.handlers.commands.inventory.CrearProductoCommandHandler;
import org.inventarium.handlers.queries.inventory.ObtenerProductoPorIdQueryHandler;
import org.inventarium.handlers.queries.inventory.ObtenerTodosLosProductosQueryHandler;
import org.inventarium.mediator.Mediator;
import org.inventarium.models.Producto;
import org.inventarium.queries.inventory.ObtenerProductoPorIdQuery;
import org.inventarium.queries.inventory.ObtenerTodosLosProductosQuery;
import org.inventarium.repositories.mocks.MockProductoReadRepository;
import org.inventarium.repositories.mocks.MockProductoRepository;

public class MainApplication {
    public static void main(String[] args) {
        // Create repositories
        MockProductoRepository productoRepository = new MockProductoRepository();
        MockProductoReadRepository productoReadRepository = new MockProductoReadRepository(productoRepository);
        
        // Create Mediator
        Mediator mediator = new Mediator();
        
        // Register command handlers
        mediator.registerCommandHandler(CrearProductoCommand.class, new CrearProductoCommandHandler(productoRepository));
        
        // Register query handlers
        mediator.registerQueryHandler(ObtenerProductoPorIdQuery.class, new ObtenerProductoPorIdQueryHandler(productoReadRepository));
        mediator.registerQueryHandler(ObtenerTodosLosProductosQuery.class, new ObtenerTodosLosProductosQueryHandler(productoReadRepository));
        
        // Send commands
        CrearProductoCommand crearProductoCommand1 = new CrearProductoCommand("1", "Laptop", 10, 1000.0);
        CrearProductoCommand crearProductoCommand2 = new CrearProductoCommand("2", "Mouse", 50, 25.0);
        mediator.sendCommand(crearProductoCommand1);
        mediator.sendCommand(crearProductoCommand2);
        
        // Send queries
        ObtenerProductoPorIdQuery obtenerProductoPorIdQuery = new ObtenerProductoPorIdQuery("1");
        Producto producto = mediator.sendQuery(obtenerProductoPorIdQuery);
        System.out.println("Producto obtenido: " + producto);
        
        ObtenerTodosLosProductosQuery obtenerTodosLosProductosQuery = new ObtenerTodosLosProductosQuery();
        List<Producto> productos = mediator.sendQuery(obtenerTodosLosProductosQuery);
        System.out.println("Todos los productos: " + productos);
    }
}

