package fr.amu.iut.exercice4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Palette extends Application {

    private int nbVert = 0;
    private int nbRouge = 0;
    private int nbBleu = 0;

    private final Button vert = new Button("Vert");
    private final Button rouge = new Button("Rouge");
    private final Button bleu = new Button("Bleu");

    private final BorderPane root = new BorderPane();
    private final Label label = new Label();
    private final Pane panneau = new Pane();
    private final HBox bas = new HBox();

    private void vertClick() {
        label.setText("Vert choisi " + ++nbVert + " fois");
        panneau.setStyle("-fx-background-color: #0f0");
        nbRouge = 0;
        nbBleu = 0;
    }

    private void rougeClick() {
        label.setText("Rouge choisi " + ++nbRouge + " fois");
        panneau.setStyle("-fx-background-color: #f00");
        nbBleu = 0;
        nbVert = 0;
    }

    private void bleuClick() {
        label.setText("Bleu choisi " + ++nbBleu + " fois");
        panneau.setStyle("-fx-background-color: #00f");
        nbRouge = 0;
        nbVert = 0;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        // ajout des events dans les boutons
        vert.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> vertClick());
        rouge.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> rougeClick());
        bleu.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> bleuClick());

        // ajout des boutons dans la Hbox
        bas.getChildren().addAll(vert, rouge, bleu);

        // changement de la position des boutons
        label.setMaxWidth(Double.MAX_VALUE);
        AnchorPane.setLeftAnchor(label, 0.0);
        AnchorPane.setRightAnchor(label, 0.0);
        label.setAlignment(Pos.CENTER);
        label.setFont(new Font("Arial", 20));
        bas.setAlignment(Pos.CENTER);
        bas.setSpacing(10);
        bas.setPadding(new Insets(10, 10, 10, 10));

        // ajout de la hbox dans la BorderPane
        root.setTop(label);
        root.setCenter(panneau);
        root.setBottom(bas);

        // définition de la taille pour la BorderPane
        root.setPrefWidth(400.0);
        root.setPrefHeight(200.0);

        // définition de la scene
        Scene scene = new Scene(root);

        // définition et affichage de la scene
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

