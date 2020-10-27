package com.mycompany.bmi;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {
    
    @FXML private TextField txtnang;
    @FXML private TextField txtcao;
    @FXML private Label txtkq;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    
    public void proveHandler(ActionEvent evt){
        double nang = Double.parseDouble(txtnang.getText());
        double cao = Double.parseDouble(txtcao.getText());
        double kq = nang/(cao * cao);
        String ketqua = String.valueOf(kq);
        
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        if(kq < 18.5)       
            alert.setContentText(ketqua + "  Thiếu cân");
        else if(kq < 25)
        {
            alert.setContentText(ketqua + "  Bình thường");
        }
        else if(kq < 30)
        {
            alert.setContentText(ketqua + "  Thừa cân");
        }
        else
            alert.setContentText(ketqua + "  Béo phì");
        alert.show();
        }   
}
