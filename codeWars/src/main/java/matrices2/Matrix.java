package matrices2;

import java.util.Arrays;

public class Matrix {

    public Matrix(double[][] elements) throws IllegalArgumentException{
        if(elements.length == 0 || elements[0].length == 0){
            throw new IllegalArgumentException();
        }


    }

    public Matrix(int rows, int cols, double... elements) {
        // TODO: Write constructor
    }

    public double[][] toArray() {
        return null;
    }

    public Matrix transpose() {
        return null;
    }

    public Matrix add(Matrix m2) {
        return null;
    }

    public Matrix multiply(Matrix i) {
        return null;
    }

    public Matrix multiply(double i) {
        return null;
    }
}