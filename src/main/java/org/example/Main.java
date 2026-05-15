package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        Button button1 = new Button("Botón 1");
        button1.setOnAction(e -> mostrarMensaje("Has pulsado el Botón 1"));

        Button button2 = new Button("Botón 2");
        button2.setOnAction(e -> mostrarMensaje("Has pulsado el Botón 2"));

        Button button3 = new Button("Botón 3");
        button3.setOnAction(e -> mostrarMensaje("Has pulsado el Botón 3"));


        VBox vBox = new VBox(button1,button2, button3);

        Scene scene = new Scene(vBox, 300, 200);

        primaryStage.setTitle("Aplicación de clic de botón");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Método privado
    private void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public static void main(String[] args) {
        launch(args);
    }
}