package fr.amu.iut.exercice12;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

@SuppressWarnings("Duplicates")
public class Palette extends Application {

    private Label texteDuHaut;

    private CustomButton vert;
    private CustomButton rouge;
    private CustomButton bleu;

    private CustomButton sourceOfEvent;

    private BorderPane root;
    private Pane panneau;
    private HBox boutons;
    private VBox bas;
    private Label texteDuBas;

    private ChangeListener<Number> nbClicsListener;

    @Override
    public void start(Stage primaryStage) {
        root = new BorderPane();

        texteDuHaut = new Label();
        texteDuHaut.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        BorderPane.setAlignment(texteDuHaut, Pos.CENTER);

        texteDuBas = new Label();

        panneau = new Pane();
        panneau.setPrefSize(400, 200);

        boutons = new HBox(10);
        boutons.setAlignment(Pos.CENTER);
        boutons.setPadding(new Insets(10, 5, 10, 5));

        bas = new VBox();
        bas.getChildren().addAll(boutons, texteDuBas);
        bas.setAlignment(Pos.CENTER_RIGHT);

        vert = new CustomButton("Vert", "#31BCA4");
        rouge = new CustomButton("Rouge", "#F21411");
        bleu = new CustomButton("Bleu", "#3273A4");

        // Define the event handler for button clicks
        vert.setOnAction(event -> handleButtonClick(event));
        rouge.setOnAction(event -> handleButtonClick(event));
        bleu.setOnAction(event -> handleButtonClick(event));

        // Define the ChangeListener for nbClics
        nbClicsListener = (observable, oldValue, newValue) -> {
            if (sourceOfEvent != null) {
                texteDuHaut.setText(sourceOfEvent.getText() + " cliqué " + newValue + " fois");
                panneau.setStyle("-fx-background-color: " + sourceOfEvent.getCouleur());
                texteDuBas.setText("Le " + sourceOfEvent.getText() + " est une jolie couleur !");
                texteDuBas.setStyle("-fx-text-fill: " + sourceOfEvent.getCouleur() + " ");
            }
        };

        // Attach the listener to the nbClics properties
        vert.nbClicsProperty().addListener(nbClicsListener);
        rouge.nbClicsProperty().addListener(nbClicsListener);
        bleu.nbClicsProperty().addListener(nbClicsListener);

        boutons.getChildren().addAll(vert, rouge, bleu);

        root.setCenter(panneau);
        root.setTop(texteDuHaut);
        root.setBottom(bas);

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void handleButtonClick(ActionEvent event) {
        sourceOfEvent = (CustomButton) event.getSource();
        sourceOfEvent.setNbClics(sourceOfEvent.getNbClics() + 1);
    }
}
