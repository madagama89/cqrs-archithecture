package org.inventarium.repositories;

import org.inventarium.models.Pedido;

import java.util.List;

public interface PedidoReadRepository {
    Pedido findById(String id);
    List<Pedido> findAll();
}


