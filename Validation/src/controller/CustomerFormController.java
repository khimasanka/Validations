package controller;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
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


    public void textFields_Key_Realeased(KeyEvent keyEvent) {

        String cusIdRegEx = "^(C00-)[0-9]{3,4}$";
        String cusNameRegEx = "^[A-z ]{3,20}$";
        String cusAddressRegEx = "^[A-z0-9/ ]{6,30}$";
        String cusSalaryRegEx = "^[1-9][0-9]*([.][0-9]{2})?$";

        Pattern idPattern = Pattern.compile(cusIdRegEx);
        Pattern namePattern = Pattern.compile(cusNameRegEx);
        Pattern addressPattern = Pattern.compile(cusAddressRegEx);
        Pattern salaryPattern = Pattern.compile(cusSalaryRegEx);


        /*First lets check the customer id*/
        String typedCustomerID = txtCusID.getText();
        if (idPattern.matcher(typedCustomerID).matches()) {
            txtCusID.getParent().setStyle("-fx-border-color: green");
            txtCusName.requestFocus();




        }else{
            txtCusID.getParent().setStyle("-fx-border-color: red");
            txtCusID.requestFocus();
        }







      /*  String regEx = "^(C00-)[0-9]{3,4}$";
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
        }*/
    }

    /*01.Register One event for all text fields*/

}
