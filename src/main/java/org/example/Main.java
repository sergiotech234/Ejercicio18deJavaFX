package org.example;

// Importación de clases necesarias de JavaFX
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// Clase principal que hereda de Application
public class Main extends Application {

    // Método que inicia la interfaz gráfica
    @Override
    public void start(Stage primaryStage) {

        // Crear botón 1
        Button button1 = new Button("Botón 1");

        // Evento del botón:
        // Llama al método mostrarMensaje()
        // enviando un texto como parámetro
        button1.setOnAction(
                e -> mostrarMensaje(
                        "Has pulsado el Botón 1"
                )
        );

        // Crear botón 2
        Button button2 = new Button("Botón 2");

        // Evento del botón 2
        button2.setOnAction(
                e -> mostrarMensaje(
                        "Has pulsado el Botón 2"
                )
        );

        // Crear botón 3
        Button button3 = new Button("Botón 3");

        // Evento del botón 3
        button3.setOnAction(
                e -> mostrarMensaje(
                        "Has pulsado el Botón 3"
                )
        );

        // VBox organiza los botones verticalmente
        VBox vBox = new VBox(
                button1,
                button2,
                button3
        );

        // Crear escena con tamaño 300x200
        Scene scene =
                new Scene(vBox, 300, 200);

        // Configurar título de la ventana
        primaryStage.setTitle(
                "Aplicación de clic de botón"
        );

        // Asignar escena a la ventana
        primaryStage.setScene(scene);

        // Mostrar ventana
        primaryStage.show();
    }

    // Método privado encargado de mostrar
    // mensajes en la consola
    private void mostrarMensaje(
            String mensaje) {

        // Imprime el mensaje recibido
        System.out.println(mensaje);
    }

    // Método principal que inicia aplicación
    public static void main(String[] args) {
        launch(args);
    }
}
