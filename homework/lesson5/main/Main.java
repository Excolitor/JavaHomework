package homework.lesson5.main;

import homework.lesson5.matrix.Matrix;
public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        System.out.println("Исходная матрица:");
        matrix.printMatrix();
        System.out.println("\nСравнение диагоналей:");
        matrix.compareDiagonals();
        Object[] diagonals = matrix.fillDiagonalArray();
        System.out.println("\nОбработка диагоналей:");
        matrix.processDiagonalArray(diagonals);
    }
}