package calculator;

import java.util.Arrays;

public class Calculator {

    public double getTotalArea(Calculable... calculable){
        double totalArea = Arrays.stream(calculable)
                .mapToDouble(Calculable::getArea)
                .sum();

        return (double) Math.round(totalArea * 100) / 100;
    }
}

interface Calculable {

    double getArea();

}

class Triangle implements Calculable {

    private final double triangleBase;
    private final double triangleHeight;

    public Triangle(double triangleBase, double triangleHeight) {
        this.triangleBase = triangleBase;
        this.triangleHeight = triangleHeight;
    }

    @Override
    public double getArea() {
        return triangleHeight/2 * triangleBase;
    }
}

class Rectangle implements Calculable {

    private final double height;
    private final double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }
}

class Square implements Calculable {

    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}

class Circle implements Calculable {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }
}