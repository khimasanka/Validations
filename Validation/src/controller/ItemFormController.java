package controller;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import view.tdm.ItemTM;

import java.net.URL;
import java.util.ResourceBundle;

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

    public void textFields_Key_Released(KeyEvent keyEvent) {


    }
}
