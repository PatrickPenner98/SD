package com.example.pokememory;

import javafx.animation.AnimationTimer;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class View {

    public static final int GROESSE_FELD = 100;

    private final Stage stage;

    private final Button[][] buttons;

    private final Model model;

    private long waitStart;

    public View(Model model, Stage stage) {
        this.model = model;
        this.stage = stage;
        GridPane gridPane = new GridPane();
        buttons = new Button[Model.ANZAHLZEILEN][Model.ANZAHLSPALTEN];
        for (int i = 0; i < Model.ANZAHLZEILEN; i++) {
            for (int j = 0; j < Model.ANZAHLSPALTEN; j++) {
                Button button = new Button();
                buttons[i][j] = button;
                button.setMinSize(GROESSE_FELD, GROESSE_FELD);
                gridPane.add(button, j, i);
            }
        }
        Scene scene = new Scene(gridPane);
        stage.setTitle("Paw Patrol");
        stage.setScene(scene);
        stage.setResizable(false);
        AnimationTimer animationTimer = new AnimationTimer() {
            public void handle(long now) {
                update(now);
            }
        };
        animationTimer.start();
    }

    public void update(long now)
    {
        if (now >= waitStart && now < waitStart + 1e9) return;
        for (int i = 0; i < Model.ANZAHLZEILEN; i++)
        {
            for (int j = 0; j < Model.ANZAHLSPALTEN; j++)
            {
                buttons[i][j].setBackground(getBackground(i,j));
            }
        }
        if (model.getAnzahlVorlaeufigAufgedeckt() == 2) {
            if (!model.aktuellesPaarPruefen())
            {
                waitStart = now;
            }
        }
    }

    public Background getBackground(int i, int j)
    {
        Image image = null;
        try {
            if (model.istAufgedeckt(i, j)) {
                int pokeIndex = model.getZahl(i, j);
                image = new Image(getClass().getResource("pawpatrol" + pokeIndex + ".png").toURI().toString(), View.GROESSE_FELD, View.GROESSE_FELD, true, true);
            } else {
                image = new Image(this.getClass().getResource("cover.png").toURI().toString(), View.GROESSE_FELD, View.GROESSE_FELD, true, true);
            }
        }
        catch (Exception e) {}
        return new Background(new BackgroundImage(image,null,null,null,null));
    }

    public Stage getStage()
    {
        return stage;
    }

    public Button getButton(int i, int j)
    {
        return buttons[i][j];
    }
}
