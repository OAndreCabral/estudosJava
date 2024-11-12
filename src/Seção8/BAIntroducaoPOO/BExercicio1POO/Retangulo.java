package Seção8.BAIntroducaoPOO.BExercicio1POO;

public class Retangulo {
    public double width;
    public double height;

    public double Area() {
        return width * height;
    }
    public double Perimeter() {
        return (width + height) * 2;
    }
    public double Diagonal() {
        return Math.sqrt(Math.pow(width,2) + Math.pow(height, 2));
    }

    public String toString() {
        return "Area = " + String.format("%.2f", Area())
                + "\nPerimeter:" + String.format("%.2f", Perimeter())
                + "\nDiagonal:" + String.format("%.2f", Diagonal());
    }
}
