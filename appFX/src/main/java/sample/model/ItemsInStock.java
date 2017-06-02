package sample.model;

import javafx.beans.property.SimpleStringProperty;

/**
 * Created by admin on 26.05.2017.
 */
//@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemsInStock {
    private SimpleStringProperty name;
    private SimpleStringProperty amount;

    public ItemsInStock(String name, String amount) {
        this.name = new  SimpleStringProperty(name);
        this.amount = new SimpleStringProperty(amount);
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


    public String getAmount() {
        return amount.get();
    }

    public SimpleStringProperty amountProperty() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount.set(amount);
    }
}
