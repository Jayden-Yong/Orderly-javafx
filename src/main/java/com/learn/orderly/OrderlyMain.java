package com.learn.orderly;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class OrderlyMain extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));

        Scene home = new Scene(root);
        String css = this.getClass().getResource("/com/learn/orderly/style.css").toExternalForm();
        home.getStylesheets().add(css);

        stage.setScene(home);
        stage.setTitle("Orderly");
        stage.setMaximized(true);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}