package org.inventarium.repositories.mocks;

import org.inventarium.models.Pedido;
import org.inventarium.repositories.PedidoReadRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MockPedidoReadRepository implements PedidoReadRepository {
    private Map<String, Pedido> pedidos = new HashMap<>();

    @Override
    public Pedido findById(String id) {
        return pedidos.get(id);
    }

    @Override
    public List<Pedido> findAll() {
        return new ArrayList<>(pedidos.values());
    }

    public void addPedido(Pedido pedido) {
        pedidos.put(pedido.getId(), pedido);
    }
}
