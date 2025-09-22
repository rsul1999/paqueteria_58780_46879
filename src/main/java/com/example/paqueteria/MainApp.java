package com.example.paqueteria;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        SceneManager.setStage(stage);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Vista1.fxml"));
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.setTitle("Cotización de Envíos");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
