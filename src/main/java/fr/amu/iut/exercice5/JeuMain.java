package fr.amu.iut.exercice5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.Timer;
import java.util.TimerTask;

public class JeuMain extends Application {

    private Scene scene;
    private BorderPane root;
    private final long chrono = System.currentTimeMillis();


    @Override
    public void start(Stage primaryStage) {

        root = new BorderPane();

        //Acteurs du jeu
        Personnage pacman = new Pacman();
        Personnage fantome = new Fantome();
        Obstacle mur = new Obstacle(300, 60, 60, 300, "#582900");
        // on positionne le fantôme 20 positions vers la droite
        fantome.setLayoutX(62 * 10);
        fantome.setLayoutY(46 * 10);
        //panneau du jeu
        Pane jeu = new Pane();
        jeu.setPrefSize(640, 480);
        jeu.getChildren().add(pacman);
        jeu.getChildren().add(fantome);
        jeu.getChildren().add(mur);
        root.setCenter(jeu);
        //on construit une scene 640 * 480 pixels
        scene = new Scene(root);



        //Gestion du déplacement du personnage
        deplacer(pacman, fantome, mur);

        primaryStage.setTitle("... Pac Man ...");

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Permet de gérer les événements de type clavier, pression des touches
     * pour le j1(up,down, right, left), pour le j2( z,q,s,d)
     *
     * @param j1
     * @param j2
     */
    private void deplacer(Personnage j1, Personnage j2, Obstacle obstacle) {
        scene.setOnKeyPressed((KeyEvent event) -> {
            int j1x = (int) j1.getLayoutX();
            int j1y = (int) j1.getLayoutY();
            int j2x = (int) j2.getLayoutX();
            int j2y = (int) j2.getLayoutY();
            switch (event.getCode()) {
                case LEFT:
                    j1.deplacerAGauche();
                    break;
                case RIGHT:
                    j1.deplacerADroite(scene.getWidth());
                    break;
                case UP:
                    j1.deplacerEnHaut();
                    break;
                case DOWN:
                    j1.deplacerEnBas(scene.getHeight());
                    break;
                case Z:
                    j2.deplacerEnHaut();
                    break;
                case Q:
                    j2.deplacerAGauche();
                    break;
                case S:
                    j2.deplacerEnBas(scene.getHeight());
                    break;
                case D:
                    j2.deplacerADroite(scene.getWidth());
                    break;
            }
            if (j1.estEnCollision(obstacle)) {
                j1.setLayoutX(j1x);
                j1.setLayoutY(j1y);
            } if (j2.estEnCollision(obstacle)) {
                j2.setLayoutX(j2x);
                j2.setLayoutY(j2y);
            } if (j1.estEnCollision(j2)) {
                System.out.println("PacMan gagne");
                System.exit(0);
            } else if (System.currentTimeMillis() - chrono > 20000) {
                System.out.println("Le Fantome gagne");
                System.exit(0);
            }
        });
    }


}
