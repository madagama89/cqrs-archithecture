package org.inventarium.repositories.mocks;

import org.inventarium.models.Pedido;
import org.inventarium.repositories.PedidoRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MockPedidoRepository implements PedidoRepository {
    private Map<String, Pedido> pedidos = new HashMap<>();

    @Override
    public void save(Pedido pedido) {
        pedidos.put(pedido.getId(), pedido);
    }

    @Override
    public void update(Pedido pedido) {
        pedidos.put(pedido.getId(), pedido);
    }

    @Override
    public void delete(String id) {
        pedidos.remove(id);
    }

    public Pedido findById(String id) {
        return pedidos.get(id);
    }

    public List<Pedido> findAll() {
        return new ArrayList<>(pedidos.values());
    }
}

