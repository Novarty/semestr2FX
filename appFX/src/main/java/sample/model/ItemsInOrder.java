package sample.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * Created by admin on 26.05.2017.
 */
public class ItemsInOrder {
    private SimpleStringProperty name;
    private IntegerProperty amountInOrder;
    private SimpleStringProperty status; // ENUM возможно.

    public ItemsInOrder(String name, Integer amountInOrder, String status) {
        this.name = new  SimpleStringProperty(name);
        this.amountInOrder = new SimpleIntegerProperty(amountInOrder);
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

    public int getAmountInOrder() {
        return amountInOrder.get();
    }

    public IntegerProperty amountInOrderProperty() {
        return amountInOrder;
    }

    public void setAmountInOrder(int amountInOrder) {
        this.amountInOrder.set(amountInOrder);
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
}
