package fr.amu.iut.exercice2;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Separator;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Objects;

public class TicTacToe extends Application {

    private final Image croix = new Image(Objects.requireNonNull(getClass().getResource("/exercice2/Croix.png")).toString());
    private final Image rond = new Image(Objects.requireNonNull(getClass().getResource("/exercice2/Rond.png")).toString());
    private final Image vide = new Image(Objects.requireNonNull(getClass().getResource("/exercice2/Vide.png")).toString());

    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();
        HBox hBox0 = new HBox();
        ImageView im00 = new ImageView(rond);
        Separator sep00 = new Separator();
        sep00.setOrientation(Orientation.VERTICAL);
        ImageView im01 = new ImageView(croix);
        Separator sep01 = new Separator();
        sep01.setOrientation(Orientation.VERTICAL);
        ImageView im02 = new ImageView(croix);
        Separator sep1 = new Separator();
        hBox0.getChildren().addAll(im00, sep00, im01, sep01, im02);
        root.getChildren().addAll(hBox0, sep1);

        HBox hBox1 = new HBox();
        ImageView im10 = new ImageView(rond);
        Separator sep10 = new Separator();
        sep10.setOrientation(Orientation.VERTICAL);
        ImageView im11 = new ImageView(rond);
        Separator sep11 = new Separator();
        sep11.setOrientation(Orientation.VERTICAL);
        ImageView im12 = new ImageView(rond);
        Separator sep2 = new Separator();
        hBox1.getChildren().addAll(im10, sep10, im11, sep11, im12);
        root.getChildren().addAll(hBox1, sep2);

        HBox hBox2 = new HBox();
        ImageView im20 = new ImageView(vide);
        Separator sep20 = new Separator();
        sep20.setOrientation(Orientation.VERTICAL);
        ImageView im21 = new ImageView(vide);
        Separator sep21 = new Separator();
        sep21.setOrientation(Orientation.VERTICAL);
        ImageView im22 = new ImageView(croix);
        hBox2.getChildren().addAll(im20, sep20, im21, sep21, im22);
        root.getChildren().add(hBox2);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
