package fr.amu.iut.exercice12;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.control.Button;

public class CustomButton extends Button {

    private String couleur;
    private IntegerProperty nbClics;

    public CustomButton(String texte, String couleur) {
        super(texte);
        this.couleur = couleur;
        this.nbClics = new SimpleIntegerProperty(0);
    }

    public final IntegerProperty nbClicsProperty() {
        return nbClics;
    }

    public final int getNbClics() {
        return nbClics.get();
    }

    public final void setNbClics(int nbClics) {
        this.nbClics.set(nbClics);
    }

    public String getCouleur() {
        return couleur;
    }
}