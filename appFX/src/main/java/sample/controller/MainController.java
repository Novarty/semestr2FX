package sample.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    ItemsTabController itemsTabController;
    @FXML
    OrdersTabController ordersTabController;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("Старт");
        itemsTabController.init(this);
        ordersTabController.init(this);
    }
}
