package fr.amu.iut.exercice13;

import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

@SuppressWarnings("Duplicates")
public class MainPersonnes  {

    private static ObservableList<Personne> lesPersonnes;

    private static ListChangeListener<Personne> unChangementListener;

    public static void main(String[] args) {

        lesPersonnes = FXCollections.observableArrayList();

        unChangementListener = change -> {
            while (change.next()) {
                if (change.wasAdded()) {
                    for (Personne addedPerson : change.getAddedSubList()) {
                        System.out.println("Added: " + addedPerson.getNom());
                    }
                }
                if (change.wasRemoved()) {
                    for (Personne removedPerson : change.getRemoved()) {
                        System.out.println("Removed: " + removedPerson.getNom());
                    }
                }
                if (change.wasUpdated()) {
                    for (int i = change.getFrom(); i < change.getTo(); i++) {
                        Personne updatedPerson = lesPersonnes.get(i);
                        System.out.println(updatedPerson.getNom() + " a maintenant " + updatedPerson.getAge() + " ans");
                    }
                }
            }
        };

        lesPersonnes.addListener(unChangementListener);

        question1();
        question2();
        question3();
        question5();
    }

    public static void question1() {
        Personne pierre = new Personne("Pierre", 20);
        Personne paul = new Personne("Paul", 40);
        Personne jacques = new Personne("Jacques", 60);
        lesPersonnes.add(pierre);
        lesPersonnes.add(paul);
        lesPersonnes.add(jacques);
    }

    public static void question2() {
        Personne pierre = new Personne("Pierre", 20);
        Personne paul = new Personne("Paul", 40);
        Personne jacques = new Personne("Jacques", 60);
        lesPersonnes.add(pierre);
        lesPersonnes.add(paul);
        lesPersonnes.add(jacques);
        lesPersonnes.remove(paul);
    }

    public static void question3() {
        Personne pierre = new Personne("Pierre", 20);
        Personne paul = new Personne("Paul", 40);
        Personne jacques = new Personne("Jacques", 60);
        lesPersonnes.add(pierre);
        lesPersonnes.add(paul);
        lesPersonnes.add(jacques);
        paul.setAge(5);
    }

    public static void question5() {
        Personne pierre = new Personne("Pierre", 20);
        Personne paul = new Personne("Paul", 40);
        Personne jacques = new Personne("Jacques", 60);
        lesPersonnes.addAll(pierre, paul, jacques);
        for (Personne p : lesPersonnes)
            p.setAge(p.getAge()+10);
        lesPersonnes.removeAll(paul, pierre);
    }
}

