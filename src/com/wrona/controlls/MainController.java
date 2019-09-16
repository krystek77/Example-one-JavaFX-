package com.wrona.controlls;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class MainController {

    public StackPane getMain() {
        return main;
    }

    /*@FXML
        Button button;
        @FXML
        CheckBox checkBox;*/
    @FXML
    private StackPane main;

    public MainController() {
        System.out.println("MainController" + this);
    }

    public void initialize() {
        loadMenu();

/*        EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println(event.toString());
                if(event.getSource() instanceof Button){

                    System.out.println("CLICK BUTTON START");
                } else if(event.getSource() instanceof CheckBox){
                    System.out.println("CLICKED CHECKBOX");
                }
            }
        };
        button.addEventHandler(ActionEvent.ACTION,handler);
        checkBox.addEventHandler(ActionEvent.ACTION,handler);*/

        /*EventHandler<ActionEvent> handler = e->{
            System.out.println("Clicked button");
        };

        button.addEventHandler(ActionEvent.ACTION,handler);*/
    }

    public void loadMenu(){
        System.out.println("Initialize");
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/menu.fxml"));
        VBox menu = null;
        try {
            menu = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        MenuController menuController = loader.getController();
        menuController.setMainController(this);
        setScreen(menu);
    }

    public void setScreen(VBox vBox){
        main.getChildren().clear();
        main.getChildren().add(vBox);
    }

/*    @FXML
    public void onActionHandler(ActionEvent event){
        if(event.getSource() instanceof Button){
            System.out.println("CLICKED BUTTON");
        } else {
            System.out.println("CLICKED CHECKBOX");
        }
    }*/

}
