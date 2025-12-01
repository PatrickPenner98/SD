package com.example.pokememory;

import javafx.event.ActionEvent;

public class Controller {

    private final Model model;

    private final View view;

    public Controller(Model model, View view)
    {
        this.model = model;
        this.view = view;
        for (int i = 0; i < Model.ANZAHLZEILEN; i++)
        {
            for (int j = 0; j < Model.ANZAHLSPALTEN; j++)
            {
                final int i_final = i, j_final = j;
                view.getButton(i, j).setOnAction((ActionEvent _) -> model.aufdecken(i_final, j_final));
            }
        }
        view.getStage().show();
    }
}