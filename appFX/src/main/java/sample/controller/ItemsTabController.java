package sample.controller;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.Callback;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.json.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sample.handler.EditingCell;
import sample.model.ItemsInStock;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ResourceBundle;


/**
 * Created by admin on 25.05.2017.
 */
public class ItemsTabController implements Initializable {
    private static final Logger log = LoggerFactory.getLogger(ItemsTabController.class);
    private MainController main;
    private ObservableList<ItemsInStock> itemsData = FXCollections.observableArrayList();

    @FXML
    private TableView<ItemsInStock> tableItemsInStock;
    @FXML
    private TableColumn<ItemsInStock, String> nameColumn1;
    @FXML
    private TableColumn<ItemsInStock, String> amountColumn1;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initData();
        editable();
        // устанавливаем тип изначение которое должно храниться в колонке
        nameColumn1.setCellValueFactory(new PropertyValueFactory<ItemsInStock, String>("name"));
        amountColumn1.setCellValueFactory(new PropertyValueFactory<ItemsInStock, String>("amount"));

        tableItemsInStock.setItems(itemsData); // заполняем таблицу данными
    }

    public void init(MainController mainController) {
        main = mainController;
    }

    public void initData() {
        Platform.runLater(new Runnable() {
            public void run() {
                try {
                    CloseableHttpClient httpclient = HttpClients.createDefault();
                    HttpGet httpGet = new HttpGet("http://localhost:8888/allItems");
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
                        itemsData.addAll(new ItemsInStock(o.getJSONObject(i).getString("itemName"),
                                String.valueOf(o.getJSONObject(i).getInt("amount"))));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public void editable(){
        tableItemsInStock.setEditable(true);
        Callback<TableColumn, TableCell> cellFactory =
                p -> new EditingCell();
        amountColumn1.setCellValueFactory(new PropertyValueFactory<>("amount1"));
        amountColumn1.setCellFactory(TextFieldTableCell.forTableColumn());
        amountColumn1.setOnEditCommit((TableColumn.CellEditEvent<ItemsInStock, String> event) -> {
            TablePosition<ItemsInStock, String> pos = event.getTablePosition();

            String newId = event.getNewValue();

            int row = pos.getRow();
            ItemsInStock item = event.getTableView().getItems().get(row);

            item.setAmount(newId);
        });
    }


}
