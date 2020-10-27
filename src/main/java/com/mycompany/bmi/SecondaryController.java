package com.mycompany.bmi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class SecondaryController {
    @FXML private TextField soTien;
    @FXML private TextField tienLai;
    @FXML private TextField ketQua;
    
    public void TinhTien(ActionEvent evt){
        double tien = Double.parseDouble(soTien.getText());
        double lai = Double.parseDouble(tienLai.getText());
        String kq = String.valueOf(tien * (lai/100) / 12);
        ketQua.setText(kq);
    }

}