package com.example.computergraphics;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TabPane;
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

public class PolygonController implements Initializable {

    @FXML public Pane panePolygons;
    @FXML public ChoiceBox resolutionBox;
    @FXML public TextField trianglePointOne;
    @FXML public TextField trianglePointTwo;
    @FXML public TextField trianglePointThree;
    @FXML public TabPane tabPane;
    @FXML public TextField squarePointOne;
    @FXML public TextField squarePointTwo;
    @FXML public TextField squarePointThree;
    @FXML public TextField squarePointFour;
    @FXML public TextField hexagonPointOne;
    @FXML public TextField hexagonPointTwo;
    @FXML public TextField hexagonPointThree;
    @FXML public TextField hexagonPointFour;
    @FXML public TextField hexagonPointFive;
    @FXML public TextField hexagonPointSix;


    double width = 0;
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
        int resolution = 0;
        int pointNumber = 3;
        ArrayList<Integer> points;

        if(tabPane.getSelectionModel().getSelectedIndex() == 0) {
           points = getTrianglePoints();
        } else if(tabPane.getSelectionModel().getSelectedIndex() == 1) {
            points = getSquarePoints();
            pointNumber = 4;
        } else {
            points = getHexagonPoints();
            pointNumber = 6;
        }
        int index = resolutionBox.getSelectionModel().getSelectedIndex();
        if (index == 0) {
            resolution = 50;
        } else if (index == 1) {
            resolution = 30;
        } else {
            resolution = 10;
        }

        ArrayList<Line> line = new ArrayList<Line>();
        for(int i = 0; i < pointNumber; i++){
            line.add(new Line());
        }

        for(int k = 0,  i = 0; i < pointNumber; k++, i++) {
            line.get(i).setStartX(points.get(k) * width);
            line.get(i).setStartY(points.get(k + 1) * width);
            line.get(i).setEndX(points.get(k + 2) * width);
            line.get(i).setEndY(points.get(k + 3) * width);

            k = k + 1;
        }
        this.panePolygons.getChildren().add(makeGrid(resolution));

        for(int i = 0; i < pointNumber; i++) {
            line.get(i).setStroke(Color.WHITE);
            line.get(i).setStrokeWidth(6);
            panePolygons.getChildren().add(line.get(i));
        }
    }

    private ArrayList<Integer> getHexagonPoints() {
        ArrayList<Integer> points = new ArrayList<>();

        String number = hexagonPointOne.getText();
        String numberOne = number.substring(0, number.indexOf(","));
        String numberTwo = number.substring(number.indexOf(",") + 1);
        points.add(Integer.valueOf(numberOne));
        points.add(Integer.valueOf(numberTwo));

        number = hexagonPointTwo.getText();
        numberOne = number.substring(0, number.indexOf(","));
        numberTwo = number.substring(number.indexOf(",") + 1);
        points.add(Integer.valueOf(numberOne));
        points.add(Integer.valueOf(numberTwo));

        number = hexagonPointThree.getText();
        numberOne = number.substring(0, number.indexOf(","));
        numberTwo = number.substring(number.indexOf(",") + 1);
        points.add(Integer.valueOf(numberOne));
        points.add(Integer.valueOf(numberTwo));

        number = hexagonPointFour.getText();
        numberOne = number.substring(0, number.indexOf(","));
        numberTwo = number.substring(number.indexOf(",") + 1);
        points.add(Integer.valueOf(numberOne));
        points.add(Integer.valueOf(numberTwo));

        number = hexagonPointFive.getText();
        numberOne = number.substring(0, number.indexOf(","));
        numberTwo = number.substring(number.indexOf(",") + 1);
        points.add(Integer.valueOf(numberOne));
        points.add(Integer.valueOf(numberTwo));

        number = hexagonPointSix.getText();
        numberOne = number.substring(0, number.indexOf(","));
        numberTwo = number.substring(number.indexOf(",") + 1);
        points.add(Integer.valueOf(numberOne));
        points.add(Integer.valueOf(numberTwo));

        points.add(points.get(0));
        points.add(points.get(1));

        System.out.println(points);
        return points;
    }

    private ArrayList<Integer> getSquarePoints() {
        ArrayList<Integer> points = new ArrayList<>();

        String number = squarePointOne.getText();
        String numberOne = number.substring(0, number.indexOf(","));
        String numberTwo = number.substring(number.indexOf(",") + 1);
        points.add(Integer.valueOf(numberOne));
        points.add(Integer.valueOf(numberTwo));

        number = squarePointTwo.getText();
        numberOne = number.substring(0, number.indexOf(","));
        numberTwo = number.substring(number.indexOf(",") + 1);
        points.add(Integer.valueOf(numberOne));
        points.add(Integer.valueOf(numberTwo));

        number = squarePointThree.getText();
        numberOne = number.substring(0, number.indexOf(","));
        numberTwo = number.substring(number.indexOf(",") + 1);
        points.add(Integer.valueOf(numberOne));
        points.add(Integer.valueOf(numberTwo));

        number = squarePointFour.getText();
        numberOne = number.substring(0, number.indexOf(","));
        numberTwo = number.substring(number.indexOf(",") + 1);
        points.add(Integer.valueOf(numberOne));
        points.add(Integer.valueOf(numberTwo));

        points.add(points.get(0));
        points.add(points.get(1));

        System.out.println(points);
        return points;
    }

    private ArrayList<Integer> getTrianglePoints() {
        ArrayList<Integer> points = new ArrayList<>();

        String number = trianglePointOne.getText();
        String numberOne = number.substring(0, number.indexOf(","));
        String numberTwo = number.substring(number.indexOf(",") + 1);
        points.add(Integer.valueOf(numberOne));
        points.add(Integer.valueOf(numberTwo));

        number = trianglePointTwo.getText();
        numberOne = number.substring(0, number.indexOf(","));
        numberTwo = number.substring(number.indexOf(",") + 1);
        points.add(Integer.valueOf(numberOne));
        points.add(Integer.valueOf(numberTwo));

        number = trianglePointThree.getText();
        numberOne = number.substring(0, number.indexOf(","));
        numberTwo = number.substring(number.indexOf(",") + 1);
        points.add(Integer.valueOf(numberOne));
        points.add(Integer.valueOf(numberTwo));

        points.add(points.get(0));
        points.add(points.get(1));

        System.out.println(points);

        return points;
    }

    public Pane makeGrid(int n) {

        width = panePolygons.getPrefWidth() / n;
        Pane p = new Pane();
        p.setPrefSize(panePolygons.getPrefWidth(), panePolygons.getPrefHeight());

        Rectangle[][] rec = new Rectangle[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
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