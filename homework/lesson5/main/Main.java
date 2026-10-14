package homework.lesson5.main;

import homework.lesson5.matrix.Matrix;
import homework.lesson5.random.Random_litter;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        Object[][] array = matrix.getMatrix();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
