package sample.model;

import javafx.beans.property.SimpleStringProperty;

/**
 * Created by admin on 26.05.2017.
 */
public class ItemsInOrder {
    private SimpleStringProperty name;
    private SimpleStringProperty amountInOrder;
    private SimpleStringProperty status; // ENUM возможно.

    public ItemsInOrder(String name, String amountInOrder, String status) {
        this.name = new  SimpleStringProperty(name);
        this.amountInOrder = new SimpleStringProperty(amountInOrder);
        this.status = new SimpleStringProperty(status);
    }

    public ItemsInOrder() {
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getStatus() {
        return status.get();
    }

    public SimpleStringProperty statusProperty() {
        return status;
    }

    public void setStatus(String status) {
        this.status.set(status);
    }

    public String getAmountInOrder() {
        return amountInOrder.get();
    }

    public SimpleStringProperty amountInOrderProperty() {
        return amountInOrder;
    }

    public void setAmountInOrder(String amountInOrder) {
        this.amountInOrder.set(amountInOrder);
    }
}
