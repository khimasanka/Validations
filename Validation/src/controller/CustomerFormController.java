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


    public void textFields_Key_Realeased(KeyEvent keyEvent) {

        String cusIdRegEx = "^(C00-)[0-9]{3,4}$";
        String cusNameRegEx = "^[A-z ]{3,20}$";
        String cusAddressRegEx = "^[A-z0-9/ ]{6,30}$";
        String cusSalaryRegEx = "^[1-9][0-9]*([.][0-9]{2})?$";

        Pattern idPattern = Pattern.compile(cusIdRegEx);
        Pattern namePattern = Pattern.compile(cusNameRegEx);
        Pattern addressPattern = Pattern.compile(cusAddressRegEx);
        Pattern salaryPattern = Pattern.compile(cusSalaryRegEx);


        if (keyEvent.getCode() == KeyCode.ENTER) {
            /*First lets check the customer id*/
            String typedCustomerID = txtCusID.getText();
            if (idPattern.matcher(typedCustomerID).matches()) {
                txtCusID.getParent().setStyle("-fx-border-color: green");
                txtCusName.requestFocus();

                /*Check the name input*/
                String typedCustomerName = txtCusName.getText();
                if (namePattern.matcher(typedCustomerName).matches()) {
                    txtCusName.getParent().setStyle("-fx-border-color: green");
                    txtCusAddress.requestFocus();

                    /*Check the Address*/
                    String typedCustomerAddress = txtCusAddress.getText();
                    if (addressPattern.matcher(typedCustomerAddress).matches()) {
                        txtCusAddress.getParent().setStyle("-fx-border-color: green");
                        txtCusSalary.requestFocus();

//                    Check Customer Salary
                        String typedCustomerSalary = txtCusSalary.getText();
                        if (salaryPattern.matcher(typedCustomerSalary).matches()) {
                            txtCusSalary.getParent().setStyle("-fx-border-color: green");
                            btnSaveCustomer.requestFocus();

                        } else {
                            txtCusSalary.getParent().setStyle("-fx-border-color: red");
                            txtCusSalary.requestFocus();
                        }
                    } else {
                        txtCusAddress.requestFocus();
                        txtCusAddress.getParent().setStyle("-fx-border-color: red");
                    }
                } else {
                    txtCusName.getParent().setStyle("-fx-border-color: red");
                    txtCusName.requestFocus();
                }
            } else {
                txtCusID.getParent().setStyle("-fx-border-color: red");
                txtCusID.requestFocus();
            }
        }
    }

    /*01.Register One event for all text fields*/

}
