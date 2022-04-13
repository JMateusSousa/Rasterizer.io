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
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class LineSegmentController implements Initializable {

    @FXML public Pane paneLine;
    @FXML public ChoiceBox resolutionBox;
    @FXML public TextField linePointOne;
    @FXML public TextField linePointTwo;

    double width = 0;
    int resolution = 0;
//    List<List<Double>> list =  List.of(
//            List.of(0.5, 0.5),
//            List.of(1.5, 0.5),
//            List.of(2.5, 0.5),
//            List.of(3.5, 1.5),
//            List.of(4.5, 1.5),
//            List.of(5.5, 1.5),
//            List.of(6.5, 2.5),
//            List.of(7.5, 2.5),
//            List.of(8.5, 2.5)
//            );
    List<List<Double>> list = new ArrayList<List<Double>>();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        resolutionBox.getItems().add("50x50");
        resolutionBox.getItems().add("30x30");
        resolutionBox.getItems().add("10x10");
    }

    @FXML
    private void plotGraphics() {
        int index = resolutionBox.getSelectionModel().getSelectedIndex();
        if (index == 0) {
            resolution = 50;
        } else if (index == 1) {
            resolution = 30;
        } else {
            resolution = 10;
        }
        ArrayList<Integer> points = getPoints();

        Line line = new Line();

        Initialization lineInitialization = new Initialization();
        com.example.computergraphics.Line lineAbstrated = new com.example.computergraphics.Line();

        line.setStartX(points.get(0) * width);
        lineInitialization.setX1(points.get(0));

        line.setStartY(points.get(1) * width);
        lineInitialization.setY1(points.get(1));

        line.setEndX(points.get(2) * width);
        lineInitialization.setX2(points.get(2));

        line.setEndY(points.get(3) * width);
        lineInitialization.setY2(points.get(3));

        lineInitialization.initialize();
        lineAbstrated.copyData(lineInitialization);
        lineAbstrated.createLine();

        this.list = lineAbstrated.getCoord();
        System.out.println(list);
        this.paneLine.getChildren().add(makeGrid(resolution));

        line.setStroke(Color.WHITE);
        line.setStrokeWidth(3);
        paneLine.getChildren().add(line);
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

        ArrayList<Integer> pointsCorrect = new ArrayList<>();

        for(int i = 0; i < points.size(); i++) {
            pointsCorrect.add(Integer.valueOf(points.get(i) * resolution/10));
        }
        return pointsCorrect;
    }

    public Pane makeGrid(int n) {

        width = paneLine.getPrefWidth()/n;
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

                if (list.contains(Arrays.asList((rec[i][j].getX() + width / 2) / width,
                            (rec[i][j].getY() + width / 2) / width))) {
                        rec[i][j].setFill(Color.GREEN);
                    }
                p.getChildren().add(rec[i][j]);
            }
        }

        return p;
    }
}