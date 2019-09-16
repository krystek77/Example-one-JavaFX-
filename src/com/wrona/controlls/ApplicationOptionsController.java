package com.wrona.controlls;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ApplicationOptionsController {

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }
    private MainController mainController;

    public ApplicationOptionsController(){
        System.out.println("ApplicationOptionController");
    }
    @FXML
    public void initialize(){
        System.out.println("ApplicationOptionController initialize");
    }
    @FXML
    public void backToMenu(ActionEvent actionEvent) {
        System.out.println("From options application back to menu");
        mainController.loadMenu();
    }
}
