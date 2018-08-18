package recursion1.triangle;

public class Triangle {

    public static int triangle(int rows) {
        if(rows == 0) return 0;
        else return rows + triangle(rows - 1);
    }
}
