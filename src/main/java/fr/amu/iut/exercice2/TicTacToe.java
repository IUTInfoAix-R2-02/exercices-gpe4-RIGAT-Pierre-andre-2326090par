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

    Random rdm = new Random();

    @Override
    public void start(Stage primaryStage) {
        GridPane grille = new GridPane();

        // version "à la main"
/*
        grille.add(nextForme(), 0, 0);
        grille.add(newSepV(), 1, 0);
        grille.add(nextForme(), 2, 0);
        grille.add(newSepV(), 3, 0);
        grille.add(nextForme(), 4, 0);
        grille.add(newSepH(), 0, 1);
        grille.add(newSepH(), 1, 1);
        grille.add(newSepH(), 2, 1);
        grille.add(newSepH(), 3, 1);
        grille.add(newSepH(), 4, 1);
        grille.add(nextForme(), 0, 2);
        grille.add(newSepV(), 1, 2);
        grille.add(nextForme(), 2, 2);
        grille.add(newSepV(), 3, 2);
        grille.add(nextForme(), 4, 2);
        grille.add(newSepH(), 0, 3);
        grille.add(newSepH(), 1, 3);
        grille.add(newSepH(), 2, 3);
        grille.add(newSepH(), 3, 3);
        grille.add(newSepH(), 4, 3);
        grille.add(nextForme(), 0, 4);
        grille.add(newSepV(), 1, 4);
        grille.add(nextForme(), 2, 4);
        grille.add(newSepV(), 3, 4);
        grille.add(nextForme(), 4, 4);
*/
        // version plus optimisé

        for (int i = 0; i < 5;) {
            grille.add(nextForme(), 0, i);
            for (int j = 1; j < 5;) {
                grille.add(newSepV(), j++, i);
                grille.add(nextForme(), j++, i);
            }
            if (i < 4) {
                grille.add(newSepH(), 0, ++i);
                for (int j = 1; j < 5;) {
                    grille.add(newSepH(), j++, i);
                }
            }
            ++i;
        }


        Scene scene = new Scene(grille);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.show();
    }

    private ImageView nextForme(){
        return switch (rdm.nextInt(3)) {
            case 0 -> new ImageView("exercice2/Rond.png");
            case 1 -> new ImageView("exercice2/Croix.png");
            default -> new ImageView("exercice2/Vide.png");
        };
    }

    private Separator newSepH(){
        return new Separator(Orientation.HORIZONTAL);
    }

    private Separator newSepV(){
        return new Separator(Orientation.VERTICAL);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
