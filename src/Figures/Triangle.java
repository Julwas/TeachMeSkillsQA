package Figures;

public class Triangle extends Figure {
    int a;
    int b;
    int h;

    public Triangle(String nameFigure, int a, int b, int h){
        super (nameFigure);
    }

    @Override
    double figureArea() {
        int pp = (a + b + h) / 2;
        double s = Math.sqrt (pp* (pp - a) * (pp - b) * (pp - h));
        return s;
    }

    @Override
    double getfigurePerimeter() {
        double p = a + b + h;
        return p;
    }
}
