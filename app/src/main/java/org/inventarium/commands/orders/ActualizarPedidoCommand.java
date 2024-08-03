package org.inventarium.commands.orders;

import java.util.List;

public class ActualizarPedidoCommand {
    private String id;
    private List<String> productos;
    private double total;

    public ActualizarPedidoCommand(String id, List<String> productos, double total) {
        this.id = id;
        this.productos = productos;
        this.total = total;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getProductos() {
        return productos;
    }

    public void setProductos(List<String> productos) {
        this.productos = productos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}

