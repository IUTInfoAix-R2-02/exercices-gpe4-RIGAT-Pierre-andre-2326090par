package fr.amu.iut.exercice6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Objects;

import static javafx.application.Platform.exit;

public class IHMPendu extends Application {

    Image gagne = new Image(Objects.requireNonNull(IHMPendu.class.getResource("/exercice6/penduWin.png")).toString());
    Image perdu = new Image(Objects.requireNonNull(IHMPendu.class.getResource("/exercice6/pendu0.png")).toString());
    Image etat1 = new Image(Objects.requireNonNull(IHMPendu.class.getResource("/exercice6/pendu1.png")).toString());
    Image etat2 = new Image(Objects.requireNonNull(IHMPendu.class.getResource("/exercice6/pendu2.png")).toString());
    Image etat3 = new Image(Objects.requireNonNull(IHMPendu.class.getResource("/exercice6/pendu3.png")).toString());
    Image etat4 = new Image(Objects.requireNonNull(IHMPendu.class.getResource("/exercice6/pendu4.png")).toString());
    Image etat5 = new Image(Objects.requireNonNull(IHMPendu.class.getResource("/exercice6/pendu5.png")).toString());
    Image etat6 = new Image(Objects.requireNonNull(IHMPendu.class.getResource("/exercice6/pendu6.png")).toString());
    Image etat7 = new Image(Objects.requireNonNull(IHMPendu.class.getResource("/exercice6/pendu7.png")).toString());

    private final ImageView pendu = new ImageView(etat7);

    private int vie = 7;
    private final Label nbVie =  new Label("Nombre de vies : " + vie);

    private final Dico dico = new Dico();
    private String motADeviner = dico.getMot();
    private String lettresTrouvee = "";

    private String motStr = motADeviner.replaceAll("[abcdefghijklmnopqrstuvwxyz]", "*");
    private final Label mot = new Label(motStr);

    private final HBox voyelle = new HBox();
    private final HBox consonne1 = new HBox();
    private final HBox consonne2 = new HBox();

    private final Button a = new Button("a");
    private final Button b = new Button("b");
    private final Button c = new Button("c");
    private final Button d = new Button("d");
    private final Button e = new Button("e");
    private final Button f = new Button("f");
    private final Button g = new Button("g");
    private final Button h = new Button("h");
    private final Button i = new Button("i");
    private final Button j = new Button("j");
    private final Button k = new Button("k");
    private final Button l = new Button("l");
    private final Button m = new Button("m");
    private final Button n = new Button("n");
    private final Button o = new Button("o");
    private final Button p = new Button("p");
    private final Button q = new Button("q");
    private final Button r = new Button("r");
    private final Button s = new Button("s");
    private final Button t = new Button("t");
    private final Button u = new Button("u");
    private final Button v = new Button("v");
    private final Button w = new Button("w");
    private final Button x = new Button("x");
    private final Button y = new Button("y");
    private final Button z = new Button("z");

    private final Button rejoue = new Button("Rejouer");

    private final VBox vBox = new VBox();

    //Scene scene = new Scene(vBox);

    private void aButton() {
        if (a.getText().equals("a")) {
            a.setText("");
            lettresTrouvee = lettresTrouvee + 'a';
            joue();
        }
    }

    private void bButton() {
        if (b.getText().equals("b")) {
            b.setText("");
            lettresTrouvee = lettresTrouvee + 'b';
            joue();
        }
    }

    private void cButton() {
        if (c.getText().equals("c")) {
            c.setText("");
            lettresTrouvee = lettresTrouvee + 'c';
            joue();
        }
    }

    private void dButton() {
        if (d.getText().equals("d")) {
            d.setText("");
            lettresTrouvee = lettresTrouvee + 'd';
            joue();
        }
    }

    private void eButton() {
        if (e.getText().equals("e")) {
            e.setText("");
            lettresTrouvee = lettresTrouvee + 'e';
            joue();
        }
    }

    private void fButton() {
        if (f.getText().equals("f")) {
            f.setText("");
            lettresTrouvee = lettresTrouvee + 'f';
            joue();
        }
    }

    private void gButton() {
        if (g.getText().equals("g")) {
            g.setText("");
            lettresTrouvee = lettresTrouvee + 'g';
            joue();
        }
    }

    private void hButton() {
        if (h.getText().equals("h")) {
            h.setText("");
            lettresTrouvee = lettresTrouvee + 'h';
            joue();
        }
    }

    private void iButton() {
        if (i.getText().equals("i")) {
            i.setText("");
            lettresTrouvee = lettresTrouvee + 'i';
            joue();
        }
    }

    private void jButton() {
        if (j.getText().equals("j")) {
            j.setText("");
            lettresTrouvee = lettresTrouvee + 'j';
            joue();
        }
    }

    private void kButton() {
        if (k.getText().equals("k")) {
            k.setText("");
            lettresTrouvee = lettresTrouvee + 'k';
            joue();
        }
    }

    private void lButton() {
        if (l.getText().equals("l")) {
            l.setText("");
            lettresTrouvee = lettresTrouvee + 'l';
            joue();
        }
    }

    private void mButton() {
        if (m.getText().equals("m")) {
            m.setText("");
            lettresTrouvee = lettresTrouvee + 'm';
            joue();
        }
    }

    private void nButton() {
        if (n.getText().equals("n")) {
            n.setText("");
            lettresTrouvee = lettresTrouvee + 'n';
            joue();
        }
    }

    private void oButton() {
        if (o.getText().equals("o")) {
            o.setText("");
            lettresTrouvee = lettresTrouvee + 'o';
            joue();
        }
    }

    private void pButton() {
        if (p.getText().equals("p")) {
            p.setText("");
            lettresTrouvee = lettresTrouvee + 'p';
            joue();
        }
    }

    private void qButton() {
        if (q.getText().equals("q")) {
            q.setText("");
            lettresTrouvee = lettresTrouvee + 'q';
            joue();
        }
    }

    private void rButton() {
        if (r.getText().equals("r")) {
            r.setText("");
            lettresTrouvee = lettresTrouvee + 'r';
            joue();
        }
    }

    private void sButton() {
        if (s.getText().equals("s")) {
            s.setText("");
            lettresTrouvee = lettresTrouvee + 's';
            joue();
        }
    }

    private void tButton() {
        if (t.getText().equals("t")) {
            t.setText("");
            lettresTrouvee = lettresTrouvee + 't';
            joue();
        }
    }

    private void uButton() {
        if (u.getText().equals("u")) {
            u.setText("");
            lettresTrouvee = lettresTrouvee + 'u';
            joue();
        }
    }

    private void vButton() {
        if (v.getText().equals("v")) {
            v.setText("");
            lettresTrouvee = lettresTrouvee + 'v';
            joue();
        }
    }

    private void wButton() {
        if (w.getText().equals("w")) {
            w.setText("");
            lettresTrouvee = lettresTrouvee + 'w';
            joue();
        }
    }

    private void xButton() {
        if (x.getText().equals("x")) {
            x.setText("");
            lettresTrouvee = lettresTrouvee + 'x';
            joue();
        }
    }

    private void yButton() {
        if (y.getText().equals("y")) {
            y.setText("");
            lettresTrouvee = lettresTrouvee + 'y';
            joue();
        }
    }

    private void zButton() {
        if (z.getText().equals("z")) {
            z.setText("");
            lettresTrouvee = lettresTrouvee + 'z';
            joue();
        }
    }

    private void restart(){
        motADeviner = dico.getMot();
        motStr = motADeviner.replaceAll("[abcdefghijklmnopqrstuvwxyz]", "*");
        vie = 7;
        a.setText("a");
        b.setText("b");
        c.setText("c");
        d.setText("d");
        e.setText("e");
        f.setText("f");
        g.setText("g");
        h.setText("h");
        i.setText("i");
        j.setText("j");
        k.setText("k");
        l.setText("l");
        m.setText("m");
        n.setText("n");
        o.setText("o");
        p.setText("p");
        q.setText("q");
        r.setText("r");
        s.setText("s");
        t.setText("t");
        u.setText("u");
        v.setText("v");
        w.setText("w");
        x.setText("x");
        y.setText("y");
        z.setText("z");
        updateScreen();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Jeu du pendu");
        primaryStage.setWidth(500);
        primaryStage.setHeight(550);

        BorderPane root = new BorderPane();

        a.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> aButton());
        b.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> bButton());
        c.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> cButton());
        d.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> dButton());
        e.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> eButton());
        f.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> fButton());
        g.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> gButton());
        h.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> hButton());
        i.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> iButton());
        j.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> jButton());
        k.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> kButton());
        l.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> lButton());
        m.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> mButton());
        n.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> nButton());
        o.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> oButton());
        p.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> pButton());
        q.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> qButton());
        r.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> rButton());
        s.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> sButton());
        t.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> tButton());
        u.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> uButton());
        v.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> vButton());
        w.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> wButton());
        x.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> xButton());
        y.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> yButton());
        z.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> zButton());

        nbVie.setText("Nombre de vies : " + vie);
        mot.setText(motStr);

        voyelle.getChildren().addAll(
                a, e, i, o, u, y
        );

        consonne1.getChildren().addAll(
                b, c, d, f, g, h, j, k, l, m
        );
        consonne2.getChildren().addAll(
                n, p, q, r, s, t, v, w, x, z
        );

        rejoue.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> restart());

        vBox.getChildren().addAll(
                pendu,
                nbVie,
                mot,
                voyelle,
                consonne1,
                consonne2,
                rejoue
        );

        root.setCenter(vBox);

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void updateVie() {
        switch (vie) {
            case 0: pendu.setImage(perdu); break;
            case 1: pendu.setImage(etat1); break;
            case 2: pendu.setImage(etat2); break;
            case 3: pendu.setImage(etat3); break;
            case 4: pendu.setImage(etat4); break;
            case 5: pendu.setImage(etat5); break;
            case 6: pendu.setImage(etat6); break;
            case 7: pendu.setImage(etat7); break;
        }
    }

    private void joue(){
        char c = lettresTrouvee.charAt(lettresTrouvee.length() - 1);
        ArrayList<Integer> list = dico.getPositions(c, motADeviner);
        if (!list.isEmpty()) {
            char[] charArray = motStr.toCharArray();
            for (int i = 0; i < list.size(); i++) {
                int elem = list.get(i);
                charArray[elem] = c;
            }
            motStr = new String(charArray);
        } else --vie;
        updateScreen();
        gameover();
    }

    private void updateScreen(){
        nbVie.setText("Nombre de vies : " + vie);
        mot.setText(motStr);

        updateVie();
    }

    private void gameover() {
        if (motStr.equals(motADeviner)) {
            pendu.setImage(gagne);
            System.out.println("gagné !");
        }
        if (vie <= 0) {
            pendu.setImage(perdu);
            System.out.println("perdu, le mot c'était " + motADeviner);
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
