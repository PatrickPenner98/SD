package org.example.sortieralgorithmen;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class HelloController {
    @FXML
    private TextField txtRandom;
    @FXML
    private TextField txtUpperLimit;
    @FXML
    private Label lblErgebnis;

    @FXML
    private RadioButton optBubbleSort;

    @FXML
    private RadioButton optInsertionSort;

    @FXML
    private RadioButton optMergeSort;

    @FXML
    private RadioButton optQuickSort;

    @FXML
    private RadioButton optSelectionSort;


    long array[];
    boolean sorted;

    public void actGenerate(ActionEvent actionEvent) {
        int numbers = Integer.parseInt(txtRandom.getText());
        long limit = Long.parseLong(txtUpperLimit.getText());
        array = SortingAlgorithms.GenerateRandomNumbers(numbers,limit);
        sorted = false;
    }

    public void actSort(ActionEvent actionEvent) {
        if (sorted)
        {
            lblErgebnis.setText("Der Array wurde bereits sortiert.");
            return;
        }

        //Zeitmessung Start: Sortierer
        long timeStart, timeEnd;

        if (this.optBubbleSort.isSelected()) {
            timeStart = System.currentTimeMillis();
            SortingAlgorithms.bubbleSort(this.array);
            timeEnd = System.currentTimeMillis();
            sorted = true;
        }
        else if (this.optSelectionSort.isSelected()) {
            timeStart = System.currentTimeMillis();
            SortingAlgorithms.selectionSort(this.array);
            timeEnd = System.currentTimeMillis();
            sorted = true;
        }
        else if (this.optInsertionSort.isSelected()) {
            timeStart = System.currentTimeMillis();
            SortingAlgorithms.insertionSort(this.array);
            timeEnd = System.currentTimeMillis();
            sorted = true;
        }
        else if (this.optQuickSort.isSelected()) {
            timeStart = System.currentTimeMillis();
            SortingAlgorithms.quickSort(this.array);
            timeEnd = System.currentTimeMillis();
            sorted = true;
        }
        else if (this.optMergeSort.isSelected()) {
            timeStart = System.currentTimeMillis();
            SortingAlgorithms.mergeSort(this.array);
            timeEnd = System.currentTimeMillis();
            sorted = true;
        }
        else
        {
            this.lblErgebnis.setText("Bitte wählen Sie ein Sortierverfahren aus!");
            return;
        }

        //Zeitmessung Ende: Sortierer
        if (SortingAlgorithms.isArraySorted(array)) {
            lblErgebnis.setText("Sortierer Dauer: " + (timeEnd - timeStart) + " Millisek. für "
                    + array.length + " Elemente");
        }
        else
        {
            lblErgebnis.setText("Die Sortierung hat nicht geklappt. :-( Bitte Debuggen!");
        }

    }

}