package org.inventarium.repositories;

import org.inventarium.models.Pedido;

public interface PedidoRepository {
    Pedido findById(String id);
    void save(Pedido pedido);
    void update(Pedido pedido);
    void delete(String id);
}
