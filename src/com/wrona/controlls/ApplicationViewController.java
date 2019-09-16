package com.wrona.controlls;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ApplicationViewController {

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    private MainController mainController;

    public ApplicationViewController(){
        System.out.println("ApplicationViewController");
    }
    @FXML
    public void initialize(){
        System.out.println("ApplicationViewController initialize method");
    }
    @FXML
    public void backToMenu(ActionEvent actionEvent) {
        System.out.println("BACK TO MENU"+mainController);
        mainController.loadMenu();
    }
}
