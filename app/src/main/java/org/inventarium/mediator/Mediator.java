package org.inventarium.mediator;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

public class Mediator {
    private Map<Class<?>, Consumer<?>> commandHandlers = new HashMap<>();
    private Map<Class<?>, Function<?, ?>> queryHandlers = new HashMap<>();

    public <T> void registerCommandHandler(Class<T> commandType, Consumer<T> handler) {
        commandHandlers.put(commandType, handler);
    }

    public <T, R> void registerQueryHandler(Class<T> queryType, Function<T, R> handler) {
        queryHandlers.put(queryType, handler);
    }

    @SuppressWarnings("unchecked")
    public <T> void sendCommand(T command) {
        Consumer<T> handler = (Consumer<T>) commandHandlers.get(command.getClass());
        if (handler != null) {
            handler.accept(command);
        }
    }

    @SuppressWarnings("unchecked")
    public <T, R> R sendQuery(T query) {
        Function<T, R> handler = (Function<T, R>) queryHandlers.get(query.getClass());
        if (handler != null) {
            return handler.apply(query);
        }
        return null;
    }
}


