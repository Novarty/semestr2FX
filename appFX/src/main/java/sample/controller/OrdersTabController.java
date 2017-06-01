package sample.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.model.ItemsInOrder;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by admin on 25.05.2017.
 */
public class OrdersTabController implements Initializable {
    private MainController main;
    private ObservableList<ItemsInOrder> ordersData = FXCollections.observableArrayList();

    @FXML
    private TableView<ItemsInOrder> tableItemsInOrder;
    @FXML
    private TableColumn<ItemsInOrder, String> nameColumn2;
    @FXML
    private TableColumn<ItemsInOrder, Integer> amountColumn2;
    @FXML
    private TableColumn<ItemsInOrder, String> statusColumn;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initData();
        // устанавливаем тип изначение которое должно храниться в колонке
        nameColumn2.setCellValueFactory(new PropertyValueFactory<ItemsInOrder, String>("name"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<ItemsInOrder, String>("status"));
        amountColumn2.setCellValueFactory(new PropertyValueFactory<ItemsInOrder, Integer>("amountInOrder"));
//        nameColumn.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
//        amountColumn.setCellValueFactory(cellData -> cellData.getValue().amountProperty());
        // заполняем таблицу данными
        tableItemsInOrder.setItems(ordersData);
    }

    private void initData() {
        // инициализируем данные
        ordersData.add(new ItemsInOrder("Картошка",3,"Оформлен"));
        ordersData.add(new ItemsInOrder("Томаты",10,"В пути"));
    }
    public void init(MainController mainController) {
        main = mainController;
    }
    /**
     * Возвращает данные в виде наблюдаемого списка адресатов.
     * @return
     */
    private ObservableList<ItemsInOrder> itemsInOrderObservableList = FXCollections.observableArrayList();
    public ObservableList<ItemsInOrder> getItemsInOrderObservableList() {
        return itemsInOrderObservableList;
    }
}
