package sample.controller;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.json.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sample.model.ItemsInOrder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by admin on 25.05.2017.
 */
public class OrdersTabController implements Initializable {
    private static final Logger log = LoggerFactory.getLogger(OrdersTabController.class);
    private MainController main;
    private ObservableList<ItemsInOrder> ordersData = FXCollections.observableArrayList();

    @FXML
    private TableView<ItemsInOrder> tableItemsInOrder;
    @FXML
    private TableColumn<ItemsInOrder, String> nameColumn2;
    @FXML
    private TableColumn<ItemsInOrder, String> amountColumn2;
    @FXML
    private TableColumn<ItemsInOrder, String> statusColumn;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initData();
        editable();
        // устанавливаем тип изначение которое должно храниться в колонке
        nameColumn2.setCellValueFactory(new PropertyValueFactory<ItemsInOrder, String>("name"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<ItemsInOrder, String>("status"));
        amountColumn2.setCellValueFactory(new PropertyValueFactory<ItemsInOrder, String>("amountInOrder"));

        tableItemsInOrder.setItems(ordersData); // заполняем таблицу данными
    }
    public void init(MainController mainController) {
        main = mainController;
    }

    public void initData() {
        Platform.runLater(new Runnable() {
            public void run() {
                try {
                    CloseableHttpClient httpclient = HttpClients.createDefault();
                    HttpGet httpGet = new HttpGet("http://localhost:8888/allOrders");
                    log.debug("Http request sent to  " + httpGet.getURI());
                    CloseableHttpResponse response1 = httpclient.execute(httpGet);
                    BufferedReader rd = new BufferedReader(new InputStreamReader(response1.getEntity().getContent()));
                    StringBuffer result = new StringBuffer();
                    String line = "";
                    while ((line = rd.readLine()) != null) {
                        result.append(line);
                    }
                    JSONArray o = new JSONArray(result.toString());
                    for (int i = 0; i < o.length(); i++)
                    {
                        ordersData.addAll(new ItemsInOrder(o.getJSONObject(i).getJSONObject("item").getString("itemName"),
                                String.valueOf(o.getJSONObject(i).getInt("amount")), o.getJSONObject(i).getString("status")));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public void editable(){
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status1"));
        statusColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        statusColumn.setOnEditCommit((TableColumn.CellEditEvent<ItemsInOrder, String> event) -> {
            TablePosition<ItemsInOrder, String> pos = event.getTablePosition();

            String newId = event.getNewValue();

            int row = pos.getRow();
            ItemsInOrder item = event.getTableView().getItems().get(row);

            item.setStatus(newId);
        });
    }
}
