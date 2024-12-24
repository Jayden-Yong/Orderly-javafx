package com.learn.orderly;

import org.kordamp.ikonli.fontawesome5.FontAwesomeSolid;
import org.kordamp.ikonli.javafx.FontIcon;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label logo;
    @FXML
    private Label iconLabel;

    @FXML
    public void initialize() {
        FontIcon icon = new FontIcon(FontAwesomeSolid.HOME);
        iconLabel.setGraphic(icon);
    }
}