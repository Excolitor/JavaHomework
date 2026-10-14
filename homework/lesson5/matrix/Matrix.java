package homework.lesson5.matrix;

import homework.lesson5.random.Random_litter;

import java.util.Random;

public class Matrix {

    private Object[][] matrix = new Object[10][10];

    public Object[][] getMatrix() {
        return matrix;
    }

    public Matrix () {
        matrixSetValue();
    }

    private  void  matrixSetValue() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (((i * 10 + j) % 3) == 0) {
                    matrix[i][j] = Random_litter.doubleGenerator();
                }
                else if (random.nextInt(2) == 0) {
                    matrix[i][j] = Random_litter.nameGenerator();
                }
                else {
                    matrix[i][j] = Random_litter.doubleGenerator();
                }
            }

        }
    }
}
