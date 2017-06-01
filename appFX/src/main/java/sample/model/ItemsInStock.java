package sample.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * Created by admin on 26.05.2017.
 */
//@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemsInStock {
    private SimpleStringProperty name;
    private IntegerProperty amount;

    public ItemsInStock(String name, Integer amount) {
        this.name = new  SimpleStringProperty(name);
        this.amount = new SimpleIntegerProperty(amount);
    }

    public ItemsInStock() {
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

    public int getAmount() {
        return amount.get();
    }

    public IntegerProperty amountProperty() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount.set(amount);
    }
}
