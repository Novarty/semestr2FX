package sample.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    private static final Logger log = LoggerFactory.getLogger(MainController.class);
    @FXML
    ItemsTabController itemsTabController;
    @FXML
    OrdersTabController ordersTabController;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        log.info("Started");
        itemsTabController.init(this);
        ordersTabController.init(this);
    }
}
