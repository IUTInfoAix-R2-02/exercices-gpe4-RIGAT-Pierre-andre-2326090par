package fr.amu.iut.exercice2;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Separator;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.Random;

public class TicTacToe extends Application {

    ImageView rond = new ImageView("exercice2/Rond.png");
    ImageView croix = new ImageView("exercice2/Croix.png");
    ImageView vide = new ImageView("exercice2/Vide.png");
    Separator sepH = new Separator();
    Separator sepV = new Separator();
    Random rdm = new Random();

    @Override
    public void start(Stage primaryStage) {
        sepV.setOrientation(Orientation.VERTICAL);
        GridPane grille = new GridPane();

        for (int i = 0; i < 3; ++i){
            grille.add(nextForme(), i, 0);
            for (int j = 1; j < 2; ++j){
                grille.add(new Separator(), i, j);
                grille.add(nextForme(), i, j);
            }
            if (i < 3) {
                Separator sep = new Separator();
                sep.setOrientation(Orientation.VERTICAL);
                grille.add(sep, ++i, 0);
            }
        }

        Scene scene = new Scene(grille);
        primaryStage.setScene(scene);
        //primaryStage.setResizable(false);
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.show();
    }

    private ImageView nextForme(){
        return switch (rdm.nextInt(3)) {
            case 0 -> rond;
            case 1 -> croix;
            default -> vide;
        };
    }

    public static void main(String[] args) {
        launch(args);
    }
}
