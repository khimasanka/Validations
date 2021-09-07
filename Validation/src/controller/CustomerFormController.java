package controller;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import view.tdm.CustomerTM;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Pattern;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
public class CustomerFormController implements Initializable {


    public TextField txtCusID;
    public TextField txtCusName;
    public TextField txtCusAddress;
    public TextField txtCusSalary;
    public TableView<CustomerTM> tblCustomer;
    public JFXButton btnSaveCustomer;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btnSaveCustomer.setDisable(true);
    }

    public void cusID_KeyPress(KeyEvent keyEvent) {

        String regEx = "^(C00-)[0-9]{3,4}$";
        String typeText = txtCusID.getText();
        Pattern compile = Pattern.compile(regEx);
        boolean matches = compile.matcher(typeText).matches();

        if (matches){
            txtCusID.getParent().setStyle("-fx-border-color: green");
            btnSaveCustomer.setDisable(false);
        }else{
            txtCusID.getParent().setStyle("-fx-border-color: red");
            btnSaveCustomer.setDisable(true);
        }

        if (keyEvent.getCode() == KeyCode.ENTER) {
            if (matches){
                txtCusName.requestFocus();
            }
        }
    }
}
