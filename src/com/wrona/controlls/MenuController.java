package com.wrona.controlls;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class MenuController {
 /*   @FXML
    Button application;
    @FXML
    Button options;
    @FXML
    Button exit;*/

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    public MainController getMainController() {
        return mainController;
    }

    private MainController mainController;

    public MenuController() {
        System.out.println("Menu controller");
    }

    public void initialize() {
        System.out.println("");
    }

    public void handleApplicationView(ActionEvent actionEvent) {
        System.out.println("View");
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/view.fxml"));
        VBox view = null;
        try {
            view = loader.load();
            mainController.setScreen(view);

        } catch (IOException e) {
            e.printStackTrace();
        }
        ApplicationViewController applicationViewController = loader.getController();
        applicationViewController.setMainController(mainController);
    };

    public void handleApplicationOptions(ActionEvent actionEvent) {
        System.out.println("Options");
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/options.fxml"));
        VBox options = null;
        try {
            options = loader.load();
            mainController.setScreen(options);

        } catch (IOException e) {
            e.printStackTrace();
        }
        ApplicationOptionsController applicationOptionsController = loader.getController();
        applicationOptionsController.setMainController(mainController);
    }

    ;

    public void handleExitFromApplication(ActionEvent actionEvent) {
        System.out.println("Exit");
        Platform.exit();
    }

    ;
}
