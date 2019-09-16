package com.wrona;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args){

        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/main.fxml"));

        //MainController mainController = new MainController();
        //loader.setController(mainController);

        StackPane stackPane = loader.load();
        Scene scene = new Scene(stackPane);

        stage.setScene(scene);
        stage.setTitle("ExampleJavaFX Application");
        stage.setWidth(480.0);
        stage.setHeight(640.0);
        stage.setResizable(false);
        stage.show();
    }
}
