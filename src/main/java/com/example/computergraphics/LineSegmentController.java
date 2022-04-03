package com.example.computergraphics;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class LineSegmentController implements Initializable {

    @FXML public Pane paneLine;
    @FXML public ChoiceBox resolutionBox;
    @FXML public TextField linePointOne;
    @FXML public TextField linePointTwo;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        resolutionBox.getItems().add("50x50");
        resolutionBox.getItems().add("30x30");
        resolutionBox.getItems().add("10x10");
    }

    @FXML
    private void plotGraphics() {
        int resolution = 0;
        ArrayList<Integer> points = getPoints();
        int index = resolutionBox.getSelectionModel().getSelectedIndex();
        if (index == 0) {
            resolution = 50;
        } else if (index == 1) {
            resolution = 30;
        } else {
            resolution = 10;
        }
        this.paneLine.getChildren().add(makeGrid(resolution));

        Line redLine = new Line();
        redLine.setStartX(points.get(0));
        redLine.setStartY(points.get(1));
        redLine.setEndX(points.get(2));
        redLine.setEndY(points.get(3));
        redLine.setStroke(Color.WHITE);
        paneLine.getChildren().add(redLine);
    }

    private ArrayList<Integer> getPoints() {
        ArrayList<Integer> points = new ArrayList<>();
        String number = linePointOne.getText();
        String numberOne = number.substring(0, number.indexOf(","));
        String numberTwo = number.substring(number.indexOf(",") + 1);
        points.add(Integer.valueOf(numberOne));
        points.add(Integer.valueOf(numberTwo));

        number = linePointTwo.getText();
        numberOne = number.substring(0, number.indexOf(","));
        numberTwo = number.substring(number.indexOf(",") + 1);
        points.add(Integer.valueOf(numberOne));
        points.add(Integer.valueOf(numberTwo));

        return points;
    }

    public Pane makeGrid(int n) {

        double width = paneLine.getPrefWidth()/n;
        Pane p = new Pane();
        p.setPrefSize(paneLine.getPrefWidth(), paneLine.getPrefHeight());

        Rectangle[][] rec = new Rectangle [n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                rec[i][j] = new Rectangle();
                rec[i][j].setX(i * width);
                rec[i][j].setY(j * width);
                rec[i][j].setWidth(width);
                rec[i][j].setHeight(width);
                rec[i][j].setFill(Color.ORANGE);
                rec[i][j].setStroke(Color.BLACK);
                p.getChildren().add(rec[i][j]);
            }
        }

        return p;
    }
}