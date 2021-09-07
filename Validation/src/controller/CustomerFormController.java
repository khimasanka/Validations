package controller;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import view.tdm.CustomerTM;

import java.net.URL;
import java.util.LinkedHashMap;
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

    LinkedHashMap<TextField, Pattern> allValidations = new LinkedHashMap<>();
    Pattern idPattern = Pattern.compile("^(C00-)[0-9]{3,4}$");
    Pattern namePattern = Pattern.compile("^[A-z ]{3,20}$");
    Pattern addressPattern = Pattern.compile("^[A-z0-9/ ]{6,30}$");
    Pattern salaryPattern = Pattern.compile("^[1-9][0-9]*([.][0-9]{2})?$");

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        validateInit();
    }

    private void validateInit() {
        btnSaveCustomer.setDisable(true);
        allValidations.put(txtCusID, idPattern);
        allValidations.put(txtCusName, namePattern);
        allValidations.put(txtCusAddress, addressPattern);
        allValidations.put(txtCusSalary, salaryPattern);
    }


    public void textFields_Key_Realeased(KeyEvent keyEvent) {
        Object response = validate();

        if (response instanceof Boolean){
            btnSaveCustomer.setDisable(false);
        }

        if (keyEvent.getCode() == KeyCode.ENTER) {
            if (response instanceof TextField) {
                TextField textField = (TextField) response;
                textField.requestFocus();
            }
        }

        btnSaveCustomer.setDisable(true);

    /*    if (keyEvent.getCode() == KeyCode.ENTER) {
            if (idPattern.matcher(txtCusID.getText()).matches()) {
                txtCusName.requestFocus();
                if (namePattern.matcher(txtCusName.getText()).matches()) {
                    txtCusAddress.requestFocus();
                    if (addressPattern.matcher(txtCusAddress.getText()).matches()) {
                        txtCusSalary.requestFocus();
                        if (salaryPattern.matcher(txtCusSalary.getText()).matches()) {
                            btnSaveCustomer.requestFocus();
                            btnSaveCustomer.setDisable(false);
                        } else {
                            txtCusSalary.requestFocus();
                        }
                    } else {
                        txtCusAddress.requestFocus();
                    }
                } else {
                    txtCusName.requestFocus();
                }
            } else {
                txtCusID.requestFocus();
            }
        }

        if (idPattern.matcher(txtCusID.getText()).matches()) {
            txtCusID.getParent().setStyle("-fx-border-color: green");
            if (namePattern.matcher(txtCusName.getText()).matches()) {
                txtCusName.getParent().setStyle("-fx-border-color: green");
                if (addressPattern.matcher(txtCusAddress.getText()).matches()) {
                    txtCusAddress.getParent().setStyle("-fx-border-color: green");
                    if (salaryPattern.matcher(txtCusSalary.getText()).matches()) {
                        txtCusSalary.getParent().setStyle("-fx-border-color: green");
                        btnSaveCustomer.setDisable(false);
                    } else {
                        txtCusSalary.getParent().setStyle("-fx-border-color: red");
                    }
                } else {
                    txtCusAddress.getParent().setStyle("-fx-border-color: red");
                }
            } else {
                txtCusName.getParent().setStyle("-fx-border-color: red");
            }
        } else {
            txtCusID.getParent().setStyle("-fx-border-color: red");
        }*/

    }

    private Object validate() {
        for (TextField textField : allValidations.keySet()) {
            Pattern pattern = allValidations.get(textField);
            if (!pattern.matcher(textField.getText()).matches()) {
                /*if pattern does not match*/
                addErrorToTheBorder(textField);
                return textField;
            }
            removeError(textField);
        }
        return true;
    }


    private void removeError(TextField textField) {
        textField.getParent().setStyle("-fx-border-color: green");
    }

    private void addErrorToTheBorder(TextField textField) {
        textField.getParent().setStyle("-fx-border-color: red");
        btnSaveCustomer.setDisable(true);
    }


    /*01.Register One event for all text fields*/


}

