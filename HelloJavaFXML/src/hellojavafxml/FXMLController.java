/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hellojavafxml;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

/**
 *
 * @author yhuang
 */
public class FXMLController implements Initializable {
    @FXML
    private Label status;
    @FXML
    private CheckBox enableCheckBox;
    @FXML
    private Button clickMeButton;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void enableHandler(ActionEvent event) {
        if (enableCheckBox.isSelected()) {
            System.out.println("You enabled me!");
            status.setText("Enabled.");
        }
        else {
            System.out.println("You disabled me!");
            status.setText("Disabled.");
        }
    }

    @FXML
    private void clickMeHandler(ActionEvent event) {
        System.out.println("You clicked me!");
        status.setText("Clicked.");
    }  
}
