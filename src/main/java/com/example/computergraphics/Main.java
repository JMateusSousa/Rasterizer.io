package com.example.computergraphics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Triangle {
    private Fragment frag = new Fragment();
    private Coordinates coordinates1 = new Coordinates();
    private Coordinates coordinates2 = new Coordinates();
    private Coordinates coordinates3 = new Coordinates();
    private Coordinates triangleCoordinates = new Coordinates();
    private double x1, y1, x2, y2, x3, y3;

    public void createTriangle() {
        Initialization lineInitialization = new Initialization();
        Line line1 = new Line();
        Line line2 = new Line();
        Line line3 = new Line();

        lineInitialization.setX1(x1);
        lineInitialization.setY1(y1);
        lineInitialization.setX2(x2);
        lineInitialization.setY2(y2);
        lineInitialization.initialize();

        line1.copyData(lineInitialization);
        line1.createLine();

        lineInitialization.setX1(x1);
        lineInitialization.setY1(y1);
        lineInitialization.setX2(x3);
        lineInitialization.setY2(y3);
        lineInitialization.initialize();

        line2.copyData(lineInitialization);
        line2.createLine();

        lineInitialization.setX1(x2);
        lineInitialization.setY1(y2);
        lineInitialization.setX2(x3);
        lineInitialization.setY2(y3);
        lineInitialization.initialize();

        line3.copyData(lineInitialization);
        line3.createLine();


        triangleCoordinates.addList(line1.getCoord());
        triangleCoordinates.addList(line2.getCoord());
        triangleCoordinates.addList(line3.getCoord());

        System.out.println(triangleCoordinates.getList());

    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public double getX3() {
        return x3;
    }

    public void setX3(double x3) {
        this.x3 = x3;
    }

    public double getY3() {
        return y3;
    }

    public void setY3(double y3) {
        this.y3 = y3;
    }
}

class Square {
    private Fragment frag = new Fragment();
    private Coordinates coordinates1 = new Coordinates();
    private Coordinates coordinates2 = new Coordinates();
    private Coordinates coordinates3 = new Coordinates();
    private Coordinates coordinates4 = new Coordinates();
    public Coordinates squareCoordinates = new Coordinates();
    private double x1, y1, x2, y2, x3, y3, x4, y4;

    /*
    coordinates1: linha horizontal inferior
    coordinates2: linha horizontal superior
    coordinates3: linha vertical esquerda
    coordinates4: linha vertical direita


                     coordinates2

                     [-----------]
                     |-----------|
    coordinates3 ->  |-----------|   <- coordinates4
                     [-----------]
                           ^
                           |
                      coordinates1
     */

    public void createSquare() {
        Initialization lineInitialization = new Initialization();
        Line line1 = new Line();
        Line line2 = new Line();
        Line line3 = new Line();
        Line line4 = new Line();

        lineInitialization.setX1(x1);
        lineInitialization.setY1(y1);
        lineInitialization.setX2(x2);
        lineInitialization.setY2(y2);
        lineInitialization.initialize();

        line1.copyData(lineInitialization);
        line1.createLine();

        lineInitialization.setX1(x1);
        lineInitialization.setY1(y1);
        lineInitialization.setX2(x4);
        lineInitialization.setY2(y4);
        lineInitialization.initialize();

        line2.copyData(lineInitialization);
        line2.createLine();

        lineInitialization.setX1(x2);
        lineInitialization.setY1(y2);
        lineInitialization.setX2(x3);
        lineInitialization.setY2(y3);
        lineInitialization.initialize();

        line3.copyData(lineInitialization);
        line3.createLine();

        lineInitialization.setX1(x3);
        lineInitialization.setY1(y3);
        lineInitialization.setX2(x4);
        lineInitialization.setY2(y4);
        lineInitialization.initialize();

        line4.copyData(lineInitialization);
        line4.createLine();


        squareCoordinates.addList(line1.getCoord());
        squareCoordinates.addList(line2.getCoord());
        squareCoordinates.addList(line3.getCoord());
        squareCoordinates.addList(line4.getCoord());

        System.out.println("pontos das retas: " + squareCoordinates.getList());
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public double getX3() {
        return x3;
    }

    public void setX3(double x3) {
        this.x3 = x3;
    }

    public double getY3() {
        return y3;
    }

    public void setY3(double y3) {
        this.y3 = y3;
    }

    public double getX4() {
        return x4;
    }

    public void setX4(double x4) {
        this.x4 = x4;
    }

    public double getY4() {
        return y4;
    }

    public void setY4(double y4) {
        this.y4 = y4;
    }
}

class Hexagon {
    private Fragment frag = new Fragment();
    private Coordinates coordinates1 = new Coordinates();
    private Coordinates coordinates2 = new Coordinates();
    private Coordinates coordinates3 = new Coordinates();
    private Coordinates coordinates4 = new Coordinates();
    private Coordinates coordinates5 = new Coordinates();
    private Coordinates coordinates6 = new Coordinates();
    private Coordinates hexagonCoordinates = new Coordinates();
    private double x1, y1, x2, y2, x3, y3, x4, y4, x5, y5, x6, y6;

    public void createHexagon() {
        Initialization lineInitialization = new Initialization();
        Line line1 = new Line();
        Line line2 = new Line();
        Line line3 = new Line();
        Line line4 = new Line();
        Line line5 = new Line();
        Line line6 = new Line();

        /*
        lineInitialization.setX1();
        lineInitialization.setY1();
        lineInitialization.setX2();
        lineInitialization.setY2();
        lineInitialization.initialize();

        line1.copyData(lineInitialization);
        line1.createLine();

        lineInitialization.setX1();
        lineInitialization.setY1();
        lineInitialization.setX2();
        lineInitialization.setY2();
        lineInitialization.initialize();

        line2.copyData(lineInitialization);
        line2.createLine();

        lineInitialization.setX1();
        lineInitialization.setY1();
        lineInitialization.setX2();
        lineInitialization.setY2();
        lineInitialization.initialize();

        line3.copyData(lineInitialization);
        line3.createLine();

        lineInitialization.setX1();
        lineInitialization.setY1();
        lineInitialization.setX2();
        lineInitialization.setY2();
        lineInitialization.initialize();

        line4.copyData(lineInitialization);
        line4.createLine();

        lineInitialization.setX1();
        lineInitialization.setY1();
        lineInitialization.setX2();
        lineInitialization.setY2();
        lineInitialization.initialize();

        line5.copyData(lineInitialization);
        line5.createLine();

        lineInitialization.setX1();
        lineInitialization.setY1();
        lineInitialization.setX2();
        lineInitialization.setY2();
        lineInitialization.initialize();

        line6.copyData(lineInitialization);
        line6.createLine();
        */



        /*
        hexagonCoordinates.addList(line1.getCoord());
        hexagonCoordinates.addList(line2.getCoord());
        hexagonCoordinates.addList(line3.getCoord());
        hexagonCoordinates.addList(line4.getCoord());
        hexagonCoordinates.addList(line5.getCoord());
        hexagonCoordinates.addList(line6.getCoord());

        System.out.println(hexagonCoordinates.getList());

        */

    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public double getX3() {
        return x3;
    }

    public void setX3(double x3) {
        this.x3 = x3;
    }

    public double getY3() {
        return y3;
    }

    public void setY3(double y3) {
        this.y3 = y3;
    }

    public double getX4() {
        return x4;
    }

    public void setX4(double x4) {
        this.x4 = x4;
    }

    public double getY4() {
        return y4;
    }

    public void setY4(double y4) {
        this.y4 = y4;
    }

    public double getX5() {
        return x5;
    }

    public void setX5(double x5) {
        this.x5 = x5;
    }

    public double getY5() {
        return y5;
    }

    public void setY5(double y5) {
        this.y5 = y5;
    }

    public double getX6() {
        return x6;
    }

    public void setX6(double x6) {
        this.x6 = x6;
    }

    public double getY6() {
        return y6;
    }

    public void setY6(double y6) {
        this.y6 = y6;
    }
}

class Fragment {
    private double xm, ym;
    private double xp, yp;

    public void createFragment(double x, double y) {
        this.xm = Math.floor(x);
        this.ym = Math.floor(y);

        this.xp = xm + 0.5;
        this.yp = ym + 0.5;
    }

    public double getXp() {
        return xp;
    }

    public double getYp() {
        return yp;
    }

    public void setXp(double Xp) {
        this.xp = xp;
    }

    public void setYp(double Yp) {
        this.yp = yp;
    }


}


class Coordinates {
    private List<List<Double>> list = new ArrayList<List<Double>>();


    public void addToList(Fragment points) {
        List<Double> aux = Arrays.asList(points.getXp(), points.getYp());
        list.add(aux);
    }

    public List getList() {
        return list;
    }

    public int getSize() {
        return list.size();
    }

    public List removeFromList(int i) {
        return list.remove(i);
    }

    public void addList(List coordinates) {
        list.add(coordinates);
    }

}

class Line {
    private Fragment frag = new Fragment();
    private List<Double> aux = new ArrayList<Double>();
    private Coordinates coordinates = new Coordinates();
    private double x, x1, x2, dx;
    private double y, y1, y2, dy;
    private double b, m;

    public void createLine() {
        // se linha na vertical
        if (dx == 0) {
            if(x != 0) {
                x--;
            }
            if(dy < 0) {
                y--;
                while (y >= y2 - 1) {
                    frag.createFragment(x, y);
                    y--;
                    this.y = y;
                    coordinates.addToList(frag);
                }
            } else {
                while (y2 >= y) {
                    frag.createFragment(x, y);
                    y++;
                    this.y = y;
                    coordinates.addToList(frag);
                }
            }
        }

        // se linha horizontal
        else if(dy == 0) {
            if(y != 0) {
                y--;
            }
            if(dx < 0) {
                x--;
                while(x >= x2 - 1) {
                    frag.createFragment(x, y);
                    x--;
                    this.x = x;
                    coordinates.addToList(frag);
                }
            } else {
                while (x2 >= x) {
                    frag.createFragment(x, y);
                    x++;
                    this.x = x;
                    coordinates.addToList(frag);
                }
            }
        } else {
            if(dx < 0) {
                dx = dx * -1;
                double aux = x;
                x = x2;
                x2 = aux;
            }
            if(dy < 0){
                dy = dy * -1;
                double aux = y;
                y = y2;
                y2 = aux;
            }

//            frag.createFragment(x, y);
//            coordinates.addToList(frag);

            if (dx > dy) {
                while (x < x2) {
                    x++;
                    this.x = x;
                    y = (m * x) + b;
                    this.y = y;
                    frag.createFragment(x, y);
                    coordinates.addToList(frag);
                }
            } else {
                while (y < y2) {
                    y++;
                    this.y = y;
                    x = (y - b) / m;
                    this.x = x;
                    frag.createFragment(x, y);
                    coordinates.addToList(frag);
                }
            }
        }

        //Gambiarra. Remove da lista o último elemento, que foi calculado desnecessariamente
        coordinates.removeFromList(coordinates.getSize() - 1);
    }

    public void copyData (Initialization copiedObject) {
        this.x = copiedObject.getX();
        this.x1 = copiedObject.getX1();
        this.x2 = copiedObject.getX2();
        this.dx = copiedObject.getDx();
        this.y = copiedObject.getY();
        this.y1 = copiedObject.getY1();
        this.y2 = copiedObject.getY2();
        this.dy = copiedObject.getDy();
        this.b = copiedObject.getB();
        this.m = copiedObject.getM();
    }

    public List getCoord() {
        return coordinates.getList();
    }
}

class Initialization {
    private double x, x1, x2, dx;
    private double y, y1, y2, dy;
    private double b, m;

    public void initialize() {
        this.x = x1;
        this.y = y1;
        this.dx = x2 - x1;
        this.dy = y2 - y1;

        this.m = dy / dx;
        this.b = y1 - (m * x1);
    }

    public void setX(double x1) {
        this.x = x1;
    }
    public void setY(double y1) {
        this.y = y1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    /*
    //Criei getters e setters pra todas as variáveis, mas alguns desses métodos são desnecessários.
    //De qualquer forma, deixarei aqui comentado.
    public void setDx(double x1, double x2) {
        this.dx = x2 - x1;
    }

    public  void setDy(double y1, double y2) {
        this.dy = y2 - y1;
    }

    public void setB(double b) {
        this.b = b;
    }
    public void setM(double m) {
        this.m = m;
    }*/

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public double getY1() {
        return y1;
    }

    public double getY2() {
        return y2;
    }

    public double getDx() {
        return dx;
    }

    public double getDy() {
        return dy;
    }

    public double getB() {
        return b;
    }

    public double getM() {
        return m;
    }
}

public class Main {

    public static void main(String[] args) {
        //testando com os pontos P1 = (0, 0) e P2 = (9, 3)
        Initialization lineInitialization = new Initialization();
        Line line = new Line();


        lineInitialization.setX1(9);
        lineInitialization.setY1(3);
        lineInitialization.setX2(0);
        lineInitialization.setY2(0);

        lineInitialization.initialize();

        line.copyData(lineInitialization);

        //line.createLine(lineInitialization.getX(), lineInitialization.getY());
        line.createLine();

        System.out.println(line.getCoord());

/*
        Triangle triangle = new Triangle();
        triangle.setX1(0);
        triangle.setY1(0);
        triangle.setX2(13);
        triangle.setY2(0);
        triangle.setX3(6);
        triangle.setY3(11);
        triangle.createTriangle();*/

//
//        Square square = new Square();
//        square.setX1(0);
//        square.setY1(0);
//        square.setX2(0);
//        square.setY2(5);
//        square.setX3(5);
//        square.setY3(5);
//        square.setX4(5);
//        square.setY4(0);
//        square.createSquare();

        /*Square square = new Hexagon();
        hexagon.setX1();
        hexagon.setY1();
        hexagon.setX2();
        hexagon.setY2();
        hexagon.setX3();
        hexagon.setY3();
        hexagon.setX4();
        hexagon.setY4();
        hexagon.setX5();
        hexagon.setY5();
        hexagon.setX6();
        hexagon.setY6();
        hexagon.createHexagon();*/
    }
}
