package controller;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import view.tdm.ItemTM;

import java.net.URL;
import java.util.LinkedHashMap;
import java.util.ResourceBundle;
import java.util.regex.Pattern;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
public class ItemFormController implements Initializable {
    public TextField txtItemCode;
    public TextField txtItemName;
    public TextField txtQtyOnHand;
    public TextField txtUnitPrice;
    public TableView<ItemTM> tblItem;
    public JFXButton btnSaveItem;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void textFields_Key_Realeased(KeyEvent keyEvent) {


    }
}
