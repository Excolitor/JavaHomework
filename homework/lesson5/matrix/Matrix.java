package homework.lesson5.matrix;
import homework.lesson5.random.Random_litter;
import java.util.Random;

public class Matrix {
    private final Object[][] matrix = new Object[10][10];
    public Matrix() {
        matrixSetValue();
    }
    public Object[][] getMatrix() {
        return matrix;
    }

    private void matrixSetValue() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if ((i * 10 + j) % 3 == 0) {
                    matrix[i][j] = Random_litter.doubleGenerator();
                } else if (random.nextInt(2) == 0) {
                    matrix[i][j] = Random_litter.nameGenerator();
                } else {
                    matrix[i][j] = Random_litter.doubleGenerator();
                }
            }
        }
    }

    public void printMatrix() {
        for (Object[] row : matrix) {
            for (Object element : row) {
                System.out.printf("%-10s", element);
            }
            System.out.println();
        }
    }

    public void compareDiagonals() {
        boolean equals = true;
        for (int i = 0; i < 10; i++) {
            if (!matrix[i][i].equals(matrix[i][9 - i])) {
                equals = false;
                break;
            }
        }
        if (equals) {
            System.out.println("Диагонали совпадают");
        } else {
            System.out.println("Диагонали различаются");
        }
    }

    public Object[] fillDiagonalArray() {
        Object[] diagonals = new Object[20];
        for (int i = 0; i < 10; i++) {
            diagonals[i] = matrix[i][i];
            diagonals[i + 10] = matrix[i][9 - i];
        }
        return diagonals;
    }

    public void processDiagonalArray(Object[] diagonals) {
        StringBuilder strings = new StringBuilder();
        int[] roundedNumbers = new int[20];
        int numberIndex = 0;
        for (Object element : diagonals) {
            if (element instanceof String) {
                String part = ((String) element).substring(1, 4);
                if (strings.length() > 0) {
                    strings.append(",");
                }
                strings.append(part);
            } else if (element instanceof Double) {
                double number = (Double) element;
                int integerPart = (int) number;
                double fractionalPart = number - integerPart;
                if (fractionalPart >= 0.7) {
                    integerPart++;
                }
                roundedNumbers[numberIndex] = integerPart;
                numberIndex++;
            }
        }
        System.out.println("Фрагменты строк: " + strings);
        System.out.print("Округлённые числа: ");
        for (int i = 0; i < numberIndex; i++) {
            if (i > 0) {
                System.out.print("_");
            }
            System.out.print(roundedNumbers[i]);
        }
        System.out.println();
    }
}