package matrices1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MatrixTest {

    @Test
    public void shouldReturnNullValuesWhenNoValuesAreSet(){
        int rows = 10;
        int cols = 10;
        Matrix<Integer> matrix = new Matrix<>(rows, cols);
        Assert.assertNull(matrix.get(rows, cols));
    }

    @Test
    public void shouldReturnCorrectValueWithGetAfterSet(){
        int rows = 5;
        int cols = 5;
        Matrix<Integer> matrix = new Matrix<>(rows, cols);
        matrix.set(4, 3, 4);
        assertEquals(new Integer(4), matrix.get(4, 3));
    }

    @Test
    public void shouldReturnCorrectRowValuesWithGetAfterSetRow(){
        int rows = 5;
        int cols = 5;
        Matrix<Integer> matrix = new Matrix<>(rows, cols);
        Integer[] ints = new Integer[]{1, 2, 3, 4, 5};
        matrix.setRow(4, ints);
        assertEquals(ints[0], matrix.get(4, 1));
        assertEquals(ints[1], matrix.get(4, 2));
        assertEquals(ints[2], matrix.get(4, 3));
        assertEquals(ints[3], matrix.get(4, 4));
        assertEquals(ints[4], matrix.get(4, 5));
    }

    @Test
    public void shouldReturnCorrectValuesWithGetAfterSwap(){
        int rows = 5;
        int cols = 5;
        Matrix<Integer> matrix = new Matrix<>(rows, cols);
        matrix.set(1, 2, 2);
        matrix.set(3, 4, 4);
        matrix.swap(1, 2, 3,4);
        assertEquals(new Integer(4), matrix.get(1, 2));
        assertEquals(new Integer(2), matrix.get(3, 4));
    }

    @Test
    public void testInteger() {
        Matrix<Integer> m = new Matrix<>(3, 3);
        m.setRow(1, new Integer[] { 2, 9, 5 });
        m.setRow(2, new Integer[] { 3, 0, 8 });
        m.setRow(3, new Integer[] { 6, 1, 7 });

        assertEquals(8, m.get(2, 3).intValue());
        assertEquals(6, m.get(3, 1).intValue());
        assertEquals(9, m.get(1, 2).intValue());

        m.set(2, 3, -4);
        m.set(1, 1, m.get(1, 2) * m.get(2, 1));
        m.set(3, 2, m.get(3, 2) + m.get(3, 3) / 3);

        assertEquals(-4, m.get(2, 3).intValue());
        assertEquals(27, m.get(1, 1).intValue());
        assertEquals(3, m.get(3, 2).intValue());
    }
}