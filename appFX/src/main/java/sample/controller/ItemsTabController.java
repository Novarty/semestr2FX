package sample.controller;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.json.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sample.model.ItemsInStock;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by admin on 25.05.2017.
 */
public class ItemsTabController implements Initializable {
    private static final Logger log = LoggerFactory.getLogger(ItemsController.class);
    private MainController main;
    private ObservableList<ItemsInStock> itemsData = FXCollections.observableArrayList();

    @FXML
    private TableView<ItemsInStock> tableItemsInStock;
    @FXML
    private TableColumn<ItemsInStock, String> nameColumn1;
    @FXML
    private TableColumn<ItemsInStock, Integer> amountColumn1;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initData();
        // устанавливаем тип изначение которое должно храниться в колонке
        nameColumn1.setCellValueFactory(new PropertyValueFactory<ItemsInStock, String>("name"));
        amountColumn1.setCellValueFactory(new PropertyValueFactory<ItemsInStock, Integer>("amount"));

        // заполняем таблицу данными
        tableItemsInStock.setItems(itemsData);
    }

//    private void initData() {
//        // инициализируем данные
//
//        itemsData.add(new ItemsInStock("Картошка",345));
//        itemsData.add(new ItemsInStock("Томаты",146));
//    }

    public void init(MainController mainController) {
        main = mainController;
    }

    public void initData() {
        Platform.runLater(new Runnable() {
            public void run() {
                try {
                    CloseableHttpClient httpclient = HttpClients.createDefault();
                    HttpGet httpGet = new HttpGet("http://localhost:8888/items");
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

                        itemsData.addAll(new ItemsInStock(o.getJSONObject(i).getString("name"),o.getJSONObject(i).getInt("amount")));

                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


}
