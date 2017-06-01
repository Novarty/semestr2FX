package sample.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ItemsController {
    private static final Logger log = LoggerFactory.getLogger(ItemsController.class);

    @FXML
    private TextField firstNameField;
    @FXML
    private TextField lastNameField;
    @FXML
    private Label messageLabel;

//    public void sayHello() {
//        Platform.runLater(new Runnable() {
//            public void run() {
//                try {
//                    CloseableHttpClient httpclient = HttpClients.createDefault();
//                    HttpGet httpGet = new HttpGet("http://localhost:8888/items");
//                    log.debug("Http request sent to  " + httpGet.getURI());
//                    CloseableHttpResponse response1 = httpclient.execute(httpGet);
//                    BufferedReader rd = new BufferedReader(new InputStreamReader(response1.getEntity().getContent()));
//                    StringBuffer result = new StringBuffer();
//                    String line = "";
//                    while ((line = rd.readLine()) != null) {
//                        result.append(line);
//                    }
//                    JSONObject o = new JSONObject(result.toString());
//                    messageLabel.setText("Hello " + o.getJSONObject("gamer1").getInt("counter"));
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//    }

}
