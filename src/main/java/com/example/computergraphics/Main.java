package com.example.computergraphics;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

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

}


class Line {
    private Fragment frag = new Fragment();
    private List<Double> aux = new ArrayList<Double>();
    private Coordinates coordinates = new Coordinates();
    private double x, x1, x2, dx;
    private double y, y1, y2, dy;
    private double b, m;


    public void createLine() {
        frag.createFragment(x, y);
        coordinates.addToList(frag);

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
            //condição em que é criada uma linha vertical
            if (dx == 0) {
                while (x < y2) {
                    x++;
                    this.x = x;
                    y = (m * x) + b;
                    this.y = y;
                    frag.createFragment(y, x);
                    frag.setYp(y2);
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
        this.dx = x2 - x1;
        this.dy = y2 - y1;

        if (dx == 0) {
            this.m = 0;
        } else {
            this.m = dy / dx;
        }

        this.b = y - m*x;
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


        lineInitialization.setX1(0);
        lineInitialization.setY1(0);
        lineInitialization.setX2(9);
        lineInitialization.setY2(3);

        lineInitialization.initialize();

        line.copyData(lineInitialization);

        //line.createLine(lineInitialization.getX(), lineInitialization.getY());
        line.createLine();

        System.out.println(line.getCoord());

    }
}
