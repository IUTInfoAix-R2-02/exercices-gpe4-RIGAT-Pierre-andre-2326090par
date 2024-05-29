package fr.amu.iut.exercice11;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

@SuppressWarnings("Duplicates")
public class Palette extends Application {

    private int nbVert = 0;
    private int nbRouge = 0;
    private int nbBleu = 0;

    private StringProperty message;
    private IntegerProperty nbfois;
    private StringProperty couleurPanneau;

    private Label texteDuHaut;

    private Button vert;
    private Button rouge;
    private Button bleu;

    private BorderPane root;
    private Pane panneau;
    private HBox boutons;

    private Label texteDuBas;

    public Palette(){
        message = new SimpleStringProperty();
        nbfois = new SimpleIntegerProperty();
        couleurPanneau = new SimpleStringProperty("#fff");
    }

    private void vertClick() {
        message.set(vert.getText());
        nbfois.set(++nbVert);
        couleurPanneau.set("#0f0");
    }

    private void rougeClick() {
        message.set(rouge.getText());
        nbfois.set(++nbRouge);
        couleurPanneau.set("#f00");
    }

    private void bleuClick() {
        message.set(bleu.getText());
        nbfois.set(++nbBleu);
        couleurPanneau.set("#00f");
    }

    private void createBindings() {
        panneau.styleProperty().bind(Bindings.format("-fx-background-color: %s", couleurPanneau));
        texteDuBas.styleProperty().bind(Bindings.format("-fx-text-fill: %s", couleurPanneau));
        BooleanProperty pasEncoreDeClic = new SimpleBooleanProperty();
        pasEncoreDeClic.bind(Bindings.equal(0, nbfois));
        System.out.println(pasEncoreDeClic.get());
        texteDuHaut.textProperty().bind(Bindings.when(pasEncoreDeClic)
                                                .then("Cliquez sur un bouton")
                                                .otherwise(
                                                        //Bindings.format("%s choisi %d fois", message, nbfois.getValue())
                                                        message.concat(" choisi ").concat(nbfois.asString()).concat(" fois")
                                                )
        );
        texteDuBas.textProperty().bind(Bindings.when(pasEncoreDeClic)
                                                .then("")
                                                .otherwise(Bindings.format("Le %s est une jolie couleur !", message))
        );
    }

    @Override
    public void start(Stage primaryStage) {
        root = new BorderPane();

        texteDuHaut = new Label();
        texteDuHaut.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        BorderPane.setAlignment(texteDuHaut, Pos.CENTER);
        // texteDuHaut.setText("Cliquez sur un bouton");

        panneau = new Pane();
        panneau.setPrefSize(400, 200);

        VBox bas = new VBox();
        boutons = new HBox(10);
        boutons.setAlignment(Pos.CENTER);
        boutons.setPadding(new Insets(10, 5, 10, 5));
        texteDuBas = new Label();
        bas.setAlignment(Pos.CENTER_RIGHT);
        bas.getChildren().addAll(boutons, texteDuBas);

        vert = new Button("Vert");
        rouge = new Button("Rouge");
        bleu = new Button("Bleu");

        vert.setOnAction(actionEvent -> vertClick());
        rouge.setOnAction(actionEvent -> rougeClick());
        bleu.setOnAction(actionEvent -> bleuClick());

        createBindings();

        boutons.getChildren().addAll(vert, rouge, bleu);

        root.setCenter(panneau);
        root.setTop(texteDuHaut);
        root.setBottom(bas);

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
