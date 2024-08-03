package org.inventarium.commands.inventory;



public class EliminarProductoCommand {
    private String id;

    public EliminarProductoCommand(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
